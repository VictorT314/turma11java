package listasJava;

import java.util.Scanner;

/* Exercício 5
 * Crie um programa que leia um número do teclado 
 * até que encontre um número igual a zero. No final, 
 * mostre a soma dos números digitados.(DO...WHILE)
 */


public class Lista02Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double numero, soma = 0;
		
		//PROCESSAMENTO
		do {
			System.out.println("\nPara sair, digite '0'");
			System.out.print("\nDigite um número: ");
			numero = sc.nextDouble();
			soma = soma + numero;
		}while(numero != 0);
		
		//SAÍDAS
		System.out.print("\n----------------------------------------------\n");
		System.out.printf("\nA soma dos números digitados vale %.2f.", soma);
		
		
		sc.close();
	}

}
