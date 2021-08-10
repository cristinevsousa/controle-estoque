package estoque.Item;

import java.text.ParseException;
import java.util.Date;

import estoque.Visualizar;

public class SaidaItemServico implements ISaidaItemServico {
	private Visualizar visualizar = new Visualizar();
	private ItemServico itemServico = new ItemServico();
	
	public void saida() throws ParseException {
		
		Date infoTemp = visualizar.infoSaida();
		
		while (true) {
			
			Item itemTemp = visualizar.infoAdicionarSaidaItem(); 
			if (itemTemp == null) {break;}
			
			String nomeItem = itemTemp.getNome();
			
			System.out.println("Nome item - saída: " + nomeItem);
		        
			float qtd = itemTemp.getQtd();		
			//busca o item cadastrado
			Item item = itemServico.selecionarItem(nomeItem);
			
			if (item != null) {
				
				float subtracao = item.getQtd() - qtd;
				item.setQtd(subtracao);
				item.setDataEntrada(infoTemp);
				
				itemServico.editarItem(item);
				
			} else if (item == null){
				visualizar.msgErro();
				visualizar.infoAdicionarSaidaItem();
			}
		}
	}
	
}
