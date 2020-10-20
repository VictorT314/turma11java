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

	// M�TODOS

	public void emiteExtrato() {

	}

	// DEPOSITAR QUANTIA
	public void credite(double valor) {
		while (valor < 0) {
			System.out.println("ERRO! DIGITE UM VALOR POSITIVO PARA SER ADICIONADO � CONTA!");
		}
		this.saldo = saldo + valor;

	}

	// DEBITAR QUANTIA
	public void debite(double valor) {
		while (valor < 0) {
			System.out.println("ERRO! DIGITE UM VALOR POSITIVO PARA SER ADICIONADO � CONTA!");
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
			System.out.println("Senha incorreta! Voc� tem mais " + contador + " tentativas apenas!");
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
			System.out.print("Muitas tentativas incorretas! Voc� ser� redirecionado para o in�cio");
			aguardar();
			limpar();
		}
	}

	// CRIAR CONTA POUPAN�A
	public static void criarCPP(List<ContaBancaria> contas) {
		Scanner sc = new Scanner(System.in);
		String nome;
		long cpf;
		char opc;
		double valor, saldo;
		int mes, numero, senha;

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
		while (opc == 'S') {
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
		limpar();
		System.out.println("Seu CPF � " + cpf + ". Deseja alterar [S/N]?");
		System.out.print("Op��o escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
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
		while (mes <= 0 || mes >= 13) {
			limpar();
			System.out.println("Erro! Digite o n�mero de um m�s v�lido!");
			System.out.print("Digite o n�mero do m�s de seu anivers�rio: ");
			mes = sc.nextInt();
			limpar();
		}
		meses(mes);
		opc = sc.next().toUpperCase().charAt(0);
		while (opc != 'S') {
			System.out.print("Digite o n�mero do m�s de seu anivers�rio: ");
			mes = sc.nextInt();
			while (mes <= 0 || mes >= 13) {
				limpar();
				System.out.println("Erro! Digite o n�mero de um m�s v�lido!");
				System.out.print("Digite o n�mero do m�s de seu anivers�rio: ");
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
		System.out.println("Para contas do tipo poupan�a, � necess�rio uma quantia de no m�nimo R$ 10,00.");
		pular();
		System.out.print("Digite o valor do dep�sito: ");
		valor = sc.nextDouble();
		while (valor < 10) {
			System.out.println("Erro! O valor do dep�sito deve ser de R$ 10,00, no m�nimo!");
			pular();
			System.out.print("Digite o valor do dep�sito: ");
			valor = sc.nextDouble();
		}
		saldo = valor;
		limpar();
		System.out.print("Realizando dep�sito");
		aguardar();
		limpar();
		System.out.println("Conta Poupan�a gerada com sucesso!");
		System.out.println("Abaixo, seguem os dados de sua nova conta:");
		pular();
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("N� CPP: " + numero);
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

		System.out.println("�timo! Vamos abrir sua conta corrente!");
		pular();
		System.out.println("Por favor, informe os dados solicitados para preencher o formul�rio de abertura de conta.");
		pular();
		System.out.print("Informe o seu nome completo: ");
		nome = sc.nextLine().toUpperCase();
		limpar();
		System.out.println("Seu nome � " + nome + ". Deseja alterar [S/N]?");
		System.out.print("Op��o escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
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
		limpar();
		System.out.println("Seu CPF � " + cpf + ". Deseja alterar [S/N]?");
		System.out.print("Op��o escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
			limpar();
			System.out.print("Informe o seu CPF: ");
			cpf = sc.nextLong();
			limpar();
			System.out.println("Seu CPF � " + cpf + ". Deseja alterar [S/N]?");
			System.out.print("Op��o escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Gerando nova conta. Aguarde");
		aguardar();
		numero = gerarCC(contas);
		senha = gerarSenha();
		limpar();
		System.out.println("Informe uma quantia inicial para ser depositada na nova conta.");
		System.out.println("Para contas corrente, � necess�rio uma quantia de no m�nimo R$ 50,00.");
		pular();
		System.out.print("Digite o valor do dep�sito: ");
		deposito = sc.nextDouble();
		while (deposito < 50) {
			System.out.println("Erro! O valor do dep�sito deve ser de R$ 50,00, no m�nimo!");
			pular();
			System.out.print("Digite o valor do dep�sito: ");
			deposito = sc.nextDouble();
		}
		limpar();
		System.out.print("Realizando dep�sito");
		aguardar();
		limpar();
		System.out.println("Conta Corrente gerada com sucesso!");
		System.out.println("Abaixo, seguem os dados de sua nova conta:");
		pular();
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("N� CC: " + numero);
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

		System.out.println("�timo! Vamos abrir sua conta corrente especial!");
		pular();
		System.out.println("Por favor, informe os dados solicitados para preencher o formul�rio de abertura de conta.");
		pular();
		System.out.print("Informe o seu nome completo: ");
		nome = sc.nextLine().toUpperCase();
		limpar();
		System.out.println("Seu nome � " + nome + ". Deseja alterar [S/N]?");
		System.out.print("Op��o escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
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
		limpar();
		System.out.println("Seu CPF � " + cpf + ". Deseja alterar [S/N]?");
		System.out.print("Op��o escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
			limpar();
			System.out.print("Informe o seu CPF: ");
			cpf = sc.nextLong();
			limpar();
			System.out.println("Seu CPF � " + cpf + ". Deseja alterar [S/N]?");
			System.out.print("Op��o escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Gerando nova conta. Aguarde");
		aguardar();
		numero = gerarCCE(contas);
		senha = gerarSenha();
		limpar();
		System.out.println("Informe uma quantia inicial para ser depositada na nova conta.");
		System.out.println("Para contas corrente, � necess�rio uma quantia de no m�nimo R$ 3.000,00.");
		pular();
		System.out.print("Digite o valor do dep�sito: ");
		deposito = sc.nextDouble();
		while (deposito < 3000) {
			System.out.println("Erro! O valor do dep�sito deve ser de R$ 3.000,00, no m�nimo!");
			pular();
			System.out.print("Digite o valor do dep�sito: ");
			deposito = sc.nextDouble();
		}
		limpar();
		System.out.print("Realizando dep�sito");
		aguardar();
		limpar();
		System.out.println("Conta Corrente Especial gerada com sucesso!");
		System.out.println("Abaixo, seguem os dados de sua nova conta:");
		pular();
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("N� CCE: " + numero);
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

		System.out.println("�timo! Vamos abrir sua conta empresarial!");
		pular();
		System.out.println("Por favor, informe os dados solicitados para preencher o formul�rio de abertura de conta.");
		pular();
		System.out.print("Informe o seu nome completo: ");
		nome = sc.nextLine().toUpperCase();
		limpar();
		System.out.println("Seu nome � " + nome + ". Deseja alterar [S/N]?");
		System.out.print("Op��o escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
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
		limpar();
		System.out.println("Seu CPF � " + cpf + ". Deseja alterar [S/N]?");
		System.out.print("Op��o escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
			limpar();
			System.out.print("Informe o seu CPF: ");
			cpf = sc.nextLong();
			limpar();
			System.out.println("Seu CPF � " + cpf + ". Deseja alterar [S/N]?");
			System.out.print("Op��o escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Por favor, digite o nome de sua empresa: ");
		sc.nextLine();
		nomeEmpresa = sc.nextLine().toUpperCase();
		limpar();
		System.out.println("O nome da empresa � " + nomeEmpresa + ". Deseja alterar [S/N]?");
		System.out.print("Op��o escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
			limpar();
			System.out.print("Informe o nome da empresa: ");
			sc.nextLine();
			nomeEmpresa = sc.nextLine().toUpperCase();
			limpar();
			System.out.println("O nome da empresa � " + nomeEmpresa + ". Deseja alterar [S/N]?");
			System.out.print("Op��o escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Informe o CNPJ da empresa: ");
		cnpj = sc.nextLong();
		limpar();
		System.out.println("O CNPJ de " + nomeEmpresa + " � " + cnpj + ". Deseja alterar [S/N]?");
		System.out.print("Op��o escolhida: ");
		opc = sc.next().toUpperCase().charAt(0);
		while (opc == 'S') {
			limpar();
			System.out.print("Informe o CNPJ da empresa: ");
			cnpj = sc.nextLong();
			limpar();
			System.out.println("O CNPJ de " + nomeEmpresa + " � " + cnpj + ". Deseja alterar [S/N]?");
			System.out.print("Op��o escolhida: ");
			opc = sc.next().toUpperCase().charAt(0);
		}
		limpar();
		System.out.print("Gerando nova conta. Aguarde");
		aguardar();
		numero = gerarCEMP(contas);
		senha = gerarSenha();
		limpar();
		System.out.println("Informe uma quantia inicial para ser depositada na nova conta.");
		System.out.println("Para contas empresariais, � necess�rio uma quantia de no m�nimo R$ 100,00.");
		pular();
		System.out.print("Digite o valor do dep�sito: ");
		deposito = sc.nextDouble();
		while (deposito < 100) {
			System.out.println("Erro! O valor do dep�sito deve ser de R$ 100,00, no m�nimo!");
			pular();
			System.out.print("Digite o valor do dep�sito: ");
			deposito = sc.nextDouble();
		}
		limpar();
		System.out.print("Realizando dep�sito");
		aguardar();
		limpar();
		System.out.println("Conta Corrente Especial gerada com sucesso!");
		System.out.println("Abaixo, seguem os dados de sua nova conta:");
		pular();
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Nome da Empresa: " + nomeEmpresa);
		System.out.println("CNPJ: " + cnpj);
		System.out.println("N� CEMP: " + numero);
		System.out.println("Senha: " + senha);
		System.out.printf("Saldo: R$ %.2f", deposito);
		pular();
		pular();
		contas.add(new ContaEmpresa(nome, cpf, numero, senha, deposito));
	}

	// GERADOR DE N�MERO DE CEMP SEM REPETI��ES
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

	// GERADOR DE N�MERO DE CCE SEM REPETI��ES
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

	// GERADOR DE N�MERO DE CC SEM REPETI��ES
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

	// GERADOR DE N�MERO DE CPP SEM REPETI��ES
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

	// M�S DO ANO
	public static void meses(int mes) {
		String meses[] = { "JANEIRO", "FEVEREIRO", "MAR�O", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO",
				"OUTUBRO", "NOVEMBRO", "DEZEMBRO" };

		mes -= 1;

		System.out.println("Voc� nasceu em " + meses[mes] + "?");
		System.out.print("Digite S ou N para confirmar: ");
	}

	// TESTE N�MERO CONTA
	public int testeConta(List<ContaBancaria> Conta, int numeroConta) {
		Scanner sc = new Scanner(System.in);
		boolean testeNumero = false;
		for (ContaBancaria i : Conta) {
			if (numeroConta == i.getNumero()) {
				testeNumero = true;
			}
		}
		while (testeNumero == false) {
			System.out.println("Erro! Por favor, informe um n�mero de conta v�lido!");
			System.out.print("N�mero da conta: ");
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
