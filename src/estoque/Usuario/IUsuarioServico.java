package estoque.Usuario;

public interface IUsuarioServico {
	
	String criarUsuario(Usuario usuario);
	String editarUsuario(Usuario usuario);
	Usuario selecionarUsuario(String nome);
	String deletarUsuario(int codigo);

}
