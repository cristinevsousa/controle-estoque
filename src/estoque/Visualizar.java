package estoque;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Visualizar {
	
	ItemServico itemServico = new ItemServico();
	private Scanner scanner = new Scanner(System.in);
	
	public void verMenuAlterar() {
		System.out.println("*********************************************");
		System.out.println("Escolha uma das opções a seguir:");
		System.out.println("(1) Cadastrar");
		System.out.println("(2) Editar");
		System.out.println("(3) Remover");
		System.out.println("(4) Voltar ao Menu principal");
		System.out.println("*********************************************");
	}
	
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
	
	public String solicitarNome() {
		System.out.println("Digite o nome de usuario");
		String nome = scanner.nextLine();
		return nome;
	}
	
	public Usuario solicitarDadosUsuario() {
		System.out.println("Digite o nome de usuario e senha");
		String nome = scanner.nextLine();
		String senha = scanner.nextLine();
		return new Usuario(nome, senha, false);
	}
	
	public String solicitarItem() {
		System.out.println("Digite o nome do item");
		String nome = scanner.nextLine();
		return nome;
	}
	
	public Item solicitarDadosItem() {
		System.out.println("Digite o NOME, UNIDADE DE MEDIDA, DESCRIÇÃO, ESTOQUE MÍNIMO e ESTOQUE MÁXIMO do item");
		System.out.println("Formato das UNIDADES DE MEDIDA: und, kg, litro ou caixa");
		
		String nome = scanner.next();
		String undMedida = scanner.next();
		String desc = scanner.next();
		float qtdMinima = scanner.nextFloat();
		float qtdMaxima = scanner.nextFloat();
		
		return new Item(undMedida, nome, desc, qtdMinima, qtdMaxima);
	}
	
	public Item infoAdicionarCompraItem()  {
		
		System.out.println("*********************************************");
		System.out.println("              Entrada de item");
		System.out.println("*********************************************");
		
		System.out.println("Informe o nome, quantidade e valor do produto seguidos de [ENTER]: ");
		System.out.println("Para finalizar a entrada e registrar data e fornecedor digite [0 + ENTER]: ");
			
		String nome = scanner.next();
		float qtd = scanner.nextFloat();
		float valorUnidade = scanner.nextFloat();
		
		Item itemEntrada = new Item(nome);

		itemEntrada.setQtd(qtd);
		itemEntrada.setValorUnidade(valorUnidade);
		return itemEntrada;
		
	}
	
	public Item infoCompra() throws ParseException {
		
		System.out.println("Nome do fornecedor: ");
		String fornecedor = scanner.nextLine();
		
		System.out.println("Data da compra: (dd/MM/aaaa)");
		String dataEntrada = scanner.nextLine();
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataEntrada);
		
		Item itemEntrada = new Item(fornecedor, data);

		itemEntrada.setFornecedor(fornecedor);
		itemEntrada.setDataEntrada(data);
		return itemEntrada;
	}
	
	public void msgErro() {
		System.out.println("Objeto não encontrado!");
	}

}
