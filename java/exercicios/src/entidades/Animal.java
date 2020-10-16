package entidades;

public class Animal {
	
	private String nome;
	private int idade;
	
	//CONSTRUTORES
	public Animal() {
	}

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//GETTERS + SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//MÉTODOS
	public void emitirSom() {
		System.out.println("*som*");
	}
	
	public void correr() {
		System.out.println("*correndo*");
	}
	
	public void subirArvore() {
		System.out.println("*escalando*");
	}
	
	

}
