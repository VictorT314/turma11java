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

		// INSTÂNCIAS
		Scanner sc = new Scanner(System.in);

		List<ContaPoupanca> CPP = new ArrayList<>();
		List<ContaCorrente> CC = new ArrayList<>();
		List<ContaEspecial> CCE = new ArrayList<>();
		List<ContaEmpresa> CEMP = new ArrayList<>();
		List<Integer> contas = new ArrayList<>();

		// VARIÁVEIS
		byte opc = 0, opcCriarContas = 0;
		int i = 0;
		char opcAcessar;

		do {
			opc = bemVinde();
			if (opc == 2) {
				opcCriarContas = criarConta();
			}
			if (opcCriarContas == 1) {
				criarCPP(CPP, contas);
				System.out.print("Deseja acessar a sua nova conta [S/N]?");
				opcAcessar = sc.next().toUpperCase().charAt(0);
				if (opcAcessar == 'S') {
					opc = bemVinde();
				} else {
					System.out.println("Obrigade pela preferência!");
					System.out.print("Reiniciando o programa");
					aguardar();
				}
			}
			if (opcCriarContas == 2) {
				
			}
			limpar();
			if (opc == 1) {
				acessarConta(CPP, CC, CCE, CEMP);
			} else if (opc == 2) {

			} else if (opc == 3) {

			}
			/*
			 * MOSTRAS CPPs for(ContaPoupanca x : CPP) { System.out.println(x.toString());
			 * pular(); }
			 */
		} while (true);

	}

	// ----------------------------------------------FUNÇÕES---------------------------------------------------

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
		return opc;
	}

	// MENU ACESSAR CONTA --- PRECISA RECEBER TODAS AS LISTAS!!!
	public static void acessarConta(List CPP, List CC, List CCE, List CEMP) {
		Scanner sc = new Scanner(System.in);
		int numero, senha, indice;
		boolean teste = false;
		ContaPoupanca cpp = new ContaPoupanca();
		ContaCorrente cc = new ContaCorrente();
		ContaEspecial cce = new ContaEspecial();
		ContaEmpresa ce = new ContaEmpresa();
		limpar();
		System.out.println("ÁREA DE LOGIN");
		System.out.print("Por favor, informe o número da conta: ");
		numero = sc.nextInt();
		if (numero >= 2000 && numero <= 4000) {
			numero = cpp.testeConta(CPP, numero);
		}
		if (numero >= 4001 && numero <= 6000) {
			numero = cc.testeConta(CC, numero);
		}
		System.out.println("Saí do looping");

	}

	/*
	 * //TESTE NUMERO DE CONTA POUPANCA public static int testeConta(List
	 * <ContaPoupanca> Conta, int numeroConta) { Scanner sc = new
	 * Scanner(System.in); boolean testeNumero = false; for (ContaBancaria i :
	 * Conta) { if(numeroConta == i.getNumero()) { testeNumero = true; } }
	 * while(testeNumero == false) {
	 * System.out.println("Erro! Por favor, informe um número de conta válido!");
	 * System.out.print("Número da conta: "); numeroConta = sc.nextInt(); for
	 * (ContaBancaria i : Conta) { if(numeroConta == i.getNumero()) { testeNumero =
	 * true; } } } return numeroConta; }
	 */
	// MENU CRIAR CONTA
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
		return opc;
	}

	// MENU CRIAR CONTA POUPANÇA
	public static List criarCPP(List CPP, List contas) {
		Scanner sc = new Scanner(System.in);
		String nome;
		long cpf;
		char opc;
		double deposito;
		int mes, numeroCPP, senhaCPP;

		System.out.println("Ótimo! Vamos abrir sua conta poupança!");
		pular();
		System.out.println("Por favor, informe os dados solicitados para preencher o formulário de abertura de conta.");
		pular();
		System.out.print("Informe o seu nome completo: ");
		nome = sc.nextLine().toUpperCase();
		limpar();
		System.out.println("Seu nome é " + nome + ". Deseja alterar [S/N]?");
		System.out.print("Opção escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
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
		while (opc == 'S') {
			limpar();
			System.out.print("Informe o seu CPF: ");
			cpf = sc.nextLong();
			limpar();
			System.out.println("Seu CPF é " + cpf + ". Deseja alterar [S/N]?");
			System.out.print("Opção escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Digite o número do mês de seu aniversário: ");
		mes = sc.nextInt();
		meses(mes);
		opc = sc.next().toUpperCase().charAt(0);
		while (opc != 'S') {
			System.out.print("Digite o número do mês de seu aniversário: ");
			mes = sc.nextInt();
			meses(mes);
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Gerando nova conta. Aguarde");
		aguardar();

		gerarCPP(contas);
		numeroCPP = (int) contas.get((contas.size() - 1));
		senhaCPP = gerarSenha();
		limpar();
		System.out.println("Informe uma quantia inicial para ser depositada na nova conta.");
		System.out.println("Para contas do tipo poupança, é necessário uma quantia de no mínimo R$ 10,00.");
		pular();
		System.out.print("Digite o valor do depósito: ");
		deposito = sc.nextDouble();
		while (deposito < 10) {
			System.out.println("Erro! O valor do depósito deve ser de R$ 10,00, no mínimo!");
			pular();
			System.out.print("Digite o valor do depósito: ");
			deposito = sc.nextDouble();
		}
		limpar();
		System.out.print("Realizando depósito");
		aguardar();
		limpar();
		System.out.println("Conta Poupança gerada com sucesso!");
		System.out.println("Abaixo, seguem os dados de sua nova conta:");
		pular();
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Nº CPP: " + numeroCPP);
		System.out.println("Senha: " + senhaCPP);
		System.out.printf("Saldo: R$ %.2f", deposito);
		pular();
		pular();
		CPP.add(new ContaPoupanca(nome, cpf, mes, numeroCPP, deposito));
		return CPP;
	}
	
	//MENU CRIAR CONTA CORRENTE
	public static List criarCC(List CC, List contas) {
		Scanner sc = new Scanner(System.in);
		String nome;
		long cpf;
		char opc;
		double deposito;
		int mes, numeroCC, senhaCC;

		System.out.println("Ótimo! Vamos abrir sua conta poupança!");
		pular();
		System.out.println("Por favor, informe os dados solicitados para preencher o formulário de abertura de conta.");
		pular();
		System.out.print("Informe o seu nome completo: ");
		nome = sc.nextLine().toUpperCase();
		limpar();
		System.out.println("Seu nome é " + nome + ". Deseja alterar [S/N]?");
		System.out.print("Opção escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
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
		while (opc == 'S') {
			limpar();
			System.out.print("Informe o seu CPF: ");
			cpf = sc.nextLong();
			limpar();
			System.out.println("Seu CPF é " + cpf + ". Deseja alterar [S/N]?");
			System.out.print("Opção escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Digite o número do mês de seu aniversário: ");
		mes = sc.nextInt();
		meses(mes);
		opc = sc.next().toUpperCase().charAt(0);
		while (opc != 'S') {
			System.out.print("Digite o número do mês de seu aniversário: ");
			mes = sc.nextInt();
			meses(mes);
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Gerando nova conta. Aguarde");
		aguardar();

		gerarCPP(contas);
		numeroCC = (int) contas.get((contas.size() - 1));
		senhaCC = gerarSenha();
		limpar();
		System.out.println("Informe uma quantia inicial para ser depositada na nova conta.");
		System.out.println("Para contas do tipo poupança, é necessário uma quantia de no mínimo R$ 10,00.");
		pular();
		System.out.print("Digite o valor do depósito: ");
		deposito = sc.nextDouble();
		while (deposito < 10) {
			System.out.println("Erro! O valor do depósito deve ser de R$ 10,00, no mínimo!");
			pular();
			System.out.print("Digite o valor do depósito: ");
			deposito = sc.nextDouble();
		}
		limpar();
		System.out.print("Realizando depósito");
		aguardar();
		limpar();
		System.out.println("Conta Poupança gerada com sucesso!");
		System.out.println("Abaixo, seguem os dados de sua nova conta:");
		pular();
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Nº CPP: " + numeroCC);
		System.out.println("Senha: " + senhaCC);
		System.out.printf("Saldo: R$ %.2f", deposito);
		pular();
		pular();
		CC.add(new ContaPoupanca(nome, cpf, mes, numeroCC, deposito));
		return CC;
	}

	// MÊS DO ANO
	public static void meses(int mes) {
		String meses[] = { "JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO",
				"OUTUBRO", "NOVEMBRO", "DEZEMBRO" };

		mes -= 1;

		System.out.println("Você nasceu em " + meses[mes] + "?");
		System.out.print("Digite S ou N para confirmar: ");
	}

	// GERADOR DE NÚMERO DE CPP SEM REPETIÇÕES
	public static List gerarCPP(List<Integer> Contas) {
		Random sorteia = new Random();
		int numero = 0;
		boolean testeContas = true;

		while (testeContas) {
			numero = sorteia.nextInt(2000) + 2000;
			testeContas = false;
			for (int i = 0; i < Contas.size(); i++) {
				if (numero == Contas.get(i)) {
					testeContas = true;
				}
			}
		}
		Contas.add(numero);

		return Contas;
	}

	// GERADOR DE NÚMERO DE CC SEM REPETIÇÕES
	public static List gerarCC(List<Integer> Contas) {
		Random sorteia = new Random();
		int numero = 0;
		boolean testeContas = true;

		while (testeContas) {
			numero = sorteia.nextInt(2000) + 2000;
			testeContas = false;
			for (int i = 0; i < Contas.size(); i++) {
				if (numero == Contas.get(i)) {
					testeContas = true;
				}
			}
		}
		Contas.add(numero);

		return Contas;
	}

	// GERADOR DE NÚMERO DE CPP SEM REPETIÇÕES
	public static List gerarCCE(List<Integer> Contas) {
		Random sorteia = new Random();
		int numero = 0;
		boolean testeContas = true;

		while (testeContas) {
			numero = sorteia.nextInt(2000) + 2000;
			testeContas = false;
			for (int i = 0; i < Contas.size(); i++) {
				if (numero == Contas.get(i)) {
					testeContas = true;
				}
			}
		}
		Contas.add(numero);

		return Contas;
	}

	// GERADOR DE NÚMERO DE CPP SEM REPETIÇÕES
	public static List gerarCEMP(List<Integer> Contas) {
		Random sorteia = new Random();
		int numero = 0;
		boolean testeContas = true;

		while (testeContas) {
			numero = sorteia.nextInt(2000) + 2000;
			testeContas = false;
			for (int i = 0; i < Contas.size(); i++) {
				if (numero == Contas.get(i)) {
					testeContas = true;
				}
			}
		}
		Contas.add(numero);

		return Contas;
	}

	// GERADOR DE SENHAS
	public static int gerarSenha() {
		Random sorteia = new Random();
		int senha;

		senha = sorteia.nextInt(899999) + 100000;
		return senha;
	}

	// AGUARDAR 3,6s
	public static void aguardar() {
		try {
			for (int i = 0; i < 3; i++) {
				System.out.print(".");
				Thread.sleep(1200);
			}
		} catch (Exception e) {
		}
	}
}