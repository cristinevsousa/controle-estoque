package estoque;


import java.text.ParseException;

/*Informa��es gerais sobre o funcionamento do sistema:
 * 
 * Usu�rio inicial cadastrado: admin, senha: admin 
 * Primeiro se realiza o cadastro do item em op��es de item, op��o (1) do menu, para que o sistema busque o mesmo na entrada
 * Depois se insere o fornecedor e quantidade nos itens cadastrados atrav�s da op��o (2) do menu
 * 
 * Algumas funcionalidades n�o foram implementadas ainda
 * 
 */
 
public class Principal {

	public static void main(String[] args) throws ParseException {
		Iniciar iniciar = new Iniciar();
		iniciar.login();
	}
}