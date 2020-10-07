package listasJava;

import java.util.Scanner;

/*
 * Exercício 1
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 * 
 */
public class Lista01Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int a, b, c;
		
		//PROCESSAMENTO + SAÍDAS
		System.out.print("Digite o valor de A: ");
		a = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		b = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.printf("\nO maior número é %d.", a);
		}
		else if(b > a && b > c) {
			System.out.printf("\nO maior número é %d.", b);
		}
		else {
			System.out.printf("\nO maior número é %d.", c);
		}
		
		
		sc.close();
	}

}