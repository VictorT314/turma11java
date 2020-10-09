package portugol;

import java.util.Scanner;

/* Exerc�cio 1
 * Elabore um programa que calcule o que deve 
 * ser pago por um produto, considerando o pre�o 
 * normal de etiqueta e a escolha da condi��o de 
 * pagamento. Utilize os c�digos da tabela a seguir 
 * para ler qual a condi��o de pagamento escolhida e 
 * efetuar o c�lculo adequado. 
	C�digo Condi��o de pagamento 
	1 - � vista em dinheiro ou cheque, recebe 20% de desconto 
	2 - � vista no cart�o de cr�dito, recebe 15% de desconto 
	3 - Em duas vezes, pre�o normal de etiqueta sem juros 
	4 - Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%

 */

public class Lista05Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// VARI�VEIS
		final int LIM = 4;
		int opcao;
		double valor, valorFinal = 0.00;
		String[] opcoes = {
		"1 - � vista em dinheiro ou cheque, recebe 20% de desconto", 
		"2 - � vista no cart�o de cr�dito, recebe 15% de desconto",
		"3 - Em duas vezes, pre�o normal de etiqueta sem juros",
		"4 - Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%"};

		//PROCESSAMENTO
		System.out.print("Informe o pre�o do produto: ");
		valor = sc.nextDouble();

		while(valor < 0.00){
			System.out.print("Valor incompat�vel! Informe um valor positivo!");
			pula();
			System.out.print("Informe o pre�o do produto: ");
			valor = sc.nextDouble();
		}
		System.out.print("CONDI��ES DE PAGAMENTO");
		pula();
		pula();
		for(int i = 0; i < LIM; i++){
			System.out.print(opcoes[i]);
			pula();
		}
		System.out.print("Por favor, selecione uma op��o: ");
		opcao = sc.nextInt();

		while(opcao != 1 && opcao != 2 && opcao!= 3 && opcao != 4){
			System.out.print("Op��o inv�lida! Tente novamente.");
			pula();
			System.out.print("Por favor, selecione uma op��o v�lida: ");
			opcao = sc.nextInt();
		}

		//SA�DAS
		if (opcao == 1){
			valorFinal = valor - 0.2*valor;
			System.out.print("OP��O ESCOLHIDA");
			pula();
			System.out.print(opcoes[opcao-1]);
			pula();
			pula();
			System.out.printf("Valor inicial = R$ %.2f\tValor final = R$ %.2f", valor, valorFinal);
			pula();
		}
		else if(opcao == 2){
			valorFinal = valor - 0.15*valor;
			System.out.print("OP��O ESCOLHIDA");
			pula();
			System.out.print(opcoes[opcao-1]);
			pula();
			pula();
			System.out.printf("Valor inicial = R$ %.2f\tValor final = R$ %.2f", valor, valorFinal);
			pula();
		}
		else if(opcao == 3){
			valorFinal = valor;
			System.out.print("OP��O ESCOLHIDA");
			pula();
			System.out.print(opcoes[opcao-1]);
			pula();
			pula();
			System.out.printf("Valor inicial = R$ %.2f\tValor final = R$ %.2f em 2x de R$ %.2f", valor, valorFinal, (valorFinal/2));
			pula();
		}
		else{
			valorFinal = valor + 0.10*valor;
			System.out.print("OP��O ESCOLHIDA");
			pula();
			System.out.print(opcoes[opcao-1]);
			pula();
			pula();
			System.out.printf("Valor inicial = R$ %.2f\tValor final = R$ %.2f em 3x de R$ %.2f", valor, valorFinal, (valorFinal/3));
			pula();
		}
		
		sc.close();
	}
	
	//FUN��ES
	public static void pula() {
		System.out.println();
	}

}
