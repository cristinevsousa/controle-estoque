package estoque.Item;

import java.text.ParseException;
import java.util.Date;

import estoque.Visualizar;

public class EntradaItemServico implements IEntradaItemServico { 
	
	private Visualizar visualizar = new Visualizar();
	private ItemServico itemServico = new ItemServico();

	public void entrada() throws ParseException {
		
		Item infoTemp = visualizar.infoCompra();
		
		String fornecedor = infoTemp.getFornecedor();						
		Date dataEntrada = infoTemp.getDataEntrada();
			
		infoTemp.setDataEntrada(dataEntrada);
		infoTemp.setFornecedor(fornecedor);
				
		while (true) {
			
			Item itemTemp = visualizar.infoAdicionarCompraItem(); 
			if (itemTemp == null) {break;}
			
			String nomeItem = itemTemp.getNome();
			
			System.out.println("Nome item - entrada: " + nomeItem);
		        
			float qtd = itemTemp.getQtd();
			float valorUnidade = itemTemp.getValorUnidade();		
			//busca o item cadastrado
			Item item = itemServico.selecionarItem(nomeItem);
			
			if (item != null) {
				
				float soma = item.getQtd() + qtd;
				item.setQtd(soma);
				item.setValorUnidade(valorUnidade);
				item.setDataEntrada(infoTemp.getDataEntrada());
				item.setFornecedor(infoTemp.getFornecedor());
				
				//altera as informações do item cadastrado, para registrar o ultimo fornecedor e a ultima data da compra
				itemServico.editarItem(item);
				
			} else if (item == null){
				visualizar.msgErro();
				visualizar.infoAdicionarCompraItem();
			}
		}
	
	}

}


