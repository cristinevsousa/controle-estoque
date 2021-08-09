package estoque;

public class Usuario {
	protected int codigo;
	protected String nome;
	protected String senha;
	protected boolean admin;

	public Usuario(String nome, String senha, boolean admin) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.admin = admin;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
