package listasJava;

import java.util.Scanner;

/* Exercício 1
 * Faça um programa que possua um vetor denominado A 
 * que armazene 6 números inteiros. O programa deve 
 * executar os seguintes passos:
 *  
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma 
entre os valores das posições A[0], A[1] e A[5] do vetor 
e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta 
posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada 
linha.

 */

public class Lista03Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int A[] = new int[6];
		int soma = 0, i = 0;
		
		//PROCESSAMENTO
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		soma = A[0] + A[1] + A[5];
		A[4] = 100;
		
		
		//SAÍDAS
		System.out.printf("Soma = %d", soma);
		for (i = 0; i < 6; i++) {
			System.out.println();
			System.out.printf("A[%d] = %d", i, A[i]);
		}

		sc.close();
	}

}
