package listasJava;

import java.util.Scanner;

/* Exercício 4
 * Faça um programa em que permita a entrada de um número 
 * qualquer e exiba se este número é par ou ímpar. Se for 
 * par exiba também a raiz quadrada do mesmo; se for ímpar 
 * exiba o número elevado ao quadrado.
 */

public class Lista01Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int numero;
		
		//PROCESSAMENTOS + SAÍDAS
		System.out.print("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			if(numero % 2 == 0) {
				System.out.printf("\nO número %d é par.", numero);
				System.out.printf("\nA raiz quadrada de %d é %.2f.", numero, (Math.sqrt(numero)));
			}
			else {
				System.out.printf("\nO número %d é ímpar.", numero);
				System.out.printf("\nO quadrado de %d é %d.", numero, (numero * numero));
			}
		}
		else {
			System.out.printf("\nO número %d é negativo.", numero);
		}
		
		
		sc.close();
	}

}
