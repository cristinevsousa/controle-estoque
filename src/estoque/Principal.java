package estoque;


import java.text.ParseException;

/*Informações gerais sobre o funcionamento do sistema:
 * 
 * Usuário inicial cadastrado: admin, senha: admin 
 * Primeiro se realiza o cadastro do item em opções de item, opção (1) do menu, para que o sistema busque o mesmo na entrada
 * Depois se insere o fornecedor e quantidade nos itens cadastrados através da opção (2) do menu
 * 
 * Algumas funcionalidades não foram implementadas ainda
 * 
 */
 
public class Principal {

	public static void main(String[] args) throws ParseException {
		Iniciar iniciar = new Iniciar();
		iniciar.login();
	}
}