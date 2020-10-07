package portugol;

import java.util.Scanner;

/* Exerc�cio 3
 * Elaborar um programa que efetue a leitura sucessiva de 
 * valores num�ricos e apresente no final o total do somat�rio, 
 * a m�dia e o total de valores lidos. O programa deve fazer 
 * as leituras dos valores enquanto o usu�rio estiver fornecendo 
 * valores positivos. Ou seja, o programa deve parar quando o 
 * usu�rio fornecer um valor negativo.
 */
public class Lista03Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		double soma = 0, media = 0, numero = 0, contador = 0;
		
		//PROCESSAMENTO
		System.out.print("Digite um n�mero: ");
		numero = sc.nextDouble();
		
		while (numero >= 0) {
			soma = soma + numero;
			contador= contador + 1;
			System.out.print("Digite um n�mero: ");
			numero = sc.nextDouble();
		}
		media = soma/contador;
		
		//SA�DAS
		System.out.printf("\nRecebido %.0f n�meros. \nSoma = %.2f. \nM�dia = %.2f.", contador, soma, media);
		
		sc.close();
	}

}
