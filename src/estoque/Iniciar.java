package estoque;

import java.text.ParseException;
import java.util.Scanner;

public class Iniciar {
	
	private Scanner scanner = new Scanner(System.in);
	private UsuarioServico usuarioServico = new UsuarioServico();
	private ItemServico itemServico = new ItemServico();
	private Visualizar visualizar = new Visualizar();
	
	public void login() throws ParseException {
			Usuario usuarioLogin = visualizar.solicitarDadosUsuario();			
			
			Usuario usuario = usuarioServico.selecionarUsuario(usuarioLogin.nome);
			
			if (usuario != null && usuario.senha.equals(usuarioLogin.senha)) {
				menu();
			} else {
				System.out.println("Usuario ou senha inválidos!");
			} 
	}
	
	public void menu() throws ParseException {
		visualizar.verMenu();
		int opcao = scanner.nextInt();
		switch (opcao) {
		case 1: 
			visualizar.verMenuAlterar();
			int opcao1 = scanner.nextInt();
			//cria item
			if (opcao1 == 1) {
				String retorno = criarItem();
				if(retorno != null)
				{
					System.out.println("Item " + retorno + " cadastrado com sucesso!");
				}
				else
				{
					System.out.println("Não foi possível cadastrar o item " + retorno);
				}
			//edita item
			} else if(opcao1 == 2){
				String nome = visualizar.solicitarItem();
				
				Item item = itemServico.selecionarItem(nome);
				
				Item itemEditar = visualizar.solicitarDadosItem();
				
				item.setUndMedida(itemEditar.getUndMedida());
				item.setNome(itemEditar.getNome());
				item.setDesc(itemEditar.getDesc());
				item.setQtdMinima(itemEditar.getQtdMinima());
				item.setQtdMaxima(itemEditar.getQtdMaxima());
				
				String retorno = itemServico.editarItem(item);
				
				if(retorno != null)
				{
					System.out.println("Item " + retorno + " editado com sucesso!");
				}
				else
				{
					System.out.println("Não foi possível editar o Item " + retorno);
				}
				//remove item
			} else if(opcao1 == 3){
				String nome = visualizar.solicitarItem();
				
				Item item = itemServico.selecionarItem(nome);
				
				String retorno = itemServico.deletarItem(item.getCodigo());
				
				if(retorno != null)
				{
					System.out.println("Item " + retorno + " removido com sucesso!");
				}
				else
				{
					System.out.println("Não foi possível remover o item " + retorno);
				}
				//volta ao menu anterior
			} else if(opcao1 == 4){
				visualizar.verMenu();
				
			}else {
				System.out.println("Opção inválida!");
				visualizar.verMenuAlterar();
			}
			break;
		case 2: 
			//entrada de itens
			Entrada entrada = new Entrada();
			entrada.entradaItem();
			break;
		case 3:
			//saida de itens
			Saida saida = new Saida();
			saida.saidaItem();
			break;
		case 4:
			//Relatorios
			RelatorioEstoque relatorioEstoque = new RelatorioEstoque();
			relatorioEstoque.visualizar();
			break;
		case 5:
			//ordem de compra
			itemServico.ordemCompra();
			break;
		case 6:
			//opcoes de usuário
			visualizar.verMenuAlterar();
			int opcao6 = scanner.nextInt();
			if (opcao6 == 1) {
				String retorno = criarUsuario();
				if(retorno != null)
				{
					System.out.println("Usuário " + retorno + " cadastrado com sucesso!");
				}
				else
				{
					System.out.println("Não foi possível cadastrar o usuário " + retorno);
				}
				
			} else if(opcao6 == 2){
				String nome = visualizar.solicitarNome();
				Usuario usuarioEditar = visualizar.solicitarDadosUsuario();
				
				Usuario usuario = usuarioServico.selecionarUsuario(nome);
				
				usuario.nome = usuarioEditar.nome;
				usuario.senha = usuarioEditar.senha;
				
				String retorno = usuarioServico.editarUsuario(usuario);
				
				if(retorno != null)
				{
					System.out.println("Usuário " + retorno + " editado com sucesso!");
				}
				else
				{
					System.out.println("Não foi possível editar o usuário " + retorno);
				}
				
			} else if(opcao6 == 3){
				String nome = visualizar.solicitarNome();
				
				Usuario usuario = usuarioServico.selecionarUsuario(nome);
				
				String retorno = usuarioServico.deletarUsuario(usuario.codigo);
				
				if(retorno != null)
				{
					System.out.println("Usuário " + retorno + " removido com sucesso!");
				}
				else
				{
					System.out.println("Não foi possível remover o usuário " + retorno);
				}
				
			} else if(opcao6 == 4){
				visualizar.verMenu();
				
			}else {
				System.out.println("Opção inválida!");
				visualizar.verMenuAlterar();
			}
			break;
		case 7:
			System.out.println("Programa encerrado!");
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		menu();
	}
	
	public String criarUsuario() {
		Usuario usuarioNovo = visualizar.solicitarDadosUsuario();
		return usuarioServico.criarUsuario(usuarioNovo);
	}
	
	public String criarItem(){
		Item novoItem = visualizar.solicitarDadosItem();
		return itemServico.criarItem(novoItem);
	}

}
