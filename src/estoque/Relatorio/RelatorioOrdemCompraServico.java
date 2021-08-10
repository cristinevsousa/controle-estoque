package estoque.Relatorio;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Scanner;

import estoque.ListaEstatica;
import estoque.Item.Item;

public class RelatorioOrdemCompraServico implements IRelatorioServico{
	
	private Scanner scanner = new Scanner(System.in);

	@Override
	public void visualizar() {
		
		System.out.println("*********************************************");
		System.out.println("              Ordem de Compra");
		System.out.println("*********************************************");
		
		for (Item item : ListaEstatica.getItens()) {
			
			int codigo = item.getCodigo();
			String nome = item.getNome();
			float estoqueMinimo = item.getQtdMinima();
			float estoqueMaximo = item.getQtdMaxima();
			float quantidadeEstoque = item.getQtd();
			String unidadeMedida = item.getUndMedida();	
			float valorUnidade = item.getValorUnidade();
			String fornecedor = item.getFornecedor();			
			Date ultimaCompra = item.getDataEntrada();
			
			if (estoqueMinimo >= quantidadeEstoque) {
				
				float qtdCompra = estoqueMaximo - quantidadeEstoque;
				String mensagem = MessageFormat.format("Código: {0} - Nome: {1} - Estoque máximo: {2} - "
						+ "Estoque mínimo: {3} - Quantidade em estoque: {4} - Unidade de medida: {5} - "
						+ "Valor: {6} - Último Fornecedor: {7} - Última compra: {8} - Quantidade de compra sugerida: {9}", codigo, nome, estoqueMaximo,
						estoqueMinimo, quantidadeEstoque, unidadeMedida, valorUnidade, fornecedor, ultimaCompra, qtdCompra);
				
				System.out.println(mensagem);
			}
			
		}
		
		System.out.println("Digite qualquer tecla para voltar ao menu");
		scanner.next();
	}

}
