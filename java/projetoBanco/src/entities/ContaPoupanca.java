package entities;

import java.util.List;
import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria{
	
	private double juros;
	private double corrMonetaria;
	private int mesAniversario;
	
	
	//CONSTRUTORES
	public ContaPoupanca () {
		
	}

	public ContaPoupanca(String nomeCompleto, int senha, long cpf, int mesAniversario, int numero, double saldo) {
		super(nomeCompleto, senha, cpf, numero, saldo);
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
	
	//M�TODOS
	
	//IMPRIMIR DADOS DA CONTA
	@Override
	public String toString() {
		return "N� da CPP: " + super.numero + "; \nNome: " + super.nomeCompletoCliente + "; \nCPF: " + super.cpf + "; \nM�s de Anivers�rio: " + mesAniversario + "; \nSaldo: R$ " + saldo;
	}
	@Override
	public int testeConta(List <ContaBancaria> Conta, int numeroConta) {
		Scanner sc = new Scanner(System.in);
		boolean testeNumero = false;
		for (ContaBancaria i : Conta) {
			if(numeroConta == i.getNumero()) {
				testeNumero = true;
			}
		}
		while(testeNumero == false) {
			System.out.println("Erro! Por favor, informe um n�mero de conta v�lido!");
			System.out.print("N�mero da conta: ");
			numeroConta = sc.nextInt();
			for (ContaBancaria i : Conta) {
				if(numeroConta == i.getNumero()) {
					testeNumero = true;
				}
			}
		}
		return numeroConta;
	}
}
