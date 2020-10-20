package projetoSistemaBancario;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {

	private int talonario;

	// CONSTRUTORES
	public ContaCorrente() {

	}

	public ContaCorrente(String nome, long cpf, int numero, int senha, double saldo) {
		super(nome, cpf, numero, senha, saldo);

	}

	// GETTERS + SETTERS
	public int getTalonario() {
		return talonario;
	}

	public void setTalonario(int talonario) {
		this.talonario = talonario;
	}

	// MÉTODOS
	public int emiteTalonario() {
		talonario = talonario++;
		return talonario;
	}

	

}
