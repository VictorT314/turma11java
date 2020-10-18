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
		List<String> nomes = new ArrayList<>();
		List<Integer> contas = new ArrayList<>();
		List<Integer> senhas = new ArrayList<>();

		// VARIÁVEIS
		byte opc = 0, opcCriarContas = 0;
		int i = 0;
		char opcAcessar;

		do {
			opc = bemVinde();
			if (opc == 1) {
				acessarConta(CPP, CC, CCE, CEMP, contas, senhas);
			}
			if (opc == 2) {
				opcCriarContas = criarConta();
			}
			if (opcCriarContas == 1) {
				criarCPP(CPP, contas, senhas);
				System.out.print("Deseja acessar a sua nova conta [S/N]?");
				opcAcessar = sc.next().toUpperCase().charAt(0);
				if (opcAcessar == 'S') {
					acessarConta(CPP, CC, CCE, CEMP, contas, senhas);
				} else {
					System.out.println("Obrigade pela preferência!");
					System.out.print("Reiniciando o programa");
					aguardar();
				}
			}
			limpar();
			if (opcCriarContas == 2) {
				criarCC(CC, contas, senhas);
				System.out.print("Deseja acessar a sua nova conta [S/N]?");
				opcAcessar = sc.next().toUpperCase().charAt(0);
				if (opcAcessar == 'S') {
					acessarConta(CPP, CC, CCE, CEMP, contas, senhas);
				} else {
					System.out.println("Obrigade pela preferência!");
					System.out.print("Reiniciando o programa");
					aguardar();
				}
			}
			limpar();
			if (opcCriarContas == 3) {
				criarCCE(CCE, contas, senhas);
				System.out.print("Deseja acessar a sua nova conta [S/N]?");
				opcAcessar = sc.next().toUpperCase().charAt(0);
				if (opcAcessar == 'S') {
					acessarConta(CPP, CC, CCE, CEMP, contas, senhas);
				} else {
					System.out.println("Obrigade pela preferência!");
					System.out.print("Reiniciando o programa");
					aguardar();
				}
			}
			limpar();
			if (opcCriarContas == 4) {
				criarCEMP(CEMP, contas, senhas);
				System.out.print("Deseja acessar a sua nova conta [S/N]?");
				opcAcessar = sc.next().toUpperCase().charAt(0);
				if (opcAcessar == 'S') {
					acessarConta(CPP, CC, CCE, CEMP, contas, senhas);
				} else {
					System.out.println("Obrigade pela preferência!");
					System.out.print("Reiniciando o programa");
					aguardar();
				}
			}
			limpar();
			if (opc == 1) {
				acessarConta(CPP, CC, CCE, CEMP, contas, senhas);
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
	public static void acessarConta(List CPP, List CC, List CCE, List CEMP, List contas, List senhas) {
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
			numero = cpp.testeConta(CPP, numero);
			System.out.print("Informe a senha de sua CPP: ");
			senha = sc.nextInt();
			testeSenha(numero, senha, contas, senhas);

		}
		if (numero >= 4001 && numero <= 6000) {
			numero = cc.testeConta(CC, numero);
			System.out.print("Informe a senha de sua CC: ");
			senha = sc.nextInt();
			testeSenha(numero, senha, contas, senhas);
		
		}
		if (numero >= 6001 && numero <= 8000) {
			numero = cce.testeConta(CCE, numero);
			System.out.print("Informe a senha de sua CCE: ");
			senha = sc.nextInt();
			testeSenha(numero, senha, contas, senhas);
			
		}
		if (numero >= 8001 && numero <= 9999) {
			numero = cemp.testeConta(CEMP, numero);
			System.out.print("Informe a senha de sua conta empresarial: ");
			senha = sc.nextInt();
			testeSenha(numero, senha, contas, senhas);
			
		}
		

	}
	
	//ACESSAR CONTA POUPANÇA
	public static void acessarCPP(List<ContaPoupanca> CPP) {
		Scanner sc = new Scanner(System.in);
		char opc;
		
		System.out.println("Olá, ");
		
	}
	
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
	public static List criarCPP(List CPP, List contas, List senhas) {
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
		limpar();
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
		while (mes <= 0 || mes >= 13) {
			limpar();
			System.out.println("Erro! Digite o número de um mês válido!");
			System.out.print("Digite o número do mês de seu aniversário: ");
			mes = sc.nextInt();
			limpar();
		}
		meses(mes);
		opc = sc.next().toUpperCase().charAt(0);
		while (opc != 'S') {
			System.out.print("Digite o número do mês de seu aniversário: ");
			mes = sc.nextInt();
			while (mes <= 0 || mes >= 13) {
				limpar();
				System.out.println("Erro! Digite o número de um mês válido!");
				System.out.print("Digite o número do mês de seu aniversário: ");
				mes = sc.nextInt();
				limpar();
			}
			meses(mes);
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Gerando nova conta. Aguarde");
		aguardar();

		gerarCPP(contas);
		gerarSenha(senhas);
		numeroCPP = (int) contas.get((contas.size() - 1));
		senhaCPP = (int) senhas.get((senhas.size() - 1));
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
		CPP.add(new ContaPoupanca(nome, senhaCPP, cpf, mes, numeroCPP, deposito));
		return CPP;
	}

	// MENU CRIAR CONTA CORRENTE
	public static List criarCC(List CC, List contas, List senhas) {
		Scanner sc = new Scanner(System.in);
		String nome;
		long cpf;
		char opc;
		double deposito;
		int numeroCC, senhaCC;

		System.out.println("Ótimo! Vamos abrir sua conta corrente!");
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
		limpar();
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
		System.out.print("Gerando nova conta. Aguarde");
		aguardar();
		gerarCC(contas);
		gerarSenha(senhas);
		numeroCC = (int) contas.get((contas.size() - 1));
		senhaCC = (int) senhas.get((senhas.size() - 1));
		limpar();
		System.out.println("Informe uma quantia inicial para ser depositada na nova conta.");
		System.out.println("Para contas corrente, é necessário uma quantia de no mínimo R$ 50,00.");
		pular();
		System.out.print("Digite o valor do depósito: ");
		deposito = sc.nextDouble();
		while (deposito < 50) {
			System.out.println("Erro! O valor do depósito deve ser de R$ 50,00, no mínimo!");
			pular();
			System.out.print("Digite o valor do depósito: ");
			deposito = sc.nextDouble();
		}
		limpar();
		System.out.print("Realizando depósito");
		aguardar();
		limpar();
		System.out.println("Conta Corrente gerada com sucesso!");
		System.out.println("Abaixo, seguem os dados de sua nova conta:");
		pular();
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Nº CC: " + numeroCC);
		System.out.println("Senha: " + senhaCC);
		System.out.printf("Saldo: R$ %.2f", deposito);
		pular();
		pular();
		CC.add(new ContaCorrente(nome, senhaCC, cpf, numeroCC, deposito));
		return CC;
	}

	// MENU CRIAR CONTA CORRENTE ESPECIAL
	public static List criarCCE(List CCE, List contas, List senhas) {
		Scanner sc = new Scanner(System.in);
		String nome;
		long cpf;
		char opc;
		double deposito;
		int numeroCCE, senhaCCE;

		System.out.println("Ótimo! Vamos abrir sua conta corrente especial!");
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
		limpar();
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
		System.out.print("Gerando nova conta. Aguarde");
		aguardar();
		gerarCCE(contas);
		gerarSenha(senhas);
		numeroCCE = (int) contas.get((contas.size() - 1));
		senhaCCE = (int) senhas.get((senhas.size() - 1));
		limpar();
		System.out.println("Informe uma quantia inicial para ser depositada na nova conta.");
		System.out.println("Para contas corrente, é necessário uma quantia de no mínimo R$ 3.000,00.");
		pular();
		System.out.print("Digite o valor do depósito: ");
		deposito = sc.nextDouble();
		while (deposito < 3000) {
			System.out.println("Erro! O valor do depósito deve ser de R$ 3.000,00, no mínimo!");
			pular();
			System.out.print("Digite o valor do depósito: ");
			deposito = sc.nextDouble();
		}
		limpar();
		System.out.print("Realizando depósito");
		aguardar();
		limpar();
		System.out.println("Conta Corrente Especial gerada com sucesso!");
		System.out.println("Abaixo, seguem os dados de sua nova conta:");
		pular();
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Nº CCE: " + numeroCCE);
		System.out.println("Senha: " + senhaCCE);
		System.out.printf("Saldo: R$ %.2f", deposito);
		pular();
		pular();
		CCE.add(new ContaEspecial(nome, senhaCCE, cpf, numeroCCE, deposito));
		return CCE;
	}

	// MENU CRIAR CONTA CORRENTE ESPECIAL
	public static List criarCEMP(List CEMP, List contas, List senhas) {
		Scanner sc = new Scanner(System.in);
		String nome, nomeEmpresa;
		long cpf, cnpj;
		char opc;
		double deposito;
		int numeroCEMP, senhaCEMP;

		System.out.println("Ótimo! Vamos abrir sua conta empresarial!");
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
		limpar();
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
		System.out.print("Por favor, digite o nome de sua empresa: ");
		sc.nextLine();
		nomeEmpresa = sc.nextLine().toUpperCase();
		limpar();
		System.out.println("O nome da empresa é " + nomeEmpresa + ". Deseja alterar [S/N]?");
		System.out.print("Opção escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
			limpar();
			System.out.print("Informe o nome da empresa: ");
			sc.nextLine();
			nomeEmpresa = sc.nextLine().toUpperCase();
			limpar();
			System.out.println("O nome da empresa é " + nomeEmpresa + ". Deseja alterar [S/N]?");
			System.out.print("Opção escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Informe o CNPJ da empresa: ");
		cnpj = sc.nextLong();
		limpar();
		System.out.println("O CNPJ de " + nomeEmpresa + " é " + cnpj +". Deseja alterar [S/N]?");
		System.out.print("Opção escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
			limpar();
			System.out.print("Informe o CNPJ da empresa: ");
			cnpj = sc.nextLong();
			limpar();
			System.out.println("O CNPJ de " + nomeEmpresa + " é " + cnpj +". Deseja alterar [S/N]?");
			System.out.print("Opção escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Gerando nova conta. Aguarde");
		aguardar();
		gerarCEMP(contas);
		gerarSenha(senhas);
		numeroCEMP = (int) contas.get((contas.size() - 1));
		senhaCEMP = (int) senhas.get((senhas.size() - 1));
		limpar();
		System.out.println("Informe uma quantia inicial para ser depositada na nova conta.");
		System.out.println("Para contas empresariais, é necessário uma quantia de no mínimo R$ 100,00.");
		pular();
		System.out.print("Digite o valor do depósito: ");
		deposito = sc.nextDouble();
		while (deposito < 100) {
			System.out.println("Erro! O valor do depósito deve ser de R$ 100,00, no mínimo!");
			pular();
			System.out.print("Digite o valor do depósito: ");
			deposito = sc.nextDouble();
		}
		limpar();
		System.out.print("Realizando depósito");
		aguardar();
		limpar();
		System.out.println("Conta Corrente Especial gerada com sucesso!");
		System.out.println("Abaixo, seguem os dados de sua nova conta:");
		pular();
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Nome da Empresa: " + nomeEmpresa);
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Nº CEMP: " + numeroCEMP);
		System.out.println("Senha: " + senhaCEMP);
		System.out.printf("Saldo: R$ %.2f", deposito);
		pular();
		pular();
		CEMP.add(new ContaEmpresa(nome, senhaCEMP, cpf, nomeEmpresa, cnpj, numeroCEMP, deposito));
		return CEMP;
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
			numero = sorteia.nextInt(2000) + 4000;
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

	// GERADOR DE NÚMERO DE CCE SEM REPETIÇÕES
	public static List gerarCCE(List<Integer> Contas) {
		Random sorteia = new Random();
		int numero = 0;
		boolean testeContas = true;

		while (testeContas) {
			numero = sorteia.nextInt(2000) + 6000;
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

	// GERADOR DE NÚMERO DE CEMP SEM REPETIÇÕES
	public static List gerarCEMP(List<Integer> Contas) {
		Random sorteia = new Random();
		int numero = 0;
		boolean testeContas = true;

		while (testeContas) {
			numero = sorteia.nextInt(2000) + 8000;
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
	public static List gerarSenha(List<Integer> Senhas) {
		Random sorteia = new Random();
		int senha;

		senha = sorteia.nextInt(899999) + 100000;
		Senhas.add(senha);
		return Senhas;
	}
	
	//TESTER DE SENHA
	public static void testeSenha(int numero, int senha, List contas, List senhas) {
		Scanner sc = new Scanner(System.in);
		boolean testeSenha = false;
		int indice = 0;
		int contador = 3;
		boolean aprovado = false;
		
		indice = (int) contas.indexOf(numero);
		if (senha == (int) senhas.get(indice)) {
			testeSenha = true;
		}
		
		while(contador > 0 && testeSenha == false) {
			limpar();
			contador--;
			System.out.println("Senha incorreta! Você tem mais " + contador + " tentativas apenas!");
			System.out.print("Digite a senha novamente: ");
			senha = sc.nextInt();
			if (senha == (int) senhas.get(indice)) {
				testeSenha = true;
			}
		}
		if (testeSenha) {
			System.out.print("Redirecionando");
			aguardar();
			limpar();
			aprovado = true;
		}
		else {
			System.out.print("Muitas tentativas incorretas! Você será redirecionado para o início");
			aguardar();
			limpar();
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