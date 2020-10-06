package portugol;

import java.util.Scanner;

/*	Exercício 3
 * Desenvolva um sistema em que:
• Leia 4 (quatro) números;
• Calcule o quadrado de cada um;
• Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
• Caso contrário, imprima os valores lidos e seus respectivos quadrados.

 */
public class Lista02Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double num1, num2, num3, num4, q1, q2, q3, q4;
		
		//PROCESSAMENTO
		System.out.print("Insira o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Insira o segundo número: ");
		num2 = sc.nextDouble();
		System.out.print("Insira o terceiro número: ");
		num3 = sc.nextDouble();
		System.out.print("Insira o quarto número: ");
		num4 = sc.nextDouble();
		
		q1 = num1 * num1;
		q2 = num2 * num2;
		q3 = num3 * num3;
		q4 = num4 * num4;
		
		//SAÍDAS
		if (q3 >= 1000) {
			System.out.printf("\n num3 = " + num3 + "\t\t" + "(num3)² = " + q3);
		}
		else {
			System.out.printf("\nnum1 = " + num1 + "\t\t" + "(num1)² = " + q1);
			System.out.printf("\nnum2 = " + num2 + "\t\t" + "(num2)² = " + q2);
			System.out.printf("\nnum3 = " + num3 + "\t\t" + "(num3)² = " + q3);
			System.out.printf("\nnum4 = " + num4 + "\t\t" + "(num4)² = " + q4);
		}
		
		sc.close();
	}

}
