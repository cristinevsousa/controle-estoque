package estoque;

import java.util.Date;

public interface ITransacao {
	
	public void getDataVencimento();
	
	public void setDataVencimento(Date dataRecebimento);
	
	public boolean isDebito();
	
	public boolean isDebito(boolean isDebito);
		
	public void pagarBoleto();
		
	public void receberBoleto();
	
	public void pagarCartao();
	
	public void receberCartao();
	
	public void pagarDinheiro();
	
	public void receberDinheiro();
		
}

