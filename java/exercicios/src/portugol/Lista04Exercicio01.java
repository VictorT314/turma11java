package portugol;

import java.util.Scanner;

/* Exerc�cio 1
 * Fa�a um programa que crie um vetor por leitura 
 * com 5 valores de pontua��o de uma atividade e o 
 * escreva em seguida. Encontre ap�s a maior pontua��o 
 * e a apresente.
 */
public class Lista04Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		final int LIM = 5;
		double[] pontuacoes = new double[LIM];
		double maiorPontuacao = 0;
		int contador = 0;
		
		//PROCESSAMENTO
		for(int i = 0; i < LIM; i++) {
			System.out.print("Digite a pontua��o do aluno: ");
			pontuacoes[i] = sc.nextDouble();
			
			if(pontuacoes[i] > maiorPontuacao) {
				maiorPontuacao = pontuacoes[i];
			}
		}
				
		//SA�DAS
		pula();
		System.out.println("**** Lista de pontua��es ****");
		pula();
		pula();
		while(contador < LIM) {
			System.out.println("Pontua��o " + (contador + 1) + ": " + pontuacoes[contador]);
			pula();
			contador++;
		}
		pula();
		System.out.println("Maior pontua��o: " + maiorPontuacao);
		pula();

		sc.close();
	}
	public static void pula() {
		System.out.println();
	}
}
