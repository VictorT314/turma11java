package portugol;

import java.util.Scanner;

/*	Exerc�cio 4
 * Escreva  um sistema que leia tr�s n�meros inteiros 
 * e positivos (A, B, C) e calcule a seguinte express�o:
 * D = (R + S)/2; R = (A + B)�; S = (B + C)� 
 */
public class Lista01Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int A, B, C, D, R, S;
		
		//PROCESSAMENTO
		System.out.printf("Digite o primeiro n�mero (A): ");
		A = sc.nextInt();
		System.out.printf("Digite o segundo n�mero (B): ");
		B = sc.nextInt();
		System.out.printf("Digite o terceiro n�mero (C): ");
		C = sc.nextInt();
		
		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S)/2;
		
		//SA�DAS
		System.out.println("R = " + R);
		System.out.println("S = " + S);
		System.out.println("D = " + D);
		
		sc.close();
	}

}
