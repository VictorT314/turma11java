package portugol;

import java.util.Scanner;

/* Exercício 7
 * Receber valores de base e altura de um triângulo 
 * e verificar se são valores válidos (positivos maiores 
 * que zero). Em caso afirmativo, calcular a área do triângulo.
 */
public class Lista02Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double base, altura, area = 0;
		
		//PROCESSAMENTO
		System.out.print("Digite o valor da base: ");
		base = sc.nextDouble();
		System.out.print("Digite o valor da altura: ");
		altura = sc.nextDouble();
		
		if (base <= 0 || altura <= 0) {
			System.out.println("A medida deve ter valor positivo e diferente de zero!");
		} 
		else {
			area = (base * altura)/2;
			System.out.printf("\nBase = %.2f\n", base);
			System.out.printf("Altura = %.2f\n", altura);
			System.out.printf("A área do triângulo é %.2f unidades de área.", area);
		}
		sc.close();
	}

}
