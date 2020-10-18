package entities;

public class ContaPoupanca extends ContaBancaria{
	
	private double juros;
	private double corrMonetaria;
	private int mesAniversario;
	
	
	//CONSTRUTORES
	public ContaPoupanca () {
		
	}

	public ContaPoupanca(String nomeCompleto, long cpf, int mesAniversario, int numero, double saldo) {
		super(nomeCompleto, cpf, numero, saldo);
		this.mesAniversario = mesAniversario;
	}

	//GETTERS + SETTERS
	public double getJuros() {
		return juros;
	}


	public void setJuros(double juros) {
		this.juros = juros;
	}


	public double getCorrMonetaria() {
		return corrMonetaria;
	}


	public void setCorrMonetaria(double corrMonetaria) {
		this.corrMonetaria = corrMonetaria;
	}


	public int getMesAniversario() {
		return mesAniversario;
	}


	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	
	//MÉTODOS
	
	//IMPRIMIR DADOS DA CONTA
	@Override
	public String toString() {
		return "Nº da CPP: " + super.numero + "; \nNome: " + super.nomeCompletoCliente + "; \nCPF: " + super.cpf + "; \nMês de Aniversário: " + mesAniversario + "; \nSaldo: R$ " + saldo;
	}
	
}
