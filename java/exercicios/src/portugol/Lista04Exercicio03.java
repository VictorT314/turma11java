package portugol;

import java.util.Random;
import java.util.Scanner;

/* Exercício 3
 * Escrever um programa que lê duas matrizes N1 (4,6) 
 * e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas 
dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças 
dos elementos de mesma posição das matrizes N1 e N2.
 */

public class Lista04Exercicio03 {

	public static void main(String[] args) {
		Random sorteia = new Random();
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int[][] N1 = new int [4][6];
		int[][] N2 = new int [4][6];
		int[][] M1 = new int [4][6];
		int[][] M2 = new int [4][6];
		int i = 0, j = 0;
		
		//PROCESSAMENTOS
		for(i = 0; i < 4; i++){ //SORTEANDO VALORES PARA AS MATRIZES E REALIZANDO AS OPERAÇÕES;
			for(j = 0; j < 6; j++){
				N1[i][j] = sorteia.nextInt(100);
				N2[i][j] = sorteia.nextInt(100);
				M1[i][j] = N1[i][j] + N2[i][j];
				M2[i][j] = N1[i][j] - N2[i][j];
			}
		}
		
		//SAÍDAS
		pula();
		System.out.print("MATRIZ N1: ");
		pula();
		pula();
		for(i = 0; i < 4; i++){ //ESCREVENDO A MATRIZ N1
			for(j = 0; j < 6; j++){
				System.out.print(N1[i][j]);
				System.out.print("\t");
			}
			pula();
		}
		pula();
		System.out.print("MATRIZ N2: ");
		pula();
		pula();
		for(i = 0; i < 4; i++){ //ESCREVENDO A MATRIZ N2
			for(j = 0; j < 6; j++){
				System.out.print(N2[i][j]);
				System.out.print("\t");
			}
			pula();
		}
		
		pula();
		System.out.print("MATRIZ M1 (onde M1 = N1 + N2): ");
		pula();
		pula();
		for(i = 0; i < 4; i++){ // ESCREVENDO A MATRIZ M1
			for(j = 0; j < 6; j++){
				System.out.print(M1[i][j]);
				System.out.print("\t");
			}
			pula();
		}
		pula();
		System.out.print("MATRIZ M2 (onde M2 = N1 - N2): ");
		pula();
		pula();
		for(i = 0; i < 4; i++){ // ESCREVENDO A MATRIZ M2
			for(j = 0; j < 6; j++){
				System.out.print(M2[i][j]);
				System.out.print("\t");
			}
			pula();
		}

		sc.close();
	}
	public static void pula() {
		System.out.println();
	}
}
