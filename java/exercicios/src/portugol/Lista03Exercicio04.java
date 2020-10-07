package portugol;

import java.util.Scanner;

/* Exercício 4
 * Obtenha um número digitado pelo usuário e repita 
 * a operação de multiplicar ele por três (imprimindo 
 * o novo valor) até que ele seja maior do que 100. 
 * Ex.: se o usuário digita 5,  deveremos observar na 
 * tela a seguinte sequência: 5 15 45 135.
 */
public class Lista03Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int numero;
		
		//PROCESSAMENTO + SAÍDAS
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		while(numero < 100) {
			System.out.print(numero + " ");
			numero = numero * 3;
		}
		System.out.print(numero);
		sc.close();
	}

}
