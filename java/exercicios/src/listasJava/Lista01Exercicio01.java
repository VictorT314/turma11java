package listasJava;

import java.util.Scanner;

/*
 * Exerc�cio 1
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 * 
 */
public class Lista01Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int a, b, c;
		
		//PROCESSAMENTO + SA�DAS
		System.out.print("Digite o valor de A: ");
		a = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		b = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.printf("\nO maior n�mero � %d.", a);
		}
		else if(b > a && b > c) {
			System.out.printf("\nO maior n�mero � %d.", b);
		}
		else {
			System.out.printf("\nO maior n�mero � %d.", c);
		}
		
		
		sc.close();
	}

}