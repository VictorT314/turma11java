package portugol;

import java.util.Scanner;

/* Exercício 1
 * Faça um programa que crie um vetor por leitura 
 * com 5 valores de pontuação de uma atividade e o 
 * escreva em seguida. Encontre após a maior pontuação 
 * e a apresente.
 */
public class Lista04Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		final int LIM = 5;
		double[] pontuacoes = new double[LIM];
		double maiorPontuacao = 0;
		int contador = 0;
		
		//PROCESSAMENTO
		for(int i = 0; i < LIM; i++) {
			System.out.print("Digite a pontuação do aluno: ");
			pontuacoes[i] = sc.nextDouble();
			
			if(pontuacoes[i] > maiorPontuacao) {
				maiorPontuacao = pontuacoes[i];
			}
		}
				
		//SAÍDAS
		pula();
		System.out.println("**** Lista de pontuações ****");
		pula();
		pula();
		while(contador < LIM) {
			System.out.println("Pontuação " + (contador + 1) + ": " + pontuacoes[contador]);
			pula();
			contador++;
		}
		pula();
		System.out.println("Maior pontuação: " + maiorPontuacao);
		pula();

		sc.close();
	}
	public static void pula() {
		System.out.println();
	}
}
