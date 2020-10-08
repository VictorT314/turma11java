package listasJava;

import java.util.Scanner;

/* Exercício 2
 * Ler 10 números e imprimir quantos são pares 
 * e quantos são ímpares. (FOR)
 */

public class Lista02Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int[] numeros = new int [10];
		int i = 0, pares = 0, impares = 0;
		
		//PROCESSAMENTO
		for (i = 0; i < 10; i++) {
			System.out.print("Digite um número inteiro positivo: ");
			numeros[i] = sc.nextInt();
			while(numeros[i] < 0) {
				System.out.println("Erro! O número deve ser inteiro e positivo!");
				System.out.print("Digite um número inteiro positivo: ");
				numeros[i] = sc.nextInt();
			}
			if(numeros[i] % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		
		//SAÍDAS
		System.out.printf("\nQuantidade de números pares: %d \nQuantidade de números ímpares: %d",pares,impares);
		
		sc.close();
	}

}
