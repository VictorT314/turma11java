package portugol;

import java.util.Scanner;

/* Exercício 8
 * Construa um sistema para ler uma variável numérica N
 * e imprimi-la somente se a mesma for maior que 100, 
 * caso contrário imprimi-la com o valor zero.
 */
public class Lista02Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double N;
		
		//PROCESSAMENTO
		System.out.print("Digite um número: ");
		N = sc.nextDouble();
		
		//SAÍDAS
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
	
	//FUNÇÕES
	
	public static void pula() {
		System.out.println();
	}
	
}
