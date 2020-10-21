package projetoSistemaBancario;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class ContaBancaria extends Cliente {

	private String nomeEmpresa;
	private long cnpj;
	private int numero;
	private int senha;
	protected double saldo;
	protected double valor;

	// CONSTRUTORES
	public ContaBancaria() {
		super();
	}
	
	public ContaBancaria(String nome, long cpf, int numero, int senha, double saldo) {
		super(nome, cpf);
		this.numero = numero;
		this.saldo = saldo;
		this.senha = senha;
	}

	public ContaBancaria(String nome, long cpf, String nomeEmpresa, long cnpj, int numero, int senha, double saldo) {
		super(nome, cpf);
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.numero = numero;
		this.saldo = saldo;
	}

	// GETTERS + SETTERS

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getSenha() {
		return senha;
	}

	// MÉTODOS

	public void emiteExtrato() {
		System.out.print("\nEXTRATO DA CONTA");
		pular();
		System.out.print("N° da Conta: "+ this.getNumero());
		System.out.printf("\nSaldo: R$ %.2f", this.getSaldo());
		pular();
	}

	// DEPOSITAR QUANTIA
	public double credite(double valor) {
		while (valor < 0) {
			System.out.println("ERRO! DIGITE UM VALOR POSITIVO PARA SER ADICIONADO À CONTA!");
		}
		return this.saldo = saldo + valor;

	}

	// DEBITAR QUANTIA
	public double debite(double valor) {
		while (valor < 0) {
			System.out.println("ERRO! DIGITE UM VALOR POSITIVO PARA SER ADICIONADO À CONTA!");
		}
		return this.saldo = saldo - valor;

	}

	

}
