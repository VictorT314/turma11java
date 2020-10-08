package listasJava;

import java.util.Scanner;

/* Exerc�cio 6
 * Escrever um programa que receba v�rios n�meros 
 * inteiros no teclado. E no final imprimir a m�dia 
 * dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

public class Lista02Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int numero;
		double media = 0, soma = 0, contador = 0;
		//PROCESSAMENTOS
		do {
			System.out.print("\nPara sair, digite 0\n");
			System.out.print("Digite um n�mero inteiro: ");
			numero = sc.nextInt();
			if(numero % 3 == 0 && numero != 0) {
				soma = soma + numero;
				contador++;
			}
			
		}while(numero != 0);
		
		//SA�DAS
		media = soma/contador;
		System.out.println("\n-----------------------------------------\n");
		System.out.printf("A m�dia dos n�meros m�ltiplos de 3 � %.2f", media);
		
		sc.close();
	}

}
