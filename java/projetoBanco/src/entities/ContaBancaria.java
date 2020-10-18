package entities;

public abstract class ContaBancaria {
	
	protected int numero;
	protected double saldo;
	protected String nomeCompletoCliente;
	protected long cpf;
	
	//CONSTRUTORES
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public ContaBancaria(String nomeCompleto) {
		this.nomeCompletoCliente = nomeCompleto;
	}
	
	public ContaBancaria(String nomeCompleto, long cpf, int numero, double saldo) {
		this.nomeCompletoCliente = nomeCompleto;
		this.cpf = cpf;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public ContaBancaria(int numero) {
		this.numero = numero;
	}


	//GETTERS + SETTERS
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() { //Só terá get. O saldo deverá ser alterado através do método.
		return saldo;
	}

	public String getNomeCompletoCliente() {
		return nomeCompletoCliente;
	}

	public void setNomeCompletoCliente(String nomeCompletoCliente) {
		this.nomeCompletoCliente = nomeCompletoCliente;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
	//MÉTODOS

	//EMITIR EXTRATO
	public void emiteExtrato() {
		
	}
	
	//CREDITAR VALOR À CONTA
	public double credite(double valor) {
		while (valor < 0) {
			System.out.println("ERRO! DIGITE UM VALOR POSITIVO PARA SER ADICIONADO À CONTA!");
		}
		return (this.saldo + valor);
	}
	
	//DEBITAR VALOR DA CONTA
	public double debite(double valor) {
		while (valor < 0) {
			System.out.println("ERRO! DIGITE UM VALOR POSITIVO PARA SER DEBITADO DA CONTA!");
		}
		return (this.saldo - valor);
	}
	
	//IMPRIMIR DADOS CONTA
	@Override
	public String toString() {
		return "Número da conta: " + numero + "; \nNome: " + nomeCompletoCliente + "; \nCPF: " + cpf + "; \nMês de Aniversário: ";
	}

}
