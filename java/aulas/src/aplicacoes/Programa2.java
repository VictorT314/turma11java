package aplicacoes;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero inteiro: ");
		numero = sc.nextInt();
		
		if(numero > 0) {
			if(numero % 2 == 0) {
				System.out.printf("O n�mero %d � par e positivo.", numero);
			}
			else {
				System.out.printf("O n�mero %d � �mpar e positivo.", numero);
			}
		}
		else if (numero < 0) {
			System.out.printf("O n�mero %d � negativo.", numero);
		}
		else {
			System.out.println("O n�mero 0 � par e n�utro.");
		}
		
		sc.close();
	}

}
