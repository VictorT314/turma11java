package projetoSistemaBancario;

import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class ContaPoupanca extends ContaBancaria {

	private double juros;
	private double corrMonetaria;
	private int mesAniversario;

	// CONSTRUTORES
	public ContaPoupanca() {

	}

	public ContaPoupanca(String nome, long cpf, int numero, int senha, double saldo) {
		super(nome, cpf, numero, senha, saldo);

	}

	// GETTERS + SETTERS
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

	// MÉTODOS
	//CORREÇÃO PELO MÊS
	public double aniversarioMes(double saldo) {
		return super.getSaldo()*0.03;
	}
	//JUROS
	public double jurosPoupanca(double saldo) {
		return super.getSaldo()*0.003;
	}

}
