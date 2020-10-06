package portugol;

import java.util.Scanner;

/* Exercício 2
 * Elabore um sistema que leia as variáveis C e N, 
 * respectivamente código e número de horas trabalhadas 
 * de um operário. E calcule o salário sabendo-se que ele 
 * ganha R$ 10,00 por hora. Quando o número de horas exceder
 *  a 50 calcule o excesso de pagamento armazenando-o na 
 *  variável E, caso contrário zerar tal variável. A hora 
 *  excedente de trabalho vale R$ 20,00. No final do processamento 
 *  imprimir o salário total e o salário excedente.
 */
public class Lista02Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int C, N;
		double salario, E;
		
		//PROCESSAMENTO
		System.out.print("Informe o código do funcionário: ");
		C = sc.nextInt();
		System.out.println("Informe o número de horas trabalhadas: ");
		N = sc.nextInt();
		
		//SAÍDAS
		while (C < 0 || N < 0) {
			System.out.println("Dados inválidos! Digite valores positivos!");
			System.out.print("Informe o código do funcionário: ");
			C = sc.nextInt();
			System.out.print("Informe o número de horas trabalhadas: ");
			N = sc.nextInt();
		}
		if (N > 50) {
			E = N - 50;
			salario = N * 10 + E * 20;
			System.out.printf("**** Funcionário %d ****\n", C);
			System.out.printf("Salário total = R$ %.2f\n", salario);
			System.out.printf("Salário excedente = R$ %.2f", E);
		}
		else {
			E = 0;
			salario = N * 10;
			System.out.printf("**** Funcionário %d ****\n", C);
			System.out.printf("Salário total = R$ %.2f\n", salario);
			System.out.printf("Salário excedente = R$ %.2f", E);
		}
		sc.close();
	}

}

