package estoque;


public interface IRelatorio {
	//desenvolver interface para o relatório padrão que pode vir a receber outros relatórios
	//a serem implementados futuramente: ex.: saídas, entradas, itens por grupo, validade, etc.
	//ordem de compra pode migrar para tipo de relatorio.
	public void visualizar();
}
