package portugol;

import java.util.Scanner;

/* Exerc�cio 7
 * Receber valores de base e altura de um tri�ngulo 
 * e verificar se s�o valores v�lidos (positivos maiores 
 * que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
 */
public class Lista02Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
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
			System.out.printf("A �rea do tri�ngulo � %.2f unidades de �rea.", area);
		}
		sc.close();
	}

}
