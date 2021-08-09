package estoque;


public class RelatorioEstoque implements Relatorio {

	@Override
	public void visualizar() {
		
		ListaEstatica.itens.toString();
		
	}

	@Override
	public String toString() {
		return "Relatorio de Estoque";
	}

}
