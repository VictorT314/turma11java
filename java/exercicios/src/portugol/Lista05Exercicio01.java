package portugol;

import java.util.Scanner;

/* Exercício 1
 * Elabore um programa que calcule o que deve 
 * ser pago por um produto, considerando o preço 
 * normal de etiqueta e a escolha da condição de 
 * pagamento. Utilize os códigos da tabela a seguir 
 * para ler qual a condição de pagamento escolhida e 
 * efetuar o cálculo adequado. 
	Código Condição de pagamento 
	1 - À vista em dinheiro ou cheque, recebe 20% de desconto 
	2 - À vista no cartão de crédito, recebe 15% de desconto 
	3 - Em duas vezes, preço normal de etiqueta sem juros 
	4 - Em três vezes, preço normal de etiqueta mais juros de 10%

 */

public class Lista05Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// VARIÁVEIS
		final int LIM = 4;
		int opcao;
		double valor, valorFinal = 0.00;
		String[] opcoes = {
		"1 - À vista em dinheiro ou cheque, recebe 20% de desconto", 
		"2 - À vista no cartão de crédito, recebe 15% de desconto",
		"3 - Em duas vezes, preço normal de etiqueta sem juros",
		"4 - Em três vezes, preço normal de etiqueta mais juros de 10%"};

		//PROCESSAMENTO
		System.out.print("Informe o preço do produto: ");
		valor = sc.nextDouble();

		while(valor < 0.00){
			System.out.print("Valor incompatível! Informe um valor positivo!");
			pula();
			System.out.print("Informe o preço do produto: ");
			valor = sc.nextDouble();
		}
		System.out.print("CONDIÇÕES DE PAGAMENTO");
		pula();
		pula();
		for(int i = 0; i < LIM; i++){
			System.out.print(opcoes[i]);
			pula();
		}
		System.out.print("Por favor, selecione uma opção: ");
		opcao = sc.nextInt();

		while(opcao != 1 && opcao != 2 && opcao!= 3 && opcao != 4){
			System.out.print("Opção inválida! Tente novamente.");
			pula();
			System.out.print("Por favor, selecione uma opção válida: ");
			opcao = sc.nextInt();
		}

		//SAÍDAS
		if (opcao == 1){
			valorFinal = valor - 0.2*valor;
			System.out.print("OPÇÃO ESCOLHIDA");
			pula();
			System.out.print(opcoes[opcao-1]);
			pula();
			pula();
			System.out.printf("Valor inicial = R$ %.2f\tValor final = R$ %.2f", valor, valorFinal);
			pula();
		}
		else if(opcao == 2){
			valorFinal = valor - 0.15*valor;
			System.out.print("OPÇÃO ESCOLHIDA");
			pula();
			System.out.print(opcoes[opcao-1]);
			pula();
			pula();
			System.out.printf("Valor inicial = R$ %.2f\tValor final = R$ %.2f", valor, valorFinal);
			pula();
		}
		else if(opcao == 3){
			valorFinal = valor;
			System.out.print("OPÇÃO ESCOLHIDA");
			pula();
			System.out.print(opcoes[opcao-1]);
			pula();
			pula();
			System.out.printf("Valor inicial = R$ %.2f\tValor final = R$ %.2f em 2x de R$ %.2f", valor, valorFinal, (valorFinal/2));
			pula();
		}
		else{
			valorFinal = valor + 0.10*valor;
			System.out.print("OPÇÃO ESCOLHIDA");
			pula();
			System.out.print(opcoes[opcao-1]);
			pula();
			pula();
			System.out.printf("Valor inicial = R$ %.2f\tValor final = R$ %.2f em 3x de R$ %.2f", valor, valorFinal, (valorFinal/3));
			pula();
		}
		
		sc.close();
	}
	
	//FUNÇÕES
	public static void pula() {
		System.out.println();
	}

}
