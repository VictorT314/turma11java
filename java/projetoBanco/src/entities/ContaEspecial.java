package entities;

import java.util.List;
import java.util.Scanner;

public class ContaEspecial extends ContaCorrente {

	
	//CONSTRUTORES
	public ContaEspecial() {
		
	}
	
	public ContaEspecial (String nomeCompleto, int senha, long cpf, int numero, double saldo) {
		super(nomeCompleto, senha, cpf, numero, saldo);
	}
	
	//MÉTODOS
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
			System.out.println("Erro! Por favor, informe um número de conta válido!");
			System.out.print("Número da conta: ");
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
