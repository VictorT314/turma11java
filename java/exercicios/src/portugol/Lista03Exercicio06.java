package portugol;

import java.util.Scanner;

/* Exerc�cio 6
 * Fa�a um programa que pegue um n�mero do teclado 
 * e calcule a soma de todos os n�meros  de 1 at� ele. 
 * Ex.: o usu�rio entra 7, o programa vai mostrar 28, 
 * pois  1+2+3+4+5+6+7=28.
 */
public class Lista03Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int numero, cont = 0, soma = 0;
		
		//PROCESSAMENTO
		System.out.print("Digite um n�mero inteiro: ");
		numero = sc.nextInt();
		
		do {
			cont = cont + 1;
			soma = soma + cont;
			
		}while(cont < numero);
		
		//SA�DAS
		System.out.printf("A soma de 1 a %d vale %d.", numero, soma);
		sc.close();
	}

}
