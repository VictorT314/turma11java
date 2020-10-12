package Loja;

import java.util.Scanner;

public class LojaDeRoupas {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in); // Declara��o do teclado

		// Vari�veis

		String produtos[] = { "CAMISETA BRANCA", "CAMISETA PRETA", "CAMISETA AZUL", "CAMISETA VERMELHA", "CAL�A JEANS",
				"CAL�A PRETA", "VESTIDO BRANCO", "VESTIDO PRETO", "MOLETOM", "BOLSA" };
		String codigos[] = { "1B", "1P", "1A", "1V", "2J", "2P", "3B", "3P", "4M", "5B" };
		int quantidadesEstoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		double precos[] = { 40, 40, 40, 40, 90, 90, 120, 120, 120, 90 };
		String nomeUsuario, codigoP;
		char identidade;
		char opc = 'S', opcao = 'S', opcAlterar = 'S', fim = 'N';
		int x = 0, y = 0, indice = 0, unidade = 0, opp = 0, parcelas = 0;
		int quantidadeCarrinho[] = new int[10];
		double subtotal = 0;
		boolean compCodigo = false;

		// inicio do loop
		// Identifica��o
		do {
			System.out.println("==========Bem Vindes ao Mundo Invertido==========");
			System.out.println("Para entrar Identifique-se:");
			System.out.print("Ol�, qual � o seu nome?: ");
			nomeUsuario = tec.next();
			System.out.print("Como voc� se identifica?: ");
			identidade = tec.next().charAt(0);

			pulaLinha();

			System.out.println("Fique a vontade " + nomeUsuario + "!");

			do {
				do { // Lista de Produtos

					pulaLinha();

					ListaProdutos(codigos, produtos, quantidadesEstoque, precos);
					pulaLinha();
					System.out.print("Informe o c�digo do produto: "); // Compra
					codigoP = tec.next().toUpperCase();
					indice = testeCodigo(codigoP, codigos, quantidadesEstoque, compCodigo);

					System.out.println(produtos[indice] + "    R$ " + precos[indice] + "   Quantidade dispon�vel: "
							+ quantidadesEstoque[indice] + " Unidades");
					pulaLinha();
					System.out.print("Quantas unidades voc� deseja: ");
					unidade = tec.nextInt();
					while (unidade > quantidadesEstoque[indice]) {
						System.out.println("Quantidade Insuficiente");
						System.out.print("Quantas unidades voc� deseja: ");
						unidade = tec.nextInt();
					}
					pulaLinha();
					quantidadesEstoque[indice] = (quantidadesEstoque[indice] - unidade);
					ListaProdutos(codigos, produtos, quantidadesEstoque, precos);
					quantidadeCarrinho[indice] = (quantidadeCarrinho[indice] + unidade);
					pulaLinha();
					carrinho(codigos, produtos, quantidadeCarrinho, precos);
					subtotal = subTotal(quantidadeCarrinho, precos, unidade, subtotal);
					System.out.printf("Subtotal: R$ %.2f ", subtotal);
					System.out.println();
					pulaLinha();
					System.out.print("Deseja Continuar comprando?!: S-sim  N-n�o  "); // loop da compra
					opc = tec.next().toUpperCase().charAt(0);
				} while (opc == 'S');
				limpa();
				carrinho(codigos, produtos, quantidadeCarrinho, precos);
				System.out.printf("Subtotal: R$ %.2f ", subtotal);
				System.out.println();
				System.out.print("Deseja alterar o carrinho?!: S-sim  N-n�o  "); // Edita o carrinho
				opcao = tec.next().toUpperCase().charAt(0);
				while (opcAlterar == 'S') {
					if (opcao == 'S') {
						limpa();
						carrinho(codigos, produtos, quantidadeCarrinho, precos);
						System.out.printf("Subtotal: R$ %.2f ", subtotal);
						System.out.println();
						System.out.print("Digite o c�digo do produto que voc� deseja alterar: ");
						codigoP = tec.next().toUpperCase();
						indice = testeCodigo(codigoP, codigos, quantidadeCarrinho, compCodigo);
						
						System.out.println(produtos[indice] + "    R$ " + precos[indice] + "   Quantidade escolhida: "
								+ quantidadeCarrinho[indice] + " Unidades");
						pulaLinha();
						System.out.print("Quantas unidades voc� deseja remover: ");
						unidade = tec.nextInt();
						while (unidade > quantidadeCarrinho[indice]) {
							System.out.println("Quantidade Excedente!");
							System.out.print("Quantas unidades voc� deseja remover: ");
							unidade = tec.nextInt();
						}
						quantidadesEstoque[indice] = (quantidadesEstoque[indice] + unidade);
						quantidadeCarrinho[indice] = (quantidadeCarrinho[indice] - unidade);
						carrinho(codigos, produtos, quantidadeCarrinho, precos);
						subtotal = subTotal(quantidadeCarrinho, precos, unidade, subtotal);
						System.out.printf("Subtotal: R$ %.2f ", subtotal);
						System.out.println();
					}
					System.out.print("Deseja fazer uma nova altera��o no carrinho? S-sim N-n�o ");
					opcAlterar = tec.next().toUpperCase().charAt(0);

					// Forma de pagamento
				}
				pulaLinha();
				System.out.print(
						"Escolha a forma de Pagamento: \n1-A vista com 10% de desconto \n2-Cr�dito (1-3x sem juros) ");
				opp = tec.nextInt();
				while (opp > 2) {
					System.out.println("Dados Incorretos! Digite uma op��o V�lida!");
					System.out.print(
							"Escolha a forma de Pagamento: \n1-A vista com 10% de desconto \n2-Cr�dito (1-3x sem juros) ");
					opp = tec.nextInt();
				}
				if (opp == 1) {
					System.out.println("\n\nOp��o escolhida: R$" + (subtotal - (subtotal / 100 * 10)) + "\n");
					subtotal = (subtotal - (subtotal / 100 * 10));
				} else if (opp == 2) {
					System.out.print("Digite a op��o de parcelas desejada: 1, 2 ou 3 ");
					parcelas = tec.nextInt();
					while (parcelas > 3) {
						System.out.println("Dados Incorretos! Digite uma Parcela V�lida!");
						parcelas = tec.nextInt();
					}
					if (parcelas == 1) {
						System.out.println("R$ " + subtotal + " em uma vez.");
					}
					if (parcelas == 2) {
						System.out.println("Em duas vezes de R$ " + subtotal / 2 + " sem juros.");
					}
					if (parcelas == 3) {
						System.out.println("Em tr�s vezes de R$ " + subtotal / 3 + " sem juros.");
					}

				}
				opcao = 'N';
				// Finaliza compra

			} while (opcao == 'S');
			System.out.println("Parab�ns pela sua Compra " + nomeUsuario + "!");

			System.out.println();
			// Nota fiscal
			System.out.println("NOTA FISCAL");

			carrinho(codigos, produtos, quantidadeCarrinho, precos);
			System.out.println("Total: R$ " + subtotal);
			System.out.printf("Valor de Icms incidente sobre a compra: R$ %.2f", ((subtotal / 100) * 9));
			pulaLinha();
			pulaLinha();
			System.out.printf("==========Obrigado por comprar na nossa loja!==========");
			pulaLinha();
			System.out.print("\nNovo Cliente?: S-sim N-n�o "); // loop novo cliente
			fim = tec.next().toUpperCase().charAt(0);

			limpa();
			
			//Resetando as vari�veis
			
			opc = 'S';
			opcao = 'S';
			opcAlterar = 'S';
			indice = 0;
			unidade = 0;
			opp = 0;
			parcelas = 0;
			for (int i = 0; i < quantidadeCarrinho.length; i++) {
				quantidadeCarrinho[i] = 0;
			}
			subtotal = 0;
			compCodigo = false;

		} while (fim == 'S');
		tec.close();

	} // LISTA DE PRODUTOS

	public static void ListaProdutos(String codigos[], String produtos[], int quantidadesEstoque[], double precos[]) {
		System.out.println("Lista de Produtos");
		System.out.printf("\t Codigo \tNome \t Quantidade \t Pre�o \t \n");

		for (int x = 0; x < precos.length; x++) {
			if (produtos[x] == "BOLSA") {
				System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "           ",
						quantidadesEstoque[x], precos[x]);
			} else if (produtos[x] == "MOLETOM") {
				System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "         ",
						quantidadesEstoque[x], precos[x]);
			} else if (produtos[x] == "VESTIDO PRETO") {
				System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "     ",
						quantidadesEstoque[x], precos[x]);
			} else if (produtos[x] == "CAL�A PRETA") {
				System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "     ",
						quantidadesEstoque[x], precos[x]);
			} else if (produtos[x] == "CAL�A JEANS") {
				System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "     ",
						quantidadesEstoque[x], precos[x]);
			} else if (produtos[x] == "CAMISETA AZUL") {
				System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "     ",
						quantidadesEstoque[x], precos[x]);
			} else {
				System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x], quantidadesEstoque[x],
						precos[x]);
			}

		}
	}// CARRINHO

	public static void carrinho(String codigos[], String produtos[], int quantidadeCarrinho[], double precos[]) {
		System.out.println("Seu Carrinho:");
		for (int x = 0; x < precos.length; x++) {
			if (quantidadeCarrinho[x] != 0) {
				if (produtos[x] == "BOLSA") {
					System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "           ",
							quantidadeCarrinho[x], precos[x]);
				} else if (produtos[x] == "MOLETOM") {
					System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "         ",
							quantidadeCarrinho[x], precos[x]);
				} else if (produtos[x] == "VESTIDO PRETO") {
					System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "     ",
							quantidadeCarrinho[x], precos[x]);
				} else if (produtos[x] == "CAL�A PRETA") {
					System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "     ",
							quantidadeCarrinho[x], precos[x]);
				} else if (produtos[x] == "CAL�A JEANS") {
					System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "     ",
							quantidadeCarrinho[x], precos[x]);
				} else if (produtos[x] == "CAMISETA AZUL") {
					System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x] + "     ",
							quantidadeCarrinho[x], precos[x]);
				} else {
					System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x], quantidadeCarrinho[x],
							precos[x]);
				}
				// System.out.printf("\t %s \t %s \t %d \t %.2f \n",codigos[x], carrinho[x],
				// quantidadeCarrinho[x], precos[x] );
			}

		}

	}// SUBTOTAL

	public static double subTotal(int quantidadeCarrinho[], double precos[], int unidade, double subtotal) {
		for (int x = 0; x < precos.length; x++) {
			if ((quantidadeCarrinho[x] != 0) && (quantidadeCarrinho[x] == unidade)) {
				subtotal = subtotal + (quantidadeCarrinho[x] * precos[x]); // subtotal somando unidades iguais-resolu��o
																			// var aux
			}
		}
		return subtotal;
	}

	// TESTE CODIGO- erro c�digo carrinho
	public static int testeCodigo(String codigoP, String codigos[], int quantidadesEstoque[], boolean compCodigo) {
		Scanner tec = new Scanner(System.in);
		int indice = 0;
		while (compCodigo == false) {
			for (int x = 0; x < codigos.length; x++) {
				if (codigos[x].equals(codigoP)) {
					compCodigo = true;
				}
			}
			if (compCodigo == false) {
				System.out.println("C�digo inv�lido,tente novamente!!");
				codigoP = tec.next().toUpperCase();
			}
			if (compCodigo == true) {
				for (int x = 0; x < codigos.length; x++) {
					if (codigos[x].equals(codigoP)) {
						indice = x;
					}
				}
			}if (quantidadesEstoque[indice] == 0 && compCodigo == true) {
				System.out.println("Erro! Este produto est� fora de estoque!");
				System.out.print("Digite o c�digo de outro produto: ");
				codigoP = tec.next().toUpperCase();
				compCodigo = false;
			}
		}
		return indice;
	} // Limpa

	public static void limpa() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	// Pula Linha
	public static void pulaLinha() {
		System.out.print("\n");
	}
}