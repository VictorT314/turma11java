package projetoSistemaBancario;

public class Cliente {

	private String nome;
	private long cpf;

	// CONSTRUTORES
	public Cliente() {

	}

	public Cliente(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	// GETTERS + SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	// MÉTODOS
	
	// PULAR LINHA
	public static void pular() {
		System.out.println();
	}

	// LIMPAR CONSOLE
	public static void limpar() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	// AGUARDAR 3s
	public static void aguardar() {
		try {
			for (int i = 0; i < 3; i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		}
	}
}
