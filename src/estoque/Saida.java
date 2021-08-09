package estoque;

public class Saida {
	private int codigo;
	private Visualizar visualizar = new Visualizar();
	private ItemServico itemServico = new ItemServico();
	
	public void saidaItem() {
		
	}
	
	public void valorTotal() {
		
	}
	
	public void pagamento() {
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = ListaEstatica.saidas.size() +1;
	}
	
	
}
