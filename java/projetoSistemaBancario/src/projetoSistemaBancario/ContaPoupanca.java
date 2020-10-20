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
	public void aniversarioMes() {
		int mes = 0;
		if(mesAniversario == mes) {
		super.credite( super.getSaldo() * corrMonetaria);
		}
	}

}
