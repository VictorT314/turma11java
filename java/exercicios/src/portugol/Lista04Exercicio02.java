package portugol;

import java.util.Scanner;
import java.util.Random;

/* Exercício 2
 * Um dado é lançado 10 vezes e o valor correspondente 
 * é anotado. Faça um programa que gere um vetor com os 
 * lançamentos, escreva esse vetor. A seguir determine e 
 * imprima a média aritmética dos lançamentos, contabilize 
 * e apresente também quantas foram as ocorrências da maior 
 * pontuação.
 */
public class Lista04Exercicio02 {

	public static void main(String[] args) {
		Random sorteia = new Random();
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
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
		
		//SAÍDAS
		for(int i = 0; i < LIM; i++){
			System.out.println("O lançamento " + (i + 1) + " resultou em: " + lancamentos[i]);
		}
		pula();
		System.out.println("Média de lançamentos: " + media);
		System.out.printf("Número de ocorrências do valor 6: " + maiorPontuacao);
		sc.close();
	}
	public static void pula() {
		System.out.println();
	}
}
