package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projetoSistemaBancario.Cliente;
import projetoSistemaBancario.ContaBancaria;
import projetoSistemaBancario.ContaPoupanca;
import projetoSistemaBancario.ContaCorrente;
import projetoSistemaBancario.ContaEmpresa;
import projetoSistemaBancario.ContaEspecial;

public class Banco {

	public static void main(String[] args) {

		// INSTÂNCIAS
		Scanner sc = new Scanner(System.in);
		List<ContaBancaria> contas = new ArrayList<>();

		// PROGRAMA
		do {
			bemVinde(contas);

		} while (true);

	}

	// -------------------------------------------FUNÇÕES------------------------------------------------------
	// PULAR LINHA
	public static void pular() {
		System.out.println();
	}

	// LIMPAR CONSOLE
	public static void limpar() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	// MENSAGEM BEM-VINDE + MENU
	public static void bemVinde(List contas) {
		byte opc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vinde!");
		pular();
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Sou cliente do banco;");
		System.out.println("2 - Quero abrir uma conta;");
		System.out.println("3 - Cancelar.");
		pular();
		System.out.print("Opção escolhida: ");
		opc = sc.nextByte();
		while (opc != 1 && opc != 2 && opc != 3) {
			limpar();
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Sou cliente do banco;");
			System.out.println("2 - Quero abrir uma conta;");
			System.out.println("3 - Cancelar;");
			pular();
			System.out.println("Opção inválida! Por vavor, tente novamente.");
			System.out.print("Opção escolhida: ");
			opc = sc.nextByte();
		}
		limpar();
		if (opc == 1) {
			acessarConta(contas);
		}
		if (opc == 2) {
			criarConta(contas);

		}
	}

	// MENU CRIAR CONTA
	public static void criarConta(List<ContaBancaria> contas) {
		Scanner sc = new Scanner(System.in);
		byte opc = 0;
		System.out.println("Selecione uma opção de conta: ");
		pular();
		System.out.println("1 – Conta Poupança;");
		System.out.println("2 – Conta Corrente;");
		System.out.println("3 – Conta Corrente Especial;");
		System.out.println("4 – Conta Empresarial;");
		System.out.println("5 - Retornar ao menu anterior.");
		pular();
		System.out.print("Opção escolhida: ");
		opc = sc.nextByte();
		while (opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5) {
			limpar();
			System.out.println("Selecione uma opção de conta: ");
			pular();
			System.out.println("1 – Conta Poupança;");
			System.out.println("2 – Conta Corrente;");
			System.out.println("3 – Conta Corrente Especial;");
			System.out.println("4 – Conta Empresarial;");
			System.out.println("5 - Retornar ao menu anterior.");
			pular();
			System.out.println("Opção inválida! Por vavor, tente novamente.");
			System.out.print("Opção escolhida: ");
			opc = sc.nextByte();
		}
		limpar();
		if (opc == 1) {
			ContaBancaria.criarCPP(contas);
			;
			for (ContaBancaria x : contas) {
				System.out.println("Nome: " + x.getNome() + "\nCPF: " + x.getCpf() + "\nN. da Conta: " + x.getNumero()
						+ "\nSaldo: " + x.getSaldo());
			}

		}
		if (opc == 2) {
			ContaBancaria.criarCC(contas);
			;
			for (ContaBancaria x : contas) {
				System.out.println("Nome: " + x.getNome() + "\nCPF: " + x.getCpf() + "\nN. da Conta: " + x.getNumero()
						+ "\nSaldo: " + x.getSaldo());
			}

		}
		if (opc == 3) {
			ContaBancaria.criarCCE(contas);
			;
			for (ContaBancaria x : contas) {
				System.out.println("Nome: " + x.getNome() + "\nCPF: " + x.getCpf() + "\nN. da Conta: " + x.getNumero()
						+ "\nSaldo: " + x.getSaldo());
			}

		}
		if (opc == 4) {
			ContaBancaria.criarCEMP(contas);
			;
			for (ContaBancaria x : contas) {
				System.out.println("Nome: " + x.getNome() + "\nCPF: " + x.getCpf() + "\nN. da Conta: " + x.getNumero()
						+ "\nSaldo: " + x.getSaldo());
			}

		}
	}

	// MENU ACESSAR CONTA --- PRECISA RECEBER TODAS AS LISTAS!!!
	public static void acessarConta(List contas) {
		Scanner sc = new Scanner(System.in);
		int numero, senha, indice;
		boolean teste = false;
		ContaPoupanca cpp = new ContaPoupanca();
		ContaCorrente cc = new ContaCorrente();
		ContaEspecial cce = new ContaEspecial();
		ContaEmpresa cemp = new ContaEmpresa();
		limpar();
		System.out.println("ÁREA DE LOGIN");
		System.out.print("Por favor, informe o número da conta: ");
		numero = sc.nextInt();
		if (numero >= 2000 && numero <= 4000) {
			numero = cpp.testeConta(contas, numero);
			System.out.print("Informe a senha de sua CPP: ");
			senha = sc.nextInt();
			ContaBancaria.testeSenha(numero, senha, contas);

		}
		if (numero >= 4001 && numero <= 6000) {
			numero = cc.testeConta(contas, numero);
			System.out.print("Informe a senha de sua CC: ");
			senha = sc.nextInt();
			ContaBancaria.testeSenha(numero, senha, contas);

		}
		if (numero >= 6001 && numero <= 8000) {
			numero = cce.testeConta(contas, numero);
			System.out.print("Informe a senha de sua CCE: ");
			senha = sc.nextInt();
			ContaBancaria.testeSenha(numero, senha, contas);

		}
		if (numero >= 8001 && numero <= 9999) {
			numero = cemp.testeConta(contas, numero);
			System.out.print("Informe a senha de sua conta empresarial: ");
			senha = sc.nextInt();
			ContaBancaria.testeSenha(numero, senha, contas);

		}

	}

	// AGUARDAR 3s
	public static void aguardar() {
		try {
			for (int i = 0; i < 3; i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		}
	}

}
