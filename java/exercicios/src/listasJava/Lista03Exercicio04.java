package listasJava;

import java.util.Scanner;

/* Exercício 4
 * Faça um programa que leia duas matrizes 2 x 2 
 * com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 
deve ser criada. Na terceira opção o valor da constante 
deve ser lido e o resultado da adição da constante deve 
ser armazenado na própria matriz.

 */

public class Lista03Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		final int LIM = 2;
		double A[][] = new double [LIM][LIM];
		double B[][] = new double [LIM][LIM];
		double M[][] = new double [LIM][LIM];
		int i = 0, j = 0;
		double constante;
		byte opc = 1;
		
		//PROCESSAMENTO
		
		//Matriz A
		System.out.println("Gerando a matriz A");
		for(i = 0; i < LIM; i++) {
			for(j = 0; j < LIM; j++) {
				System.out.printf("Digite o valor de A[%d][%d]: ", i, j);
				A[i][j] = sc.nextDouble();
			}
		}
		System.out.println();
		
		//Matriz B
		System.out.println("Gerando a matriz B");
		for(i = 0; i < LIM; i++) {
			for(j = 0; j < LIM; j++) {
				System.out.printf("Digite o valor de B[%d][%d]: ", i, j);
				B[i][j] = sc.nextDouble();
			}
		}
		System.out.println();
		System.out.println("ESCOLHA UMA OPÇÃO");
		System.out.println();
		System.out.print("1 - SOMAR AS DUAS MATRIZES;\n2 - SUBTRAIR A PRIMEIRA MATRIZ DA SEGUNDA;"
				+ "\n3 - ADICIONAR UMA CONSTANTE ÀS DUAS MATRIZES;\n4 - IMPRIMIR AS MATRIZES.\n");
		System.out.print("Opção escolhida: ");
		opc = sc.nextByte();
		while (opc != 1 && opc != 2 && opc != 3 && opc != 4) {
			System.out.println("\nErro! Escolha uma oção válida: ");
			System.out.print("1 - SOMAR AS DUAS MATRIZES;\n2 - SUBTRAIR A PRIMEIRA MATRIZ DA SEGUNDA;"
					+ "\n3 - ADICIONAR UMA CONSTANTE ÀS DUAS MATRIZES;\n4 - IMPRIMIR AS MATRIZES.\n");
			System.out.print("Opção escolhida: ");
			opc = sc.nextByte();
		}
		
		//SAÍDAS
		
		if(opc == 1) { // OPÇÃO 1 ESCOLHIDA
			for(i = 0; i < LIM; i++) {
				for(j = 0; j < LIM; j++) {
					M[i][j] = A[i][j] + B[i][j];
				}
			}
			System.out.println();
			System.out.println("MATRIZ A:");
			for(i = 0; i < LIM; i++) {
				for (j = 0; j < LIM; j++) {
					System.out.printf("\t" + A[i][j] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("MATRIZ B:");
			for(i = 0; i < LIM; i++) {
				for (j = 0; j < LIM; j++) {
					System.out.printf("\t" + B[i][j] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("MATRIZ M (A + B):");
			for(i = 0; i < LIM; i++) {
				for (j = 0; j < LIM; j++) {
					System.out.printf("\t" + M[i][j] + "\t");
					}
				System.out.println();
				}
		}
		else if (opc == 2) { // OPÇÃO 2 ESCOLHIDA
			for(i = 0; i < LIM; i++) {
				for(j = 0; j < LIM; j++) {
					M[i][j] = B[i][j] - A[i][j];
				}
			}
			System.out.println();
			System.out.println("MATRIZ A:");
			for(i = 0; i < LIM; i++) {
				for (j = 0; j < LIM; j++) {
					System.out.printf("\t" + A[i][j] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("MATRIZ B:");
			for(i = 0; i < LIM; i++) {
				for (j = 0; j < LIM; j++) {
					System.out.printf("\t" + B[i][j] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("MATRIZ M (B - A):");
			for(i = 0; i < LIM; i++) {
				for (j = 0; j < LIM; j++) {
					System.out.printf("\t" + M[i][j] + "\t");
					}
				System.out.println();
				}
		}
		else if (opc == 3) { // OPÇÃO 3 ESCOLHIDA
			System.out.print("Digite um valor: ");
			constante = sc.nextDouble();
			for(i = 0; i < LIM; i++) {
				for(j = 0; j < LIM; j++) {
					A[i][j] = A[i][j] + constante;
					B[i][j] = B[i][j] + constante;
				}
			}
			System.out.println();
			System.out.println("MATRIZ A:");
			for(i = 0; i < LIM; i++) {
				for (j = 0; j < LIM; j++) {
					System.out.printf("\t" + A[i][j] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("MATRIZ B:");
			for(i = 0; i < LIM; i++) {
				for (j = 0; j < LIM; j++) {
					System.out.printf("\t" + B[i][j] + "\t");
					}
				System.out.println();
				}
		}
		else if (opc == 4) { // OPÇÃO 4 ESCOLHIDA
			System.out.println();
			System.out.println("MATRIZ A:");
			for(i = 0; i < LIM; i++) {
				for (j = 0; j < LIM; j++) {
					System.out.printf("\t" + A[i][j] + "\t");
					}
				System.out.println();
				}
			System.out.println();
			System.out.println("MATRIZ B:");
			for(i = 0; i < LIM; i++) {
				for (j = 0; j < LIM; j++) {
					System.out.printf("\t" + B[i][j] + "\t");
					}
				System.out.println();
				}
		}

		sc.close();
	}

}
