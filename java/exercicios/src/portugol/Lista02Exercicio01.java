package portugol;

import java.util.Scanner;

/*	Exerc�cio 1
 * Jo�o Papo-de-Pescador, homem de bem, comprou um 
 * microcomputador para controlar o rendimento di�rio 
 * de seu trabalho. Toda vez que ele traz um peso de 
 * tomate maior que o estabelecido pelo regulamento do 
 * estado de S�o Paulo (50 quilos) deve pagar um multa 
 * de R$ 4,00 por quilo excedente. Jo�o precisa que voc� 
 * fa�a um sistema que leia a vari�vel P (peso de tomates) 
 * e verifique se h� excesso. Se houver, gravar na vari�vel 
 * E (Excesso) e na vari�vel M o valor da multa que Jo�o 
 * dever� pagar. Caso contr�rio mostrar tais vari�veis com 
 * o conte�do ZERO.
 */
public class Lista02Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		double P, E, M;
		
		//PROCESSAMENTO
		System.out.print("Informe o peso(em kg): ");
		P = sc.nextDouble();
		
		E = P - 50;
		M = 4.00 * E;
		
		//SA�DAS
		
		while (P < 0) {
			System.out.println("Peso inv�lido! Por favor, informe um valor positivo!");
			System.out.print("Informe o peso(em kg): ");
			P = sc.nextDouble();
		}
		
		if (P > 50) {
			System.out.println("Peso acima do permitido pelo regulamento!");
			System.out.printf("Houve excesso de %.2f kg. Ser� aplicado uma multa de R$ %.2f.", E, M);
		} 
		else {
			E = 0;
			M = 0;
			System.out.printf("E = %.2f, M = %.2f.\n", E, M);
			System.out.println("N�o houve excesso, nenhuma multa ser� aplicada.");
		}
		
		sc.close();
	}

}
