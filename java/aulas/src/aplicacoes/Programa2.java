package aplicacoes;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		if(numero > 0) {
			if(numero % 2 == 0) {
				System.out.printf("O número %d é par e positivo.", numero);
			}
			else {
				System.out.printf("O número %d é ímpar e positivo.", numero);
			}
		}
		else if (numero < 0) {
			System.out.printf("O número %d é negativo.", numero);
		}
		else {
			System.out.println("O número 0 é par e nêutro.");
		}
		
		sc.close();
	}

}
