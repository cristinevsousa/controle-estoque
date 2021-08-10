package estoque.Item;

import java.util.Date;

public class Item {
	
	private int codigo;
	private String undMedida;
	private String nome;
	private String desc;
	private float qtdMinima;
	private float qtdMaxima;
	private Date dataEntrada;
	private float qtd;
	private float valorUnidade;
	private String fornecedor;
		
	public Item(String undMedida, String nome, String desc, float qtdMinima, float qtdMaxima) {
		super();
		this.undMedida = undMedida;
		this.nome = nome;
		this.desc = desc;
		this.qtdMinima = qtdMinima;
		this.qtdMaxima = qtdMaxima;
	}
	
	public Item(String fornecedor, Date dataEntrada) {
		this.fornecedor = fornecedor;
		this.dataEntrada = dataEntrada;
	}
	
	public Item(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getUndMedida() {
		return undMedida;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setUndMedida(String undMedida) {
		this.undMedida = undMedida;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(float qtdMinima) {
		this.qtdMinima = qtdMinima;
	}

	public float getQtdMaxima() {
		return qtdMaxima;
	}

	public void setQtdMaxima(float qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public float getQtd() {
		return qtd;
	}
	public void setQtd(float qtd) {
		this.qtd = qtd;
	}
	public float getValorUnidade() {
		return valorUnidade;
	}
	public void setValorUnidade(float valorUnidade) {
		this.valorUnidade = valorUnidade;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}