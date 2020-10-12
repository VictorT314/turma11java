package Loja;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		// VARI�VEIS
		String produtos[] = { "CAMISETA BRANCA", "CAMISETA PRETA", "CAMISETA AZUL", "CAMISETA VERMELHA", "CAL�A JEANS",
				"CAL�A PRETA", "VESTIDO BRANCO", "VESTIDO PRETO", "MOLETOM", "BOLSA" };
		String codigos[] = { "1B", "1P", "1A", "1V", "2J", "2P", "3B", "3P", "4M", "5B" };
		int quantidadesEstoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		double precos[] = { 40, 40, 40, 40, 90, 90, 120, 120, 120, 90 };
		String nomeUsuario, codigoP = " ";
		char identidade, opc, fim, alterar;
		int x = 0, y = 0, indice = 0, unidade = 0;
		int quantidadeCarrinho[] = new int[10];
		double subtotal = 0;
		boolean testeCodigo = false;
		byte opcaoCarrinho = 0, opcaoPagamento = 0;

		// PROGRAMA
		System.out.println("Para entrar Identifique-se:");
		System.out.print("Qual seu nome?!: ");
		nomeUsuario = tec.next();
		System.out.print("Como voc� se identifica?!: ");
		identidade = tec.next().charAt(0);
		System.out.println("Sejam Bem Vindes!!!");

		do { // La�o para repetir quando um novo cliente entrar.

			do { // La�o para compras.

				listaProdutos(codigos, produtos, quantidadesEstoque, precos);

				codigoP = receberCodigo();

				indice = testeCodigo(testeCodigo, codigoP, codigos, quantidadesEstoque);

				System.out.println(produtos[indice] + "    R$ " + precos[indice] + "   Quantidade dispon�vel: "
						+ quantidadesEstoque[indice] + " Unidades");

				System.out.print("Quantas unidades voc� deseja: ");
				unidade = tec.nextInt();

				while (unidade > quantidadesEstoque[indice]) {
					System.out
							.println("Erro! A quantidade escolhida n�o pode ser maior do que a que temos em estoque!");
					System.out.print("Quantas unidades voc� deseja: ");
					unidade = tec.nextInt();
				}

				quantidadesEstoque[indice] = (quantidadesEstoque[indice] - unidade);
				quantidadeCarrinho[indice] = (quantidadeCarrinho[indice] + unidade);

				subtotal = subtotal(subtotal, unidade, precos, quantidadeCarrinho, opcaoCarrinho);

				listaProdutos(codigos, produtos, quantidadesEstoque, precos);

				carrinho(codigos, produtos, quantidadeCarrinho, precos);

				System.out.printf("Subtotal: R$ %.2f ", subtotal);
				System.out.println();

				System.out.print("Deseja continuar comprando?!: S-sim  N-n�o  ");
				opc = tec.next().toUpperCase().charAt(0);

				testeCodigo = false;
			} while (opc == 'S'); // Fim do la�o para compras.

			do { // La�o para altera��es no carrinho.
				limpa();
				carrinho(codigos, produtos, quantidadeCarrinho, precos);
				System.out.printf("Subtotal: R$ %.2f ", subtotal);
				System.out.println();
				System.out.print("Deseja alterar o seu carrinho? S - sim ou N - n�o: ");
				alterar = tec.next().toUpperCase().charAt(0);

				if (alterar == 'S') {
					System.out.println("Escolha uma op��o: ");
					System.out.print(
							"1 - Adicionar mais produtos;\n2 - Remover algum produto;\n3 - Prosseguir para o pagamento.");
					System.out.print("Op��o escolhida: ");
					opcaoCarrinho = tec.nextByte();

					alterarCarrinho(opcaoCarrinho, alterar, codigos, produtos, quantidadesEstoque, quantidadeCarrinho,
							precos, codigoP, indice, unidade, subtotal, opc, testeCodigo);
				}

			} while (alterar == 'S'); // Fim do la�o para altera��es no carrinho. Sa�da para pagamento.
			limpa();
			carrinho(codigos, produtos, quantidadeCarrinho, precos);
			System.out.printf("Subtotal: R$ %.2f ", subtotal);
			System.out.println();
			System.out.println("Escolha a forma de pagamento de pagamento: ");
			System.out.println("1 - � vista com 10% de desconto;\n2 - Em 1 a 3 vezes no cr�dito.");
			System.out.print("Op��o escolhida: ");
			opcaoPagamento = tec.nextByte();
			fim = tec.next().toUpperCase().charAt(0);

		} while (fim == 'S'); // Fim do la�o de novos clientes e fim do programa.

	}

	// ----------------------------------------------FUN��ES--------------------------------------------------

	// RECEBER C�DIGO DO PRODUTO
	public static String receberCodigo() {
		String codigoP;
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite o c�digo do produto: ");
		codigoP = tec.next().toUpperCase();

		return codigoP;
	}

	// TESTANDO C�DIGO DO PRODUTO
	/*
	 * Este m�todo realiza os testes com o c�digo fornecido pelo usu�rio, sendo
	 * eles, respectivamente:
	 * 
	 * Verificar se o c�digo � v�lido; --> Caso v�lido, buscar o �ndice
	 * correspondente ao c�digo e guardar este valor na vari�vel local indice; -->
	 * Se n�o, pedir um c�digo v�lido ao usu�rio at� que o mesmo digite um v�lido;
	 * 
	 * Verificar se o produto escolhido possui unidades dispon�veis no estoque para
	 * venda; --> Caso verdadeiro, a fun��o retornar� o �ndice a ser usado nos
	 * vetores durante o programa; --> Se n�o, informar que o produto est� fora de
	 * estoque e pedir um novo c�digo ao usu�rio at� que receba um c�digo com
	 * unidades do produto em estoque.
	 */

	public static int testeCodigo(boolean testeCodigo, String codigoP, String codigos[], int quantidadesEstoque[]) {
		Scanner tec = new Scanner(System.in);

		int indice = 0;

		while (testeCodigo == false) {
			for (int i = 0; i < codigos.length; i++) {
				if (codigos[i].equals(codigoP)) {
					testeCodigo = true;
				}
			}
			if (testeCodigo == false) {
				System.out.println("Erro! Digite um c�digo v�lido!");
				System.out.print("Digite o c�digo do produto: ");
				codigoP = tec.next().toUpperCase();
			}
			if (testeCodigo) {
				for (int x = 0; x < codigos.length; x++) {
					if (codigos[x].equals(codigoP)) {
						indice = x;
					}
				}
				for (int i = 0; i < codigos.length; i++) {
					if (quantidadesEstoque[indice] == 0 && codigos[indice].equals(codigoP)) {
						System.out.println("Erro! Este produto est� fora de estoque!");
						System.out.print("Digite o c�digo de outro produto: ");
						codigoP = tec.next().toUpperCase();
						testeCodigo = false;
					}

				}
			}
		}
		return indice;
	}

	// LISTA DE PRODUTOS
	public static void listaProdutos(String codigos[], String produtos[], int quantidadesEstoque[], double precos[]) {
		System.out.println("Lista de Produtos");

		for (int x = 0; x < precos.length; x++) {
			System.out.printf("\t %s \t %s \t %d \t %.2f \n", codigos[x], produtos[x], quantidadesEstoque[x],
					precos[x]);
		}
	}

	// CARRINHO DE COMPRAS
	public static void carrinho(String codigos[], String produtos[], int quantidadeCarrinho[], double precos[]) {
		System.out.println("Seu Carrinho:");
		for (int x = 0; x < precos.length; x++) {
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

	// SUBTOTAL
	public static double subtotal(double subtotal, int unidade, double precos[], int quantidadeCarrinho[],
			int opcaoCarrinho) {

		for (int x = 0; x < quantidadeCarrinho.length; x++) {

			if (opcaoCarrinho == 2 && quantidadeCarrinho[x] != 0 && quantidadeCarrinho[x] >= unidade) {
				subtotal = subtotal - (quantidadeCarrinho[x] * precos[x]);
			}
			if (quantidadeCarrinho[x] != 0 && quantidadeCarrinho[x] == unidade) {
				subtotal = subtotal + (quantidadeCarrinho[x] * precos[x]);

			}

		}
		return subtotal;
	}

	// FUN��O ALTERAR CARRINHO
	public static void alterarCarrinho(byte opcaoCarrinho, char alterar, String codigos[], String produtos[],
			int quantidadesEstoque[], int quantidadeCarrinho[], double precos[], String codigoP, int indice,
			int unidade, double subtotal, char opc, boolean testeCodigo) {
		Scanner tec = new Scanner(System.in);
		if (opcaoCarrinho == 1) {
			listaProdutos(codigos, produtos, quantidadesEstoque, precos);

			codigoP = receberCodigo();

			indice = testeCodigo(testeCodigo, codigoP, codigos, quantidadesEstoque);

			System.out.println(produtos[indice] + "    R$ " + precos[indice] + "   Quantidade dispon�vel: "
					+ quantidadesEstoque[indice] + " Unidades");

			System.out.print("Quantas unidades voc� deseja: ");
			unidade = tec.nextInt();

			while (unidade > quantidadesEstoque[indice]) {
				System.out.println("Erro! A quantidade escolhida n�o pode ser maior do que a que temos em estoque!");
				System.out.print("Quantas unidades voc� deseja: ");
				unidade = tec.nextInt();
			}

			quantidadesEstoque[indice] = (quantidadesEstoque[indice] - unidade);
			quantidadeCarrinho[indice] = (quantidadeCarrinho[indice] + unidade);

			subtotal = subtotal(subtotal, unidade, precos, quantidadeCarrinho, opcaoCarrinho);

			listaProdutos(codigos, produtos, quantidadesEstoque, precos);

			carrinho(codigos, produtos, quantidadeCarrinho, precos);

			System.out.printf("Subtotal: R$ %.2f ", subtotal);
			System.out.println();

			System.out.print("Deseja continuar comprando?!: S-sim  N-n�o  ");
			opc = tec.next().toUpperCase().charAt(0);

			testeCodigo = false;
		} else if (opcaoCarrinho == 2) {
			limpa();
			carrinho(codigos, produtos, quantidadeCarrinho, precos);
			System.out.printf("Subtotal: R$ %.2f ", subtotal);
			System.out.println();
			System.out.print("Digite o c�digo do produto que deseja remover: ");
			codigoP = receberCodigo();
			indice = testeCodigo(testeCodigo, codigoP, codigos, quantidadeCarrinho);

			System.out.println(produtos[indice] + "    R$ " + precos[indice] + "   Quantidade no carrinho: "
					+ quantidadeCarrinho[indice] + " Unidades");
			System.out.print("Quantas unidades voc� deseja remover?: ");
			unidade = tec.nextInt();

			while (unidade > quantidadesEstoque[indice]) {
				System.out.println("Erro! A quantidade escolhida n�o pode ser maior do que a que temos em estoque!");
				System.out.print("Quantas unidades voc� deseja: ");
				unidade = tec.nextInt();
			}

			quantidadesEstoque[indice] = (quantidadesEstoque[indice] + unidade);
			quantidadeCarrinho[indice] = (quantidadeCarrinho[indice] - unidade);

		}
	}

	// LIMPAR CONSOLE
	public static void limpa() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

}
