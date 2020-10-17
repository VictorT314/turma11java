package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.ContaBancaria;
import entities.ContaCorrente;
import entities.ContaEmpresa;
import entities.ContaEspecial;
import entities.ContaPoupanca;


public class Banco {
	public static void main(String[] agrs) {
		
		//INSTÂNCIAS
		Scanner sc = new Scanner(System.in);
		
		List <ContaPoupanca> CPP = new ArrayList<>();
		List <ContaCorrente> CC = new ArrayList<>();
		List <ContaEspecial> CCE = new ArrayList<>();
		List <ContaEmpresa> CEMP = new ArrayList<>();
		
		
		//VARIÁVEIS
		byte opc = 0, opcCriarContas = 0;
		
		do {
			opc = bemVinde();
			if (opc == 2) {
				opcCriarContas = criarConta();
			}
			
		}while(true);
		
		
		
		
	}
	
	//----------------------------------------------FUNÇÕES---------------------------------------------------
	
	//PULAR LINHA
	public static void pular() {
		System.out.println();
	}
	
	//LIMPAR CONSOLE
	public static void limpar() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}
	
	//MENSAGEM BEM-VINDE + MENU
	public static byte bemVinde() {
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
		while(opc != 1 && opc != 2 && opc != 3) {
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
		return opc;
	}
	
	//MENU CRIAR CONTA
	public static byte criarConta() {
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
		while(opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5) {
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
		return opc;
	}
	
	//MENU CRIAR CONTA POUPANÇA
	public static void criarCPP() {
		Scanner sc = new Scanner(System.in);
		String nome;
		long cpf;
		char opc;
		
		System.out.println("Ótimo! Vamos abrir sua conta poupança!");
		pular();
		System.out.println("Por favor, informe os dados solicitados para preencher o formulário de abertura de conta.");
		pular();
		System.out.print("Informe o seu nome completo: ");
		sc.nextLine();
		nome = sc.nextLine().toUpperCase();
		limpar();
		System.out.println("Seu nome é " + nome + ". Deseja alterar [S/N]?");
		System.out.print("Opção escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while(opc == 'S') {
			limpar();
			System.out.print("Informe o seu nome completo: ");
			sc.nextLine();
			nome = sc.nextLine().toUpperCase();
			limpar();
			System.out.println("Seu nome é " + nome + ". Deseja alterar [S/N]?");
			System.out.print("Opção escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.println("Olá, " + nome + ".");
		System.out.print("Por favor, informe o seu CPF: ");
		cpf = sc.nextLong();
		System.out.println("Seu CPF é " + cpf + ". Deseja alterar [S/N]?");
		System.out.print("Opção escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while(opc == 'S') {
			limpar();
			System.out.print("Informe o seu CPF: ");
			cpf = sc.nextLong();
			limpar();
			System.out.println("Seu CPF é " + cpf + ". Deseja alterar [S/N]?");
			System.out.print("Opção escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
	}
	
	
}
