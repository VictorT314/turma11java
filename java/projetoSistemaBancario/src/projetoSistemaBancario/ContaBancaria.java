package projetoSistemaBancario;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class ContaBancaria extends Cliente {

	private int numero;
	private int senha;
	protected double saldo;
	private double valor;

	// CONSTRUTORES
	public ContaBancaria() {
		super();
	}

	public ContaBancaria(String nome, long cpf, int numero, int senha, double saldo) {
		super(nome, cpf);
		this.numero = numero;
		this.saldo = saldo;
	}

	// GETTERS + SETTERS

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getSenha() {
		return senha;
	}

	// MÉTODOS

	public void emiteExtrato() {

	}

	// DEPOSITAR QUANTIA
	public void credite(double valor) {
		while (valor < 0) {
			System.out.println("ERRO! DIGITE UM VALOR POSITIVO PARA SER ADICIONADO À CONTA!");
		}
		this.saldo = saldo + valor;

	}

	// DEBITAR QUANTIA
	public void debite(double valor) {
		while (valor < 0) {
			System.out.println("ERRO! DIGITE UM VALOR POSITIVO PARA SER ADICIONADO À CONTA!");
		}
		this.saldo = saldo + valor;

	}

	// GERADOR DE SENHAS
	public static int gerarSenha() {
		Random sorteia = new Random();
		int senha;

		senha = sorteia.nextInt(899999) + 100000;
		return senha;
	}

	// TESTER DE SENHA
	public static void testeSenha(int numero, int senha, List<ContaBancaria> contas) {
		Scanner sc = new Scanner(System.in);
		boolean testeSenha = false;
		int indice = 0;
		int contador = 4;
		boolean aprovado = false;

		for (ContaBancaria x : contas) {
			if (senha == x.getSenha()) {
				testeSenha = true;
			}
		}

		while (contador > 1 && testeSenha == false) {
			limpar();
			contador--;
			System.out.println("Senha incorreta! Você tem mais " + contador + " tentativas apenas!");
			System.out.print("Digite a senha novamente: ");
			senha = sc.nextInt();
			for (ContaBancaria x : contas)
				if (senha == x.getSenha()) {
					testeSenha = true;
				}
		}
		if (testeSenha) {
			System.out.print("Redirecionando");
			aguardar();
			limpar();
			aprovado = true;
		} else {
			System.out.print("Muitas tentativas incorretas! Você será redirecionado para o início");
			aguardar();
			limpar();
		}
	}

	// CRIAR CONTA POUPANÇA
	public static void criarCPP(List<ContaBancaria> contas) {
		Scanner sc = new Scanner(System.in);
		String nome;
		long cpf;
		char opc;
		double valor, saldo;
		int mes, numero, senha;

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

		numero = gerarCPP(contas);
		senha = gerarSenha();
		limpar();
		System.out.println("Informe uma quantia inicial para ser depositada na nova conta.");
		System.out.println("Para contas do tipo poupança, é necessário uma quantia de no mínimo R$ 10,00.");
		pular();
		System.out.print("Digite o valor do depósito: ");
		valor = sc.nextDouble();
		while (valor < 10) {
			System.out.println("Erro! O valor do depósito deve ser de R$ 10,00, no mínimo!");
			pular();
			System.out.print("Digite o valor do depósito: ");
			valor = sc.nextDouble();
		}
		saldo = valor;
		limpar();
		System.out.print("Realizando depósito");
		aguardar();
		limpar();
		System.out.println("Conta Poupança gerada com sucesso!");
		System.out.println("Abaixo, seguem os dados de sua nova conta:");
		pular();
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Nº CPP: " + numero);
		System.out.println("Senha: " + senha);
		System.out.printf("Saldo: R$ %.2f", valor);
		pular();
		pular();
		contas.add(new ContaPoupanca(nome, cpf, numero, senha, saldo));
	}

	// MENU CRIAR CONTA CORRENTE
	public static void criarCC(List contas) {
		Scanner sc = new Scanner(System.in);
		String nome;
		long cpf;
		char opc;
		double deposito;
		int numero, senha;

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
		numero = gerarCC(contas);
		senha = gerarSenha();
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
		System.out.println("Nº CC: " + numero);
		System.out.println("Senha: " + senha);
		System.out.printf("Saldo: R$ %.2f", deposito);
		pular();
		pular();
		contas.add(new ContaCorrente(nome, cpf, numero, senha, deposito));
	}

	// MENU CRIAR CONTA CORRENTE ESPECIAL
	public static void criarCCE(List contas) {
		Scanner sc = new Scanner(System.in);
		String nome;
		long cpf;
		char opc;
		double deposito;
		int numero, senha;

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
		numero = gerarCCE(contas);
		senha = gerarSenha();
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
		System.out.println("Nº CCE: " + numero);
		System.out.println("Senha: " + senha);
		System.out.printf("Saldo: R$ %.2f", deposito);
		pular();
		pular();
		contas.add(new ContaEspecial(nome, cpf, numero, senha, deposito));

	}

	// MENU CRIAR CONTA EMPRESARIAL
	public static void criarCEMP(List contas) {
		Scanner sc = new Scanner(System.in);
		String nome, nomeEmpresa;
		long cpf, cnpj;
		char opc;
		double deposito;
		int numero, senha;

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
		System.out.println("O CNPJ de " + nomeEmpresa + " é " + cnpj + ". Deseja alterar [S/N]?");
		System.out.print("Opção escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
			limpar();
			System.out.print("Informe o CNPJ da empresa: ");
			cnpj = sc.nextLong();
			limpar();
			System.out.println("O CNPJ de " + nomeEmpresa + " é " + cnpj + ". Deseja alterar [S/N]?");
			System.out.print("Opção escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Gerando nova conta. Aguarde");
		aguardar();
		numero = gerarCEMP(contas);
		senha = gerarSenha();
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
		System.out.println("Nº CEMP: " + numero);
		System.out.println("Senha: " + senha);
		System.out.printf("Saldo: R$ %.2f", deposito);
		pular();
		pular();
		contas.add(new ContaEmpresa(nome, cpf, numero, senha, deposito));
	}

	// GERADOR DE NÚMERO DE CEMP SEM REPETIÇÕES
	public static int gerarCEMP(List<ContaBancaria> contas) {
		Random sorteia = new Random();
		int numero = 0;
		boolean testeContas = true;

		while (testeContas) {
			numero = sorteia.nextInt(2000) + 4000;
			testeContas = false;
			for (ContaBancaria x : contas) {
				if (numero == x.getNumero()) {
					testeContas = true;
				}
			}
		}
		return numero;
	}

	// GERADOR DE NÚMERO DE CCE SEM REPETIÇÕES
	public static int gerarCCE(List<ContaBancaria> contas) {
		Random sorteia = new Random();
		int numero = 0;
		boolean testeContas = true;

		while (testeContas) {
			numero = sorteia.nextInt(2000) + 6000;
			testeContas = false;
			for (ContaBancaria x : contas) {
				if (numero == x.getNumero()) {
					testeContas = true;
				}
			}
		}
		return numero;
	}

	// GERADOR DE NÚMERO DE CC SEM REPETIÇÕES
	public static int gerarCC(List<ContaBancaria> contas) {
		Random sorteia = new Random();
		int numero = 0;
		boolean testeContas = true;

		while (testeContas) {
			numero = sorteia.nextInt(2000) + 4000;
			testeContas = false;
			for (ContaBancaria x : contas) {
				if (numero == x.getNumero()) {
					testeContas = true;
				}
			}
		}
		return numero;
	}

	// GERADOR DE NÚMERO DE CPP SEM REPETIÇÕES
	public static int gerarCPP(List<ContaBancaria> contas) {
		Random sorteia = new Random();
		int numero = 0;
		boolean testeContas = true;

		while (testeContas) {
			numero = sorteia.nextInt(2000) + 2000;
			testeContas = false;
			for (ContaBancaria x : contas) {
				if (numero == x.getNumero()) {
					testeContas = true;
				}
			}
		}
		return numero;
	}

	// MÊS DO ANO
	public static void meses(int mes) {
		String meses[] = { "JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO",
				"OUTUBRO", "NOVEMBRO", "DEZEMBRO" };

		mes -= 1;

		System.out.println("Você nasceu em " + meses[mes] + "?");
		System.out.print("Digite S ou N para confirmar: ");
	}

	// TESTE NÚMERO CONTA
	public int testeConta(List<ContaBancaria> Conta, int numeroConta) {
		Scanner sc = new Scanner(System.in);
		boolean testeNumero = false;
		for (ContaBancaria i : Conta) {
			if (numeroConta == i.getNumero()) {
				testeNumero = true;
			}
		}
		while (testeNumero == false) {
			System.out.println("Erro! Por favor, informe um número de conta válido!");
			System.out.print("Número da conta: ");
			numeroConta = sc.nextInt();
			for (ContaBancaria i : Conta) {
				if (numeroConta == i.getNumero()) {
					testeNumero = true;
				}
			}
		}
		return numeroConta;
	}

}
