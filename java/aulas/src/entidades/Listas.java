package entidades;

public class Listas {

	private String nome;
	private int numero1;
	private int numero2;
	private int numero3;
	
	public Listas(String nome, int numero1, int numero2, int numero3) {
		super();
		this.nome = nome;
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getNumero3() {
		return numero3;
	}

	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}

	public Listas() {
		super();
	}
	
	@Override
	public String toString() {
		return nome + " " + numero1 + " " + numero2 + " " + numero3;
	}
	
	
	
}
