package projetoSistemaBancario;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ContaEspecial extends ContaCorrente {

	private double limite;

	// CONSTRUTORES
	public ContaEspecial() {

	}

	public ContaEspecial(String nome, long cpf, int numero, int senha, double saldo) {
		super(nome, cpf, numero, senha, saldo);

	}

	// GETTERS + SETTERS
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// MÉTODOS
	public double calculaJuros() {
		super.credite(super.getSaldo()*0.02);
		return super.getSaldo();
	}

}
