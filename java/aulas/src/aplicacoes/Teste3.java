package aplicacoes;

import java.util.Scanner;

public class Teste3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Digite A: ");
		a = sc.nextInt();
		System.out.print("Digite B: ");
		b = sc.nextInt();
		
		System.out.println("\nVari�veis antes da invers�o: \nA = " + a + "\nB = " + b);
		
		a = a + b; // Ex, a = 10 e b = 20, ou seja, a = 10 + 20 ---> a = 30
		b = a - b; // b = 30 - 20 --> b = 10
		a = a - b; // a = 30 - 10 --> a = 20 
		
		
		System.out.println("\nInvertendo as vari�veis");
		System.out.println("B = " + b);
		System.out.println("A = " + a);
		
		sc.close();
	}

}
