package portugol;

import java.util.Scanner;

/* Exerc�cio 2
 * Elabore um sistema que leia as vari�veis C e N, 
 * respectivamente c�digo e n�mero de horas trabalhadas 
 * de um oper�rio. E calcule o sal�rio sabendo-se que ele 
 * ganha R$ 10,00 por hora. Quando o n�mero de horas exceder
 *  a 50 calcule o excesso de pagamento armazenando-o na 
 *  vari�vel E, caso contr�rio zerar tal vari�vel. A hora 
 *  excedente de trabalho vale R$ 20,00. No final do processamento 
 *  imprimir o sal�rio total e o sal�rio excedente.
 */
public class Lista02Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int C, N;
		double salario, E;
		
		//PROCESSAMENTO
		System.out.print("Informe o c�digo do funcion�rio: ");
		C = sc.nextInt();
		System.out.println("Informe o n�mero de horas trabalhadas: ");
		N = sc.nextInt();
		
		//SA�DAS
		while (C < 0 || N < 0) {
			System.out.println("Dados inv�lidos! Digite valores positivos!");
			System.out.print("Informe o c�digo do funcion�rio: ");
			C = sc.nextInt();
			System.out.print("Informe o n�mero de horas trabalhadas: ");
			N = sc.nextInt();
		}
		if (N > 50) {
			E = N - 50;
			salario = N * 10 + E * 20;
			System.out.printf("**** Funcion�rio %d ****\n", C);
			System.out.printf("Sal�rio total = R$ %.2f\n", salario);
			System.out.printf("Sal�rio excedente = R$ %.2f", E);
		}
		else {
			E = 0;
			salario = N * 10;
			System.out.printf("**** Funcion�rio %d ****\n", C);
			System.out.printf("Sal�rio total = R$ %.2f\n", salario);
			System.out.printf("Sal�rio excedente = R$ %.2f", E);
		}
		sc.close();
	}

}

