package portugol;

import java.util.Locale;
import java.util.Scanner;

/*	Exercício 8
 * O custo ao consumidor de um carro novo é a soma 
 * do custo de fábrica com a percentagem do distribuidor 
 * e dos impostos (aplicados ao custo de fábrica). 
 * Supondo que a percentagem do distribuidor seja de 28% e 
 * os impostos de 45%, escrever um sistema que leia o custo 
 * de fábrica de um carro e escreva o custo ao consumidor. 
 */
public class Lista01Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double custoFabrica, custoFinal;
		
		//PROCESSAMENTO
		System.out.print("Digite o custo de fábrica: ");
		custoFabrica = sc.nextDouble();
		
		custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
		
		System.out.printf("O custo ao consumidor é de R$ %.2f.", custoFinal);
		
		sc.close();
	}

}
