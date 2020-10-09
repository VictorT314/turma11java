package listasJava;

import java.util.Scanner;

/* Exercício 2
 * Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

 */

public class Lista03Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int numeros[] = new int[6];
		int i = 0, somaPares = 0, quantidadeImpares = 0;
		
		//PROCESSAMENTO
		for(i = 0; i < 6; i++) {
			System.out.print("Digite um número inteiro positivo: ");
			numeros[i] = sc.nextInt();
			while(numeros[i] < 0) {
				System.out.println("Erro! O número deve ser inteiro e positivo!");
				System.out.print("Digite um número inteiro positivo: ");
				numeros[i] = sc.nextInt();
			}
		}
		
		//SAÍDAS
		System.out.println();
		System.out.println("NÚMEROS PARES");
		for (i = 0; i < 6; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + "\t");
				somaPares = somaPares + numeros[i];
			}
		}
		System.out.println();
		System.out.printf("Soma dos números pares: %d", somaPares);
		System.out.println();
		System.out.println();
		System.out.println("NÚMEROS ÍMPARES");
		for (i = 0; i < 6; i++) {
			if (numeros[i] % 2 != 0) {
				System.out.print(numeros[i] + "\t");
				quantidadeImpares++;
			}
		}
		System.out.println();
		System.out.printf("Quantidade de números ímpares: %d", quantidadeImpares);
		
		sc.close();
	}

}
