package listasJava;

import java.util.Scanner;

/* Exerc�cio 2
 * Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

 */

public class Lista03Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int numeros[] = new int[6];
		int i = 0, somaPares = 0, quantidadeImpares = 0;
		
		//PROCESSAMENTO
		for(i = 0; i < 6; i++) {
			System.out.print("Digite um n�mero inteiro positivo: ");
			numeros[i] = sc.nextInt();
			while(numeros[i] < 0) {
				System.out.println("Erro! O n�mero deve ser inteiro e positivo!");
				System.out.print("Digite um n�mero inteiro positivo: ");
				numeros[i] = sc.nextInt();
			}
		}
		
		//SA�DAS
		System.out.println();
		System.out.println("N�MEROS PARES");
		for (i = 0; i < 6; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + "\t");
				somaPares = somaPares + numeros[i];
			}
		}
		System.out.println();
		System.out.printf("Soma dos n�meros pares: %d", somaPares);
		System.out.println();
		System.out.println();
		System.out.println("N�MEROS �MPARES");
		for (i = 0; i < 6; i++) {
			if (numeros[i] % 2 != 0) {
				System.out.print(numeros[i] + "\t");
				quantidadeImpares++;
			}
		}
		System.out.println();
		System.out.printf("Quantidade de n�meros �mpares: %d", quantidadeImpares);
		
		sc.close();
	}

}
