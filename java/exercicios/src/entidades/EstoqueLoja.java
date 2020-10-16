package entidades;

public class EstoqueLoja {

	private String nome;
	private double preco;
	private int codigo;
	private int quantidade;
	
	//CONSTRUTORES
	public EstoqueLoja () {
		super();
	}
	
	public EstoqueLoja (String nome, int codigo, int quantidade, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	//GETTERS + SETTERS 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Código: "+ codigo + ", \nProduto: " + nome + ", \nPreco=" + preco + ", \nQuantidade=" + quantidade;
	}
	
	
	
	
}
