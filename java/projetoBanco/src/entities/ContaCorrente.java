package entities;

import java.util.List;
import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {
	
	private int talonario;
	
	//CONSTRUTORES
	public ContaCorrente() {
		
	}
	
	public ContaCorrente (String nomeCompleto, int senha, long cpf, int numero, double saldo) {
		super(nomeCompleto, senha, cpf, numero, saldo);
	}
	
	
	//M�TODOS
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
