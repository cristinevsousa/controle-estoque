package estoque.Usuario;

public class Usuario {
	private int codigo;
	private String nome;
	private String senha;
	private boolean admin;

	public Usuario(String nome, String senha, boolean admin) {
		super();
		this.setNome(nome);
		this.setSenha(senha);
		this.setAdmin(admin);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
}
