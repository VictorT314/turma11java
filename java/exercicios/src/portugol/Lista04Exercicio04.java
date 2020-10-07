package portugol;

import java.util.Random;
import java.util.Scanner;

/*
 * Exercício 4
 * Crie um programa que receba valores do usuário 
 * para preencher uma matriz 3X3, e em seguida, 
 * exiba a soma dos valores dela e a soma dos valores 
 * da primeira diagonal, ou seja, diagonal principal.
 */
public class Lista04Exercicio04 {

	public static void main(String[] args) {
		Random sorteia = new Random();
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		final int LIM = 3;
		int[][] M = new int [LIM][LIM];
		int somaElementos = 0, somaDiagonal = 0, i = 0, j = 0;
		
		//PROCESSAMENTO
		for(i = 0; i < LIM; i++) {
			for(j = 0; j < LIM; j++) {
				M[i][j] = sorteia.nextInt(100);
				somaElementos = somaElementos + M[i][j];
				if(i == j) {
					somaDiagonal = somaDiagonal + M[i][j];
				}
			}
		}
		pula();
		
		//SAÍDAS
		System.out.print("MATRIZ M: ");
		pula();
		pula();
		for(i = 0; i < 3; i++){
			for(j = 0; j < 3; j++){
				System.out.print(M[i][j]);
				System.out.print("\t");
			}
			pula();
		}
		pula();
		System.out.print("A soma dos elementos de M é " + somaElementos);
		pula();
		System.out.print("A soma dos elementos da diagonal principal de M é " + somaDiagonal);
		pula();

		sc.close();
	}
	public static void pula() {
		System.out.println();
	}

}
