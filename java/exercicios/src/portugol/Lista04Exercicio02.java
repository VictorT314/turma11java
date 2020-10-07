package portugol;

import java.util.Scanner;
import java.util.Random;

/* Exerc�cio 2
 * Um dado � lan�ado 10 vezes e o valor correspondente 
 * � anotado. Fa�a um programa que gere um vetor com os 
 * lan�amentos, escreva esse vetor. A seguir determine e 
 * imprima a m�dia aritm�tica dos lan�amentos, contabilize 
 * e apresente tamb�m quantas foram as ocorr�ncias da maior 
 * pontua��o.
 */
public class Lista04Exercicio02 {

	public static void main(String[] args) {
		Random sorteia = new Random();
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		final int LIM = 10;
		int[] lancamentos = new int[LIM];
		int soma = 0, maiorPontuacao = 0;
		double media = 0;
		
		//PROCESSAMENTO
		for(int i = 0; i < LIM; i++) {
			lancamentos[i] = 1 + sorteia.nextInt(6);
			soma = soma + lancamentos[i];
			
			if (lancamentos[i] == 6) {
				maiorPontuacao++;
			}
		}
		media = soma/LIM;
		
		//SA�DAS
		for(int i = 0; i < LIM; i++){
			System.out.println("O lan�amento " + (i + 1) + " resultou em: " + lancamentos[i]);
		}
		pula();
		System.out.println("M�dia de lan�amentos: " + media);
		System.out.printf("N�mero de ocorr�ncias do valor 6: " + maiorPontuacao);
		sc.close();
	}
	public static void pula() {
		System.out.println();
	}
}
