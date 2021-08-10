package estoque.Usuario;


import estoque.ListaEstatica;

public class UsuarioServico implements IUsuarioServico {
	
	public UsuarioServico() {
		//Cria o primeiro usuário como admin
		if (ListaEstatica.getUsuarios().isEmpty()) {
			Usuario usuarioAdmin = new Usuario("admin", "admin", true);
			criarUsuario(usuarioAdmin);
		}
	}
	
	@Override
	public String criarUsuario(Usuario usuario) {
		int codigo = ListaEstatica.getUsuarios().size() +1;
		usuario.setCodigo(codigo);
		ListaEstatica.getUsuarios().add(usuario);
		return usuario.getNome();
	}
	
	@Override
	public String editarUsuario(Usuario usuario) {
		
		for (int i = 0; i <= ListaEstatica.getUsuarios().size(); i++) {
			
			if (ListaEstatica.getUsuarios().get(i).getCodigo() == usuario.getCodigo()) {
				ListaEstatica.getUsuarios().set(i, usuario);
				return usuario.getNome();
			}
		}
		
		return null;
	}
		
	@Override
	public Usuario selecionarUsuario(String nome) {
		
		for (Usuario item : ListaEstatica.getUsuarios()) {
			
			if (item.getNome().equals(nome)) {
				
				return item;
			}
		}
		
		return null;
	}
	
	@Override
	public String deletarUsuario(int codigo) {
		
		for (int i = 0; i <= ListaEstatica.getUsuarios().size(); i++) {
	
			if (ListaEstatica.getUsuarios().get(i).getCodigo() == codigo) {
				String usuario = ListaEstatica.getUsuarios().get(i).getNome();
				ListaEstatica.getUsuarios().remove(i);
				return usuario;
			}
		}
		
		return null;
	}
	
}
