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
		
		//INST�NCIAS
		Scanner sc = new Scanner(System.in);
		
		List <ContaPoupanca> CPP = new ArrayList<>();
		List <ContaCorrente> CC = new ArrayList<>();
		List <ContaEspecial> CCE = new ArrayList<>();
		List <ContaEmpresa> CEMP = new ArrayList<>();
		
		
		//VARI�VEIS
		byte opc = 0, opcCriarContas = 0;
		
		do {
			opc = bemVinde();
			if (opc == 2) {
				opcCriarContas = criarConta();
			}
			
		}while(true);
		
		
		
		
	}
	
	//----------------------------------------------FUN��ES---------------------------------------------------
	
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
		System.out.println("Escolha uma op��o: ");
		System.out.println("1 - Sou cliente do banco;");
		System.out.println("2 - Quero abrir uma conta;");
		System.out.println("3 - Cancelar.");
		pular();
		System.out.print("Op��o escolhida: ");
		opc = sc.nextByte();
		while(opc != 1 && opc != 2 && opc != 3) {
			limpar();
			System.out.println("Escolha uma op��o: ");
			System.out.println("1 - Sou cliente do banco;");
			System.out.println("2 - Quero abrir uma conta;");
			System.out.println("3 - Cancelar;");
			pular();
			System.out.println("Op��o inv�lida! Por vavor, tente novamente.");
			System.out.print("Op��o escolhida: ");
			opc = sc.nextByte();
		}
		limpar();
		return opc;
	}
	
	//MENU CRIAR CONTA
	public static byte criarConta() {
		Scanner sc = new Scanner(System.in);
		byte opc = 0;
		System.out.println("Selecione uma op��o de conta: ");
		pular();
		System.out.println("1 � Conta Poupan�a;");
		System.out.println("2 � Conta Corrente;");
		System.out.println("3 � Conta Corrente Especial;");
		System.out.println("4 � Conta Empresarial;");
		System.out.println("5 - Retornar ao menu anterior.");
		pular();
		System.out.print("Op��o escolhida: ");
		opc = sc.nextByte();
		while(opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5) {
			limpar();
			System.out.println("Selecione uma op��o de conta: ");
			pular();
			System.out.println("1 � Conta Poupan�a;");
			System.out.println("2 � Conta Corrente;");
			System.out.println("3 � Conta Corrente Especial;");
			System.out.println("4 � Conta Empresarial;");
			System.out.println("5 - Retornar ao menu anterior.");
			pular();
			System.out.println("Op��o inv�lida! Por vavor, tente novamente.");
			System.out.print("Op��o escolhida: ");
			opc = sc.nextByte();
		}
		limpar();
		return opc;
	}
	
	//MENU CRIAR CONTA POUPAN�A
	public static void criarCPP() {
		Scanner sc = new Scanner(System.in);
		String nome;
		long cpf;
		char opc;
		
		System.out.println("�timo! Vamos abrir sua conta poupan�a!");
		pular();
		System.out.println("Por favor, informe os dados solicitados para preencher o formul�rio de abertura de conta.");
		pular();
		System.out.print("Informe o seu nome completo: ");
		sc.nextLine();
		nome = sc.nextLine().toUpperCase();
		limpar();
		System.out.println("Seu nome � " + nome + ". Deseja alterar [S/N]?");
		System.out.print("Op��o escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while(opc == 'S') {
			limpar();
			System.out.print("Informe o seu nome completo: ");
			sc.nextLine();
			nome = sc.nextLine().toUpperCase();
			limpar();
			System.out.println("Seu nome � " + nome + ". Deseja alterar [S/N]?");
			System.out.print("Op��o escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.println("Ol�, " + nome + ".");
		System.out.print("Por favor, informe o seu CPF: ");
		cpf = sc.nextLong();
		System.out.println("Seu CPF � " + cpf + ". Deseja alterar [S/N]?");
		System.out.print("Op��o escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while(opc == 'S') {
			limpar();
			System.out.print("Informe o seu CPF: ");
			cpf = sc.nextLong();
			limpar();
			System.out.println("Seu CPF � " + cpf + ". Deseja alterar [S/N]?");
			System.out.print("Op��o escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
	}
	
	
}
