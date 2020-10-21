package projetoSistemaBancario;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ContaEmpresa extends ContaBancaria {
	
	private double limiteEmpresa;
	private double limiteUsado;

	// CONSTRUTORES
	public ContaEmpresa() {

	}

	public ContaEmpresa(String nome, long cpf, String nomeEmpresa, long cnpj, int numero, int senha, double saldo) {
		super(nome, cpf, nomeEmpresa, cnpj, numero, senha, saldo);

	}

	// GETTERS + SETTERS
	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}

	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}

	// MÉTODOS
	//EMPRÉSTIMO
	public double emprestimoEmpresarial() {
		if(limiteUsado/limiteEmpresa <= 0.5) {
			super.credite(limiteEmpresa*2);
		} else {
			System.out.println("Empréstimo Negado!!");
		}
		return super.getSaldo();
	}

	

}
