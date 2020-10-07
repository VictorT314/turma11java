package portugol;

import java.util.Scanner;

/* Exercício 5
 * Faça um programa que mostre uma contagem na tela de 
 * 233 a 456, só que contando de 3 em 3 quando estiver 
 * entre 300 e 400 e de 5 em 5 quando não estiver.
 */
public class Lista03Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int numero = 233;
		
		//PROCESSAMENTO
		do {
			System.out.print(numero + " ");
			numero = numero + 5;
			
		}while(numero < 300);
		
		do {
			System.out.print(numero + " ");
			numero = numero + 3;
			
		}while(numero > 300 && numero < 400);
		
		do {
			System.out.print(numero + " ");
			numero = numero + 5;
			
		}while(numero < 456);
		
		sc.close();
	}

}
