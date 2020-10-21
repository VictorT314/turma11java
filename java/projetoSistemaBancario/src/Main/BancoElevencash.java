package Main;

import java.util.Scanner;

import projetoSistemaBancario.ContaCorrente;
import projetoSistemaBancario.ContaEmpresa;
import projetoSistemaBancario.ContaEspecial;
import projetoSistemaBancario.ContaPoupanca;

public class BancoElevencash {

	public static void main(String[] args) {

		// INSTÂNCIAS
		Scanner leia = new Scanner(System.in);
		ContaPoupanca poupanca = new ContaPoupanca();
		ContaCorrente corrente = new ContaCorrente();
		ContaEmpresa empresa = new ContaEmpresa();
		ContaEspecial especial = new ContaEspecial();

		// VARIÁVEIS
		double valorSaque = 0;
		valorSaque += poupanca.getSaldo();
		double valorDeposito = 0;
		int mes = 0;
		double valorJuros = 0;
		double valorCorrecao = 0;
		int servico;
		double valorDeposit = 0;
		double valorLimite = 3000;
		double valorLimit = 1000;

		//PROGRAMA
		System.out.println("═══════════════════════════╣ $ Banco ElevenCash $ ╠═════════════════════════════");

		System.out.println("Seja bem-vinde!");

		char opc = ' ';
		char opcT = ' ';

		corrente.setTalonario(0);

		boolean n = false;

		System.out.println("Digite o tipo de conta:\n1 - Poupança \n2 - Corrente \n3 - Empresa ");
		System.out.print("Opção escolhida: ");
		int tipo1 = leia.nextInt();
		limpar();

		if (tipo1 == 1) {
			System.out.println("CONTA POUPANÇA");
			System.out.print("Digite o nome do cliente: ");
			poupanca.setNome(leia.next());
			System.out.print("Digite o número da conta: ");
			poupanca.setNumero(leia.nextInt());
			limpar();
			do {
				System.out.println("Olá, " + poupanca.getNome() +". O que deseja fazer hoje? ");
				System.out.println(
						"\n1 - Saldo \n2 - Extrato \n3 - Saque \n4 - Deposito \n5 - Juros e Correção \n6 - Sair");
				pular();
				System.out.print("Opção escolhida: ");
				servico = leia.nextInt();
				limpar();

				if (servico == 1) {
					System.out.println("SALDO DISPONÍVEL");
					System.out.printf("Total:     R$ %.2f\n", poupanca.getSaldo());
					pular();
				}

				else if (servico == 2) {
					System.out.println("EXTRATO DA SUA CONTA");
					System.out.println("Cliente:   " + poupanca.getNome());
					System.out.println("Conta bancaria: " + poupanca.getNumero());
					System.out.printf("Depósitos: R$ %.2f", valorDeposito);
					pular();
					System.out.printf("Correção:  R$ %.2f", valorCorrecao);
					pular();
					System.out.printf("Juros:     R$ %.2f", valorJuros);
					pular();
					System.out.printf("Saques:    R$ %.2f", valorSaque);
					pular();
					System.out.printf("Total:     R$ %.2f", poupanca.getSaldo());
					pular();
				} else if (servico == 3) {
					System.out.print("Digite o valor do saque: ");
					valorSaque = leia.nextDouble();
					if (valorSaque <= poupanca.getSaldo()) {
						System.out.printf("Retirado o valor de R$ %.2f", valorSaque);
						pular();
						poupanca.debite(valorSaque);
						System.out.printf("Saldo atualizado: R$ %.2f", poupanca.getSaldo());
						pular();
					} else {
						double naoRealizado = 0;
						valorSaque = naoRealizado;
						System.out.printf("Saque negado! Você tem apenas R$ %.2f em sua conta!", poupanca.getSaldo());
						pular();
					}
				}

				else if (servico == 4) {
					System.out.print("Digite o valor de depósito: ");
					valorDeposito = leia.nextDouble();
					poupanca.credite(valorDeposito);
					System.out.printf("Depositado o valor de R$ %.2f", valorDeposito);
					pular();
					System.out.printf("Saldo atualizado: R$ %.2f", poupanca.getSaldo());
					pular();
				} else if (servico == 5) {
					System.out.print("Informe o mês de seu aniversário: ");
					mes = leia.nextInt();
					if (mes == 10) {
						valorCorrecao = poupanca.aniversarioMes(poupanca.getSaldo());
						System.out.printf("Valor da correção monetária: R$ %.2f ", valorCorrecao);
						pular();
						poupanca.credite(valorCorrecao);

					}
					valorJuros = poupanca.jurosPoupanca(poupanca.getSaldo());
					System.out.printf("Valor dos juros: R$ %.2f", valorJuros);
					pular();
					poupanca.debite(valorJuros);
				}
			}

			while (servico != 6);
			System.out.println("FIM DA OPERAÇÃO");
		}
		// Conta Corrente
		else if (tipo1 == 2) {
			System.out.println("CONTA CORRENTE");
			System.out.print("Digite o nome do cliente: ");
			corrente.setNome(leia.next());
			pular();
			System.out.print("Digite o número da conta: ");
			corrente.setNumero(leia.nextInt());
			aguardar();
			limpar();
			do {

				System.out.println("CONTA CORRENTE");
				System.out.println("Olá, " +corrente.getNome() +". O que deseja fazer hoje? ");
				System.out.println(
						"\n1 - Saldo \n2 - Extrato \n3 - Saque \n4 - Deposito \n5 - Talonário \n6 - Conta Especial\n7 - Sair");
				servico = leia.nextInt();

				if (servico == 1) {
					System.out.println("SALDO DISPONÍVEL");
					System.out.printf("Total:     R$ %.2f", corrente.getSaldo());
					pular();
				}

				else if (servico == 2) {
					System.out.println("EXTRATO DA SUA CONTA");
					System.out.println("Cliente:   " + corrente.getNome());
					System.out.printf("Conta bancaria:" + corrente.getNumero());
					pular();
					System.out.printf("Depósitos: R$ %.2f", valorDeposito);
					pular();
					System.out.printf("Saques:    R$ %.2f", valorSaque);
					pular();
					System.out.printf("Total:     R$ %.2f", corrente.getSaldo());
					pular();
					if (corrente.getTalonario() == 0) {
						System.out.println("Não há talonários emitidos!");
					} else {
						System.out.println("Número do ultimo talonário emitido: " + corrente.getTalonario());
					}
				}

				else if (servico == 3) {
					System.out.print("Digite o valor do saque: ");
					valorSaque = leia.nextDouble();

					if (valorSaque <= corrente.getSaldo()) {
						System.out.printf("Retirado o valor de R$" + valorSaque);
						aguardar();
						corrente.debite(valorSaque);
						System.out.println("Saldo atualizado: R$" + corrente.getSaldo());
					} else {
						double naoRealizado = 0;
						valorSaque = naoRealizado;
						System.out.printf("Saque de negado! Seu saldo disponível: R$ %.2f ", corrente.getSaldo());
						pular();
						System.out.println("Impossível sacar mais que o valor total do saldo.");
					}
				}

				else if (servico == 4) {

					System.out.print("Digite o valor do depósito: ");
					valorDeposito = leia.nextDouble();
					corrente.credite(valorDeposito);
					System.out.printf("Depositado o valor de R$ %.2f", valorDeposito);
					pular();
					System.out.printf("Saldo atualizado: R$ %.2f", corrente.getSaldo());
					pular();
					if (corrente.getSaldo() >= 3000) {
						System.out
								.print("Seu perfil permite uma conta especial, deseja fazer uma? [S/N]: ");
						opc = leia.next().toUpperCase().charAt(0);
						aguardar();

						if (opc == 'S') {
							System.out.println("Conta especial feita com sucesso!");
							n = true;

						}

					}
				}

				else if (servico == 5) {

					System.out.println("Deseja emitir um talonário? [S/N]: ");
					opcT = leia.next().toUpperCase().charAt(0);
					if (opcT == 'S') {
						System.out.println("Retire seu talonário");
						corrente.emiteTalonario();
						System.out.println("Número do talonário: " + corrente.getTalonario());

					}

				}
				if (servico == 6) {
					if (n == true) {

						System.out.print("Digite o nome do cliente: ");
						especial.setNome(leia.next());
						System.out.print("Digite o número da conta: ");
						especial.setNumero(leia.nextInt());
						limpar();

						do {
							System.out.println("CONTA ESPECIAL");
							System.out.println("Olá, " + especial.getNome() +". O que deseja fazer hoje? ");
							System.out.println("\n1 - Saldo \n2 - Extrato \n3 - Saque \n4 - Deposito \n5 - Juros \n6 - Sair");
							pular();
							System.out.print("Opção escolhida: ");
							servico = leia.nextInt();

							if (servico == 1) {
								System.out.println("SALDO DISPONÍVEL");
								System.out.printf("Total:     R$ %.2f", especial.getSaldo());
								pular();
							}

							else if (servico == 2) {
								System.out.println("EXTRATO DA SUA CONTA");
								System.out.println("Cliente:   " + especial.getNome());
								System.out.println("Conta bancaria: " + especial.getNumero());
								System.out.printf("Depósitos: R$ %.2f", valorDeposit);
								pular();
								System.out.printf("Juros:     R$ %.2f", valorJuros);
								pular();
								System.out.printf("Saques:    R$ %.2f", valorSaque);
								pular();
								System.out.printf("Total:     R$ %.2f", especial.getSaldo());
								pular();
								System.out.printf("Limite Disponível: R$ %.2f", valorLimite);
								pular();
							} else if (servico == 3) {
								System.out.println("Digite o valor do saque: ");
								valorSaque = leia.nextDouble();

								if (valorSaque <= especial.getSaldo()) {
									System.out.printf("Retirado o valor de R$ %.2f", valorSaque);
									aguardar();
									especial.debite(valorSaque);
									System.out.printf("Saldo atualizado: R$ %.2f", especial.getSaldo());
								} else {
									System.out.println("Sacando do seu limite");
									valorLimite = valorLimite - valorSaque;
									System.out.printf("Limite disponível: R$ %.2f", valorLimite);
									aguardar();
								}
							}

							else if (servico == 4) {
								System.out.print("Digite o valor de depósito: ");
								valorDeposit = leia.nextDouble();
								especial.credite(valorDeposit);
								System.out.printf("Depositando o valor de R$ %.2f\n", valorDeposit);
								aguardar();
								System.out.printf("Saldo atualizado: R$ %.2f\n", especial.getSaldo());
							} else if (servico == 5) {

								valorJuros = especial.calculaJuros(especial.getSaldo());
								System.out.printf("Valor do juros: R$ %.2f", valorJuros);
								pular();
								especial.credite(valorJuros);
							}

						} while (servico != 6);
						System.out.println("FIM DA OPERAÇÃO");

					} else if (n == false) {
						System.out.println("Você não possui uma conta especial");
						System.out.println("FIM DA OPERAÇÃO");
					}

				}

			} while (servico != 7);
			System.out.println("FIM DA OPERAÇÃO");

		}
		if (tipo1 == 3) {
			System.out.println("CONTA EMPRESARIAL");
			System.out.print("Digite o nome do cliente: ");
			empresa.setNome(leia.next());
			System.out.print("Digite o número da conta: ");
			empresa.setNumero(leia.nextInt());
			aguardar();
			limpar();
			do {
				if (valorLimite <= (valorLimite / 2)) {
					System.out.println("Você tem direito ao emprestimo empresarial com limite de R$ " + 2000);
				}
				pular();
				System.out.println("Olá, " + empresa.getNome() +". O que deseja fazer hoje?");
				System.out.println("\n1 - Saldo \n2 - Extrato \n3 - Saque \n4 - Deposito \n5 - Sair");
				System.out.print("Opção escolhida: ");
				servico = leia.nextInt();

				if (servico == 1) {
					System.out.println("SALDO");
					System.out.printf("Total:     R$ %.2f", empresa.getSaldo());
				}

				else if (servico == 2) {
					System.out.println("EXTRATO");
					System.out.println("Cliente:   " + empresa.getNome());
					System.out.println("Conta bancaria: " + empresa.getNumero());
					System.out.printf("Depósitos: R$ %.2f", valorDeposito);
					pular();
					System.out.printf("Saques:    R$ %.2f", valorSaque);
					pular();
					System.out.printf("Total:     R$ %.2f", empresa.getSaldo());
					pular();
					System.out.printf("Limite Disponível: R$ %.2f", valorLimit);
					pular();
				} else if (servico == 3) {
					System.out.print("Digite o valor do saque: ");
					valorSaque = leia.nextDouble();
					pular();

					if (valorSaque <= empresa.getSaldo()) {
						System.out.printf("Retirado o valor de R$ %.2f", valorSaque);
						aguardar();
						pular();
						empresa.debite(valorSaque);
						System.out.printf("Saldo atualizado: R$ %.2f", empresa.getSaldo());
					} else {
						System.out.println("Sacando do seu limite");
						aguardar();
						pular();
						valorLimit = valorLimit - valorSaque;
						System.out.printf("Limite disponível: R$ %.2f", valorLimit);
					}
				}

				else if (servico == 4) {
					System.out.print("Digite o valor do depósito: ");
					valorDeposito = leia.nextDouble();
					empresa.credite(valorDeposito);
					pular();
					System.out.printf("Depositando valor de R$ %.2f", valorDeposito);
					pular();
					aguardar();
					pular();
					System.out.printf("Saldo atualizado: R$ %.2f", empresa.getSaldo());
					pular();
				}

			} while (servico != 5);
			System.out.println("FIM DA OPERAÇÃO");
		}
		leia.close();

	}

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
