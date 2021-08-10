package estoque;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import estoque.Item.IItemServico;
import estoque.Item.Item;
import estoque.Item.ItemServico;
import estoque.Usuario.Usuario;

public class Visualizar {
	
	IItemServico itemServico = new ItemServico();
	private Scanner scanner = new Scanner(System.in);
	
	public void verMenu() {
		System.out.println("*********************************************");
		System.out.println("Escolha uma das opções a seguir:");
		System.out.println("(1) Opções de item");
		System.out.println("(2) Entrada de estoque");
		System.out.println("(3) Saída de estoque");
		System.out.println("(4) Relatórios");
		System.out.println("(5) Ordem de compra");
		System.out.println("(6) Opções de usuário");
		System.out.println("(7) Sair");
		System.out.println("*********************************************");
	}
	
	public void verMenuAlterar() {
		System.out.println("*********************************************");
		System.out.println("Escolha uma das opções a seguir:");
		System.out.println("(1) Cadastrar");
		System.out.println("(2) Editar");
		System.out.println("(3) Remover");
		System.out.println("(4) Voltar ao Menu principal");
		System.out.println("*********************************************");
	}
	
	public String solicitarNome() {
		System.out.println("Digite o nome de usuario");
		String nome = scanner.next();
		return nome;
	}
	
	public Usuario solicitarDadosUsuario() {
		System.out.println("Digite o nome de usuario e senha");
		String nome = scanner.next();
		String senha = scanner.next();
		return new Usuario(nome, senha, false);
	}
	
	public String solicitarItem() {
		System.out.println("Digite o nome do item");
		String nome = scanner.next();
		return nome;
	}
	
	public Item solicitarDadosItem() {
		
		System.out.println("Digite o nome: ");
		String nome = scanner.next();
		System.out.println("Digite a unidade de medida (und, kg, litro ou caixa): ");
		String undMedida = scanner.next();
		System.out.println("Digite a descrição: ");
		String desc = scanner.next();
		System.out.println("Digite o estoque mínimo: ");
		float qtdMinima = scanner.nextFloat();
		System.out.println("Digite o estoque máximo: ");
		float qtdMaxima = scanner.nextFloat();
		
		return new Item(undMedida, nome, desc, qtdMinima, qtdMaxima);
	}
	
	public Item infoAdicionarCompraItem()  {
		
		System.out.println("*********************************************");
		System.out.println("              Entrada de itens");
		System.out.println("*********************************************");
		
		System.out.println("Para entrada de itens digite (1), para sair digite (0): ");
		int opcao = scanner.nextInt();
		
		if (opcao == 0) {
			return null;
		}
		
		System.out.println("*Digite a seguir os itens do mesmo fornecedor*");
		
		System.out.println("Informe o nome: ");
		String nome = scanner.next();
		System.out.println("Informe a quantidade: ");
		float qtd = scanner.nextFloat();
		System.out.println("Informe o valor do produto: ");
		float valorUnidade = scanner.nextFloat();
		
		Item itemEntrada = new Item(nome);

		itemEntrada.setQtd(qtd);
		itemEntrada.setValorUnidade(valorUnidade);
		return itemEntrada;
		
	}
	
	public Item infoCompra() throws ParseException {
		
		System.out.println("Informe o fornecedor da compra: ");
		String fornecedor = scanner.next();
		
		System.out.println("Informe a data da compra: (dd/MM/aaaa)");
		String dataEntrada = scanner.next();
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataEntrada);
		
		return new Item(fornecedor, data);
	}
	
	public void msgErro() {
		System.out.println("Objeto não encontrado!");
	}
	
	public Item infoAdicionarSaidaItem()  {
		
		System.out.println("*********************************************");
		System.out.println("              Saída de itens");
		System.out.println("*********************************************");
		
		System.out.println("Para saída de itens digite (1), para sair digite (0): ");
		int opcao = scanner.nextInt();
		
		if (opcao == 0) {
			return null;
		}
		
		System.out.println("*Digite a seguir os itens retirados do estoque*");		
		
		System.out.println("Informe o nome: ");
		String nome = scanner.next();
		System.out.println("Informe a quantidade: ");
		float qtd = scanner.nextFloat();
		
		Item itemSaida = new Item(nome);

		itemSaida.setQtd(qtd);
		return itemSaida;		
	}
	
public Date infoSaida() throws ParseException {
		
		System.out.println("Informe a data da venda/saída: (dd/MM/aaaa)");
		String dataEntrada = scanner.next();
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataEntrada);
		
		return data;
	}

}
