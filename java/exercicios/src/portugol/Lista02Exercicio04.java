package portugol;

import java.util.Scanner;

/*	Exercício 4
 * Faça um sistema que leia um número inteiro e 
 * mostre uma mensagem indicando se este número é 
 * par ou ímpar, e se é positivo ou negativo.
 */
public class Lista02Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int numero;
		
		//PROCESSAMENTO
		System.out.print("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		//SAÍDAS
		if (numero > 0) {
			if(numero % 2 == 0) {
				System.out.println("O número é par e positivo.");
			}
			else {
				System.out.println("O número é ímpar e positivo.");
			}
		}
		else if (numero < 0){
			System.out.println("O número é negativo.");
		}
		else {
			System.out.println("0 é par e nêutro.");
		}
		
		
		sc.close();
	}

}
