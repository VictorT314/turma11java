package portugol;

import java.util.Scanner;

/*	Exercício 1
 * João Papo-de-Pescador, homem de bem, comprou um 
 * microcomputador para controlar o rendimento diário 
 * de seu trabalho. Toda vez que ele traz um peso de 
 * tomate maior que o estabelecido pelo regulamento do 
 * estado de São Paulo (50 quilos) deve pagar um multa 
 * de R$ 4,00 por quilo excedente. João precisa que você 
 * faça um sistema que leia a variável P (peso de tomates) 
 * e verifique se há excesso. Se houver, gravar na variável 
 * E (Excesso) e na variável M o valor da multa que João 
 * deverá pagar. Caso contrário mostrar tais variáveis com 
 * o conteúdo ZERO.
 */
public class Lista02Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double P, E, M;
		
		//PROCESSAMENTO
		System.out.print("Informe o peso(em kg): ");
		P = sc.nextDouble();
		
		E = P - 50;
		M = 4.00 * E;
		
		//SAÍDAS
		
		while (P < 0) {
			System.out.println("Peso inválido! Por favor, informe um valor positivo!");
			System.out.print("Informe o peso(em kg): ");
			P = sc.nextDouble();
		}
		
		if (P > 50) {
			System.out.println("Peso acima do permitido pelo regulamento!");
			System.out.printf("Houve excesso de %.2f kg. Será aplicado uma multa de R$ %.2f.", E, M);
		} 
		else {
			E = 0;
			M = 0;
			System.out.printf("E = %.2f, M = %.2f.\n", E, M);
			System.out.println("Não houve excesso, nenhuma multa será aplicada.");
		}
		
		sc.close();
	}

}
