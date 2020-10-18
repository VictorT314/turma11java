package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
		
		ContaPoupanca contaCriada = new ContaPoupanca();
		
		//VARI�VEIS
		byte opc = 0, opcCriarContas = 0;
		int i = 0;
		char opcAcessar;
		
		do {
			opc = bemVinde();
			if (opc == 2) {
				opcCriarContas = criarConta();
			}
			if (opcCriarContas == 1) {
				criarCPP(CPP);
				System.out.print("Deseja acessar a sua nova conta [S/N]?");
				opcAcessar = sc.next().toUpperCase().charAt(0);
				if (opcAcessar == 'S') {
					opc = bemVinde();
				}
				else {
					System.out.println("Obrigade pela prefer�ncia!");
					System.out.print("Reiniciando o programa");
					aguardar();
				}
			}
			limpar();
			if(opc == 1) {
				acessarConta(CPP);
			}
			else if(opc == 2) {
				
			}
			else if(opc == 3) {
				
			}
			/* MOSTRAS CPPs
			for(ContaPoupanca x : CPP) {
				System.out.println(x.toString());
				pular();
			}
			*/
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
	
	//MENU ACESSAR CONTA
	public static void acessarConta(List<ContaPoupanca> CPP) {
		Scanner sc = new Scanner(System.in);
		int numero, senha, indice;
		boolean teste = false;
		limpar();
		System.out.println("�REA DE LOGIN");
		System.out.print("Por favor, informe o n�mero da conta: ");
		numero = sc.nextInt();
		System.out.println("Informe a senha: ");
		senha = sc.nextInt();
		for (ContaPoupanca i : CPP) {
			if(numero == i.getNumero()) {
				teste = true;
			}
		}
		while(teste == false) {
			System.out.println("Erro! Por favor, informe um n�mero de conta v�lido!");
			System.out.print("Por favor, informe o n�mero da conta: ");
			numero = sc.nextInt();
			System.out.println("Informe a senha: ");
			senha = sc.nextInt();
			for (ContaPoupanca i : CPP) {
				if(numero == i.getNumero()) {
					teste = true;
				}
			}
		}
		System.out.println("Sa� do looping");
		
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
	public static List criarCPP(List CPP) {
		Scanner sc = new Scanner(System.in);
		String nome;
		long cpf;
		char opc;
		double deposito;
		int mes, numeroCPP, senhaCPP;
		
		System.out.println("�timo! Vamos abrir sua conta poupan�a!");
		pular();
		System.out.println("Por favor, informe os dados solicitados para preencher o formul�rio de abertura de conta.");
		pular();
		System.out.print("Informe o seu nome completo: ");
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
		System.out.print("Digite o n�mero do m�s de seu anivers�rio: ");
		mes = sc.nextInt();
		meses(mes);
		opc = sc.next().toUpperCase().charAt(0);
		while (opc != 'S') {
			System.out.print("Digite o n�mero do m�s de seu anivers�rio: ");
			mes = sc.nextInt();
			meses(mes);
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Gerando nova conta. Aguarde");
		aguardar();
		numeroCPP = gerarCPP();
		senhaCPP = gerarSenha();
		limpar();
		System.out.println("Informe uma quantia inicial para ser depositada na nova conta.");
		System.out.println("Para contas do tipo poupan�a, � necess�rio uma quantia de no m�nimo R$ 10,00.");
		pular();
		System.out.print("Digite o valor do dep�sito: ");
		deposito = sc.nextDouble();
		while (deposito < 10) {
			System.out.println("Erro! O valor do dep�sito deve ser de R$ 10,00, no m�nimo!");
			pular();
			System.out.print("Digite o valor do dep�sito: ");
			deposito = sc.nextDouble();
		}
		limpar();
		System.out.print("Realizando dep�sito");
		aguardar();
		limpar();
		System.out.println("Conta Poupan�a gerada com sucesso!");
		System.out.println("Abaixo, seguem os dados de sua nova conta:");
		pular();
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("N� CPP: " + numeroCPP);
		System.out.println("Senha: " + senhaCPP);
		System.out.printf("Saldo: R$ %.2f", deposito);
		pular();
		pular();
		CPP.add(new ContaPoupanca(nome, cpf, mes, numeroCPP, deposito));
		return CPP;
	}
	
	//M�S DO ANO
	public static void meses(int mes) {
		String meses[] = {"JANEIRO", "FEVEREIRO", "MAR�O", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"};
		
		mes -= 1;
		
		System.out.println("Voc� nasceu em " + meses[mes] + "?");
		System.out.print("Digite S ou N para confirmar: ");
	}
	
	//GERADOR DE N�MERO DE CPP --- OBS: CRIAR CONDI��O PARA N�O REPETIR N�MEROS SORTEADOS
	public static int gerarCPP() {
		Random sorteia = new Random();
		int numero;
		
		numero = sorteia.nextInt(4000) + 2000;
		return numero;
	}
	
	//GERADOR DE SENHAS --- OBS: CRIAR CONDI��O PARA N�O REPETIR N�MEROS SORTEADOS
	public static int gerarSenha() {
		Random sorteia = new Random();
		int senha;
		
		senha = sorteia.nextInt(899999) + 100000;
		return senha;
	}
	
	//AGUARDAR 3,6s
	public static void aguardar() {
		try {
			for(int i = 0; i < 3; i++) {
				System.out.print(".");
				Thread.sleep(1200);
			}
		} catch (Exception e) {
		}
	}
}