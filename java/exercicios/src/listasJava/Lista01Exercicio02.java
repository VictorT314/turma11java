package listasJava;

import java.util.Scanner;

/* Exerc�cio 2
 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 * 
 */
public class Lista01Exercicio02 {

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
		
		if (a <= b && a <= c) {
			if(b <= c) {
				System.out.printf("Em ordem crescente: %d; %d e %d", a, b, c);
			}
			else {
				System.out.printf("Em ordem crescente: %d; %d e %d", a, c, b);
			}
		}
		else if(b <= a && b <= c) {
			if (a <= c) {
				System.out.printf("Em ordem crescente: %d; %d e %d", b, a, c);
			}
			else {
				System.out.printf("Em ordem crescente: %d; %d e %d", b, c, a);
			}
		}
		else if(c <= a && c <= b) {
			if (a <= b) {
				System.out.printf("Em ordem crescente: %d; %d e %d", c, a, b);
			}
			else {
				System.out.printf("Em ordem crescente: %d; %d e %d", c, b, a);
			}
		}
		else {
			System.out.printf("Em ordem crescente: %d; %d e %d", a, b, c);
		}
		
		sc.close();
	}

}
