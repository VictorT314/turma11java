package listasJava;

import java.util.Scanner;

/* Exerc�cio 2
 * Ler 10 n�meros e imprimir quantos s�o pares 
 * e quantos s�o �mpares. (FOR)
 */

public class Lista02Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int[] numeros = new int [10];
		int i = 0, pares = 0, impares = 0;
		
		//PROCESSAMENTO
		for (i = 0; i < 10; i++) {
			System.out.print("Digite um n�mero inteiro positivo: ");
			numeros[i] = sc.nextInt();
			while(numeros[i] < 0) {
				System.out.println("Erro! O n�mero deve ser inteiro e positivo!");
				System.out.print("Digite um n�mero inteiro positivo: ");
				numeros[i] = sc.nextInt();
			}
			if(numeros[i] % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		
		//SA�DAS
		System.out.printf("\nQuantidade de n�meros pares: %d \nQuantidade de n�meros �mpares: %d",pares,impares);
		
		sc.close();
	}

}
