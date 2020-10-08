package listasJava;

import java.util.Scanner;

/* Exerc�cio 5
 * Crie um programa que leia um n�mero do teclado 
 * at� que encontre um n�mero igual a zero. No final, 
 * mostre a soma dos n�meros digitados.(DO...WHILE)
 */


public class Lista02Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		double numero, soma = 0;
		
		//PROCESSAMENTO
		do {
			System.out.println("\nPara sair, digite '0'");
			System.out.print("\nDigite um n�mero: ");
			numero = sc.nextDouble();
			soma = soma + numero;
		}while(numero != 0);
		
		//SA�DAS
		System.out.print("\n----------------------------------------------\n");
		System.out.printf("\nA soma dos n�meros digitados vale %.2f.", soma);
		
		
		sc.close();
	}

}
