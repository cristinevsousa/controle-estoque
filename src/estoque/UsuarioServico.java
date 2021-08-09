package estoque;


import java.util.ArrayList;
import java.util.List;

public class UsuarioServico {
	
	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public UsuarioServico() {
		//Cria o primeiro usuário como admin
		if (usuarios.isEmpty()) {
			Usuario usuarioAdmin = new Usuario("admin", "admin", true);
			criarUsuario(usuarioAdmin);
		}
	}
	
	public String criarUsuario(Usuario usuario) {
		int codigo = usuarios.size() +1;
		usuario.setCodigo(codigo);
		usuarios.add(usuario);
		return usuario.nome;
	}
	
	public String editarUsuario(Usuario usuario) {
		
		for (int i = 0; i <= usuarios.size(); i++) {
			
			if (usuarios.get(i).codigo == usuario.codigo) {
				usuarios.set(i, usuario);
				return usuario.nome;
			}
		}
		
		return null;
	}
		
	public Usuario selecionarUsuario(String nome) {
		
		for (Usuario item : usuarios) {
			
			if (item.nome.equals(nome)) {
				
				return item;
			}
		}
		
		return null;
	}
	public String deletarUsuario(int codigo) {
		
		for (int i = 0; i <= usuarios.size(); i++) {
	
			if (usuarios.get(i).codigo == codigo) {
				String usuario = usuarios.get(i).nome;
				usuarios.remove(i);
				return usuario;
			}
		}
		
		return null;
	}
	
}
