package entidades;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	//CONSTRUTOR PADR�O
	public Pessoa() {
		
	}
	/*
	//CONSTRUTOR NOME + ENDERE�O
	public Pessoa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}*/
	//CONSTRUTOR NOME + ENDERE�O + TELEFONE
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//CONSTRUTOR NOME + TELEFONE
	public Pessoa(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	//GETTERS + SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
