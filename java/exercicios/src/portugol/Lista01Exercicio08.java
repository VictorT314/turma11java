package portugol;

import java.util.Locale;
import java.util.Scanner;

/*	Exerc�cio 8
 * O custo ao consumidor de um carro novo � a soma 
 * do custo de f�brica com a percentagem do distribuidor 
 * e dos impostos (aplicados ao custo de f�brica). 
 * Supondo que a percentagem do distribuidor seja de 28% e 
 * os impostos de 45%, escrever um sistema que leia o custo 
 * de f�brica de um carro e escreva o custo ao consumidor. 
 */
public class Lista01Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		double custoFabrica, custoFinal;
		
		//PROCESSAMENTO
		System.out.print("Digite o custo de f�brica: ");
		custoFabrica = sc.nextDouble();
		
		custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
		
		System.out.printf("O custo ao consumidor � de R$ %.2f.", custoFinal);
		
		sc.close();
	}

}
