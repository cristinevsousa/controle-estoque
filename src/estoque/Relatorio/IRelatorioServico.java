package estoque.Relatorio;


public abstract interface IRelatorioServico {
	//desenvolver interface para o relat�rio padr�o que pode vir a receber outros relat�rios
	//a serem implementados futuramente: ex.: sa�das, entradas, itens por grupo, validade, etc.
	//ordem de compra pode migrar para tipo de relatorio.
	public void visualizar();
}
