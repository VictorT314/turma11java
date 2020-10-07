package listasJava;

import java.util.Scanner;

/* Exerc�cio 4
 * Fa�a um programa em que permita a entrada de um n�mero 
 * qualquer e exiba se este n�mero � par ou �mpar. Se for 
 * par exiba tamb�m a raiz quadrada do mesmo; se for �mpar 
 * exiba o n�mero elevado ao quadrado.
 */

public class Lista01Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int numero;
		
		//PROCESSAMENTOS + SA�DAS
		System.out.print("Digite um n�mero inteiro: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			if(numero % 2 == 0) {
				System.out.printf("\nO n�mero %d � par.", numero);
				System.out.printf("\nA raiz quadrada de %d � %.2f.", numero, (Math.sqrt(numero)));
			}
			else {
				System.out.printf("\nO n�mero %d � �mpar.", numero);
				System.out.printf("\nO quadrado de %d � %d.", numero, (numero * numero));
			}
		}
		else {
			System.out.printf("\nO n�mero %d � negativo.", numero);
		}
		
		
		sc.close();
	}

}
