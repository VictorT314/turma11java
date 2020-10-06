package portugol;

import java.util.Scanner;

/*	Exercício 4
 * Escreva  um sistema que leia três números inteiros 
 * e positivos (A, B, C) e calcule a seguinte expressão:
 * D = (R + S)/2; R = (A + B)²; S = (B + C)² 
 */
public class Lista01Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int A, B, C, D, R, S;
		
		//PROCESSAMENTO
		System.out.printf("Digite o primeiro número (A): ");
		A = sc.nextInt();
		System.out.printf("Digite o segundo número (B): ");
		B = sc.nextInt();
		System.out.printf("Digite o terceiro número (C): ");
		C = sc.nextInt();
		
		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S)/2;
		
		//SAÍDAS
		System.out.println("R = " + R);
		System.out.println("S = " + S);
		System.out.println("D = " + D);
		
		sc.close();
	}

}
