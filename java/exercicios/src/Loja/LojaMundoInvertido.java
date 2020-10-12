package Loja;

import java.util.Scanner;

public class LojaMundoInvertido {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in); // Declara��o do teclado

		// Vari�veis

		String produtos[] = { "CAMISETA BRANCA", "CAMISETA PRETA", "CAMISETA AZUL", "CAMISETA VERMELHA", "CAL�A JEANS",
				"CAL�A PRETA", "VESTIDO BRANCO", "VESTIDO PRETO", "MOLETOM", "BOLSA" };
		String codigos[] = { "1B", "1P", "1A", "1V", "2J", "2P", "3B", "3P", "4M", "5B" };
		int quantidadesEstoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		double precos[] = { 40, 40, 40, 40, 90, 90, 120, 120, 120, 90 };
		String nomeUsuario, identidade, codigoP;
		char opcCompra = 'S', opcao = 'S', opcAlterar = 'N', fim = 'N';
		int x = 0, y = 0, indice = 0, unidade = 0, opp = 0, parcelas = 0;
		int quantidadeCarrinho[] = new int[10];
		double subtotal = 0;
		boolean compCodigo = false;

		// inicio do loop
		// Identifica��o
		do {
			nomeUsuario = bemVinde();
			pulaLinha();
			System.out.println("Fique � vontade, " + nomeUsuario + "!");

			do {
				do {
					// Lista de Produtos e carrinho

					pulaLinha();
					ListaProdutos(codigos, produtos, quantidadesEstoque, precos);
					pulaLinha();
					codigoP = receberCod();
					indice = testeCodigo(codigoP, codigos, quantidadesEstoque, compCodigo);
					pulaLinha();
					System.out.printf("%s    R$ %.2f    Quantidade dispon�vel: %d unidades", produtos[indice],
							precos[indice], quantidadesEstoque[indice]);
					pulaLinha();
					pulaLinha();
					System.out.print("Quantas unidades voc� deseja?: ");
					unidade = unidadeEscolhida(indice, quantidadesEstoque);
					limpa();
					pulaLinha();
					quantidadesEstoque[indice] = (quantidadesEstoque[indice] - unidade);
					ListaProdutos(codigos, produtos, quantidadesEstoque, precos);
					quantidadeCarrinho[indice] = (quantidadeCarrinho[indice] + unidade);
					pulaLinha();
					System.out.println("Seu Carrinho:");
					carrinho(codigos, produtos, quantidadeCarrinho, precos);
					subtotal = subTotal(precos, indice, unidade, subtotal, opcAlterar);
					System.out.printf("Subtotal: R$ %.2f ", subtotal);
					pulaLinha();
					pulaLinha();
					System.out.print("Deseja continuar comprando?! S-sim ou N-n�o:  "); // loop da compra
					opcCompra = tec.next().toUpperCase().charAt(0);
					limpa();
					System.out.println("Seu Carrinho:");
					carrinho(codigos, produtos, quantidadeCarrinho, precos);
					System.out.printf("Subtotal: R$ %.2f ", subtotal);
					pulaLinha();
					pulaLinha();
				} while (opcCompra == 'S'); // Fim das compras.
				limpa();
				System.out.println("Seu Carrinho:");
				carrinho(codigos, produtos, quantidadeCarrinho, precos);
				System.out.printf("Subtotal: R$ %.2f ", subtotal);
				System.out.println();
				System.out.print("Deseja alterar o carrinho?! S-sim ou N-n�o:  "); // Edita o carrinho
				opcAlterar = tec.next().toUpperCase().charAt(0);
				while (opcAlterar == 'S') { // La�o para alterar o carrinho

					limpa();
					System.out.println("Seu Carrinho:");
					carrinho(codigos, produtos, quantidadeCarrinho, precos);
					System.out.printf("Subtotal: R$ %.2f ", subtotal);
					System.out.println();
					System.out.print("Digite o c�digo do produto que voc� deseja alterar: ");
					codigoP = tec.next().toUpperCase();
					indice = testeCodigo(codigoP, codigos, quantidadeCarrinho, compCodigo);
					pulaLinha();
					System.out.printf("%s    R$ %.2f    Quantidade escolhida: %d unidades", produtos[indice],
							precos[indice], quantidadeCarrinho[indice]);
					pulaLinha();
					System.out.print("Quantas unidades voc� deseja remover?: ");
					unidade = unidadeEscolhida(indice, quantidadeCarrinho);
					limpa();
					quantidadesEstoque[indice] = (quantidadesEstoque[indice] + unidade);
					quantidadeCarrinho[indice] = (quantidadeCarrinho[indice] - unidade);
					System.out.println("Seu Carrinho:");
					carrinho(codigos, produtos, quantidadeCarrinho, precos);
					subtotal = subTotal(precos, indice, unidade, subtotal, opcAlterar);
					System.out.printf("Subtotal: R$ %.2f ", subtotal);
					pulaLinha();
					System.out.print("Deseja fazer uma nova altera��o no carrinho? S-sim N-n�o: ");
					opcAlterar = tec.next().toUpperCase().charAt(0);
				}
				// Forma de pagamento
				limpa();
				System.out.println("Seu Carrinho:");
				carrinho(codigos, produtos, quantidadeCarrinho, precos);
				System.out.printf("Subtotal: R$ %.2f ", subtotal);
				pulaLinha();
				pulaLinha();
				System.out.print(
						"Escolha a forma de Pagamento: \n1 - � vista com 10% de desconto; \n2 - Cr�dito (1 a 3x sem juros).\n");
				System.out.print("Digite a op��o escolhida: ");
				opp = tec.nextInt();
				while (opp > 2 || opp < 1) {
					System.out.println("Dados incorretos! Digite uma op��o v�lida!");
					System.out.print(
							"Escolha a forma de Pagamento: \n1 - � vista com 10% de desconto \n2 - Cr�dito (1x a 3x sem juros) ");
					opp = tec.nextInt();
				}
				if (opp == 1) {
					pulaLinha();
					System.out.println("+--------------------------------------------------------+");
					System.out.printf("Op��o escolhida: R$ %.2f � vista (desconto de 10%%).\n",
							(subtotal - (subtotal / 100 * 10)));
					subtotal = (subtotal - (subtotal / 100 * 10));
				} else if (opp == 2) {
					System.out.print("Digite a op��o de parcelas desejada (1, 2 ou 3): ");
					parcelas = tec.nextInt();
					while (parcelas > 3) {
						pulaLinha();
						System.out.println("Dados incorretos! Digite uma parcela v�lida!");
						parcelas = tec.nextInt();
					}
					if (parcelas == 1) {
						pulaLinha();
						System.out.println("+--------------------------------------------------------+");
						System.out.printf("Forma de pagamento escolhida: 1x de R$ %.2f sem juros.\n", subtotal);
					}
					if (parcelas == 2) {
						pulaLinha();
						System.out.println("+--------------------------------------------------------+");
						System.out.printf("Forma de pagamento escolhida: em 2x de R$ %.2f sem juros.\n", subtotal / 2);
					}
					if (parcelas == 3) {
						pulaLinha();
						System.out.println("+--------------------------------------------------------+");
						System.out.printf("Forma de pagamento escolhida: em 3x de R$ %.2f sem juros.\n", subtotal / 3);
					}

				}
				opcao = 'N'; // Finaliza compra

			} while (opcao == 'S');
			System.out.println("+--------------------------------------------------------+");
			System.out.println("\t  Parab�ns pela sua compra, " + nomeUsuario + "!");

			pulaLinha();

			// Nota fiscal
			System.out.println("+--------------------------------------------------------+");
			System.out.println("\t \t    NOTA FISCAL");
			System.out.println("\t    	MUNDO INVERTIDO LTDA");
			System.out.println("\t    	Rua Stranger Things, 11");
			pulaLinha();
			System.out.println("Itens: ");
			carrinho(codigos, produtos, quantidadeCarrinho, precos);
			System.out.printf("Total: R$ %.2f", subtotal);
			pulaLinha();
			System.out.printf("Valor de ICMS incidente sobre a compra: R$ %.2f", ((subtotal / 100) * 9));
			pulaLinha();
			pulaLinha();
			System.out.printf("==========Obrigado por comprar na nossa loja!==========");
			pulaLinha();
			System.out.println("+--------------------------------------------------------+");
			System.out.print("\nNovo Cliente?: S-sim N-n�o "); // loop novo cliente
			fim = tec.next().toUpperCase().charAt(0);

			limpa();

			// Resetando as vari�veis.

			opcCompra = 'S';
			opcao = 'S';
			opcAlterar = 'N';
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

	}
//-------------------------------------------FUN��ES---------------------------------------------------------
	// BEM-VINDE

	public static String bemVinde() {
		Scanner tec = new Scanner(System.in);
		String nomeUsuario;
		String identidade;
		System.out.println("==========Bem-vindes ao Mundo Invertido==========");
		System.out.println("Para entrar, identifique-se.");
		System.out.print("Ol�, qual � o seu nome?: ");
		nomeUsuario = tec.next();
		System.out.print("Como voc� se identifica?: ");
		identidade = tec.next();
		return nomeUsuario;
	}

	// RECEBER CODIGO DO PRODUTO

	public static String receberCod() {
		Scanner tec = new Scanner(System.in);
		String codigoP;
		System.out.print("Informe o c�digo do produto: "); // Compra
		codigoP = tec.next().toUpperCase();
		return codigoP;
	}

	// LISTA DE PRODUTOS

	public static void ListaProdutos(String codigos[], String produtos[], int quantidadesEstoque[], double precos[]) {
		System.out.println("\t \t Lista de Produtos");
		System.out.printf("\t Codigo \tNome \t Quantidade \t Pre�o(R$) \t \n");

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
	}

	// CARRINHO

	public static void carrinho(String codigos[], String produtos[], int quantidadeCarrinho[], double precos[]) {
		System.out.printf("\t Codigo \tNome \t Quantidade \t Pre�o(R$) \t \n");
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

			}

		}

	}

	// UNIDADES ESCOLHIDAS DO PRODUTO

	public static int unidadeEscolhida(int indice, int quantidades[]) {
		Scanner tec = new Scanner(System.in);
		int unidade;
		unidade = tec.nextInt();
		while (unidade > quantidades[indice]) {
			System.out.print("A quantidade escolhida n�o pode ser maior do que a dispon�vel! Tente novamente: ");
			unidade = tec.nextInt();
		}
		return unidade;
	}

	// SUBTOTAL

	public static double subTotal(double precos[], int indice, int unidade, double subtotal, char opcAlterar) {

		if (opcAlterar != 'S') {
			subtotal = subtotal + (unidade * precos[indice]);
		} else if (opcAlterar == 'S') {
			subtotal = subtotal - (unidade * precos[indice]);
		}

		return subtotal;
	}

	// TESTE CODIGO

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
			}
			if (quantidadesEstoque[indice] == 0 && compCodigo == true) {
				System.out.println("Erro! Este produto n�o est� dispon�vel!");
				System.out.print("Digite o c�digo de outro produto: ");
				codigoP = tec.next().toUpperCase();
				compCodigo = false;
			}
		}
		return indice;
	}

	// LIMPAR CONSOLE

	public static void limpa() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	// PULAR LINHA
	public static void pulaLinha() {
		System.out.print("\n");
	}
}