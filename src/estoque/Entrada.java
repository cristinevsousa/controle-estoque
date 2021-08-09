package estoque;

import java.text.ParseException;
import java.util.Date;

public class Entrada { 
	
	private int codigo;
	private Visualizar visualizar = new Visualizar();
	private ItemServico itemServico = new ItemServico();

	public void entradaItem() throws ParseException {
			//desenvolvendo entrada de itens, corrigir loop
		while (true) {
			
			Item itemTemp = visualizar.infoAdicionarCompraItem(); 
			
			String nomeItem = itemTemp.getNome();
			
			if (nomeItem.equals("0")) {break;}
		        
			float qtd = itemTemp.getQtd();
			float valorUnidade = itemTemp.getValorUnidade();		
			//busca o item cadastrado
			Item item = itemServico.selecionarItem(nomeItem);
			
			if (item != null) {
				
				float soma = item.getQtd() + qtd;
				item.setQtd(soma);
				item.setValorUnidade(valorUnidade);
				//altera as informações do item cadastrado, para registrar o ultimo fornecedor e a ultima data da compra
				itemServico.editarItem(item);
				
			} else if (item == null){
				visualizar.msgErro();
				visualizar.infoAdicionarCompraItem();
			}
		}
		//desenvolvendo registro do fornecedor e data da compra
		Item infoTemp = visualizar.infoCompra();
		
		if (infoTemp != null) {
		
		String fornecedor = infoTemp.getFornecedor();						
		Date dataEntrada = infoTemp.getDataEntrada();
			
		infoTemp.setDataEntrada(dataEntrada);
		infoTemp.setFornecedor(fornecedor);
		setCodigoEntrada(getCodigoEntrada());
		
		} else {
			visualizar.msgErro();
		}
	
	}
	
	
	public void valorTotal() {
		
	}
	
	public void pagamento() {
		
	}

	public int getCodigoEntrada() {
		return codigo;
	}

	public void setCodigoEntrada(int codigoEntrada) {
		this.codigo = ListaEstatica.entradas.size() +1;
	}

}


