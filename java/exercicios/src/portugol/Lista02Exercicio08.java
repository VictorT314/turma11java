package portugol;

import java.util.Scanner;

/* Exerc�cio 8
 * Construa um sistema para ler uma vari�vel num�rica N
 * e imprimi-la somente se a mesma for maior que 100, 
 * caso contr�rio imprimi-la com o valor zero.
 */
public class Lista02Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		double N;
		
		//PROCESSAMENTO
		System.out.print("Digite um n�mero: ");
		N = sc.nextDouble();
		
		//SA�DAS
		if (N > 100) {
			N = 0;
			pula();
			System.out.println("N = " + N);
		}
		else {
			pula();
			System.out.println("N = " + N);
		}
		
		sc.close();
	}
	
	//FUN��ES
	
	public static void pula() {
		System.out.println();
	}
	
}
