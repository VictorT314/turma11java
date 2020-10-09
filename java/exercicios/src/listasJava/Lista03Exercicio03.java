package listasJava;

import java.util.Scanner;

/* Exercício 3
 * Leia uma matriz 3 x 3, conte e escreva 
 * quantos valores maiores que 10 ela possui.
 */

public class Lista03Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double M[][] = new double[3][3];
		int maiorDez = 0, i = 0, j = 0;
		
		//PROCESSAMENTO
		for(i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("Digite um valor para M[%d][%d]: ", i, j);
				M[i][j] = sc.nextDouble();
				if (M[i][j] > 10) {
					maiorDez++;
				}
			}
		}
		System.out.println();
		System.out.println("MATRIZ M:");
		for(i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("\t" + M[i][j] + "\t");
				}
			System.out.println();
			}
		

		
		//SAÍDAS
		System.out.println();
		System.out.printf("A matriz M possui %d valores maiores do que 10.", maiorDez);
		
		sc.close();
	}
}

