package portugol;

import java.util.Scanner;

/* Exercício 3
 * Elaborar um programa que efetue a leitura sucessiva de 
 * valores numéricos e apresente no final o total do somatório, 
 * a média e o total de valores lidos. O programa deve fazer 
 * as leituras dos valores enquanto o usuário estiver fornecendo 
 * valores positivos. Ou seja, o programa deve parar quando o 
 * usuário fornecer um valor negativo.
 */
public class Lista03Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double soma = 0, media = 0, numero = 0, contador = 0;
		
		//PROCESSAMENTO
		System.out.print("Digite um número: ");
		numero = sc.nextDouble();
		
		while (numero >= 0) {
			soma = soma + numero;
			contador= contador + 1;
			System.out.print("Digite um número: ");
			numero = sc.nextDouble();
		}
		media = soma/contador;
		
		//SAÍDAS
		System.out.printf("\nRecebido %.0f números. \nSoma = %.2f. \nMédia = %.2f.", contador, soma, media);
		
		sc.close();
	}

}
