package portugol;

import java.util.Scanner;

/* Exercício 6
 * Faça um programa que pegue um número do teclado 
 * e calcule a soma de todos os números  de 1 até ele. 
 * Ex.: o usuário entra 7, o programa vai mostrar 28, 
 * pois  1+2+3+4+5+6+7=28.
 */
public class Lista03Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int numero, cont = 0, soma = 0;
		
		//PROCESSAMENTO
		System.out.print("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		do {
			cont = cont + 1;
			soma = soma + cont;
			
		}while(cont < numero);
		
		//SAÍDAS
		System.out.printf("A soma de 1 a %d vale %d.", numero, soma);
		sc.close();
	}

}
