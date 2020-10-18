package entities;

import java.util.List;
import java.util.Scanner;

public class ContaEmpresa extends ContaBancaria{

	private String nomeEmpresa;
	private long cnpj;
	
	//CONSTRUTORES
	public ContaEmpresa() {
		
	}
	
	public ContaEmpresa(String nomeCompleto, int senha, long cpf, String nomeEmpresa, long cnpj, int numero, double saldo) {
		super(nomeCompleto, senha, cpf, numero, saldo);
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
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
