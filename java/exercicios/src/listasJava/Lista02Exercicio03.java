package listasJava;

import java.util.Scanner;

/* Exercício 3
 * Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. Total de pessoas 
 * com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */

public class Lista02Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int idade = 0, menorVinteUm = 0, maiorCinquenta = 0, descarte = 0;
		
		//PROCESSAMENTO
		System.out.print("Digite a idade: ");
		idade = sc.nextInt();
		
		while(idade != -99) {
			while(idade < 0) {
				System.out.println("\nIdade deve ser um valor positivo!");
				System.out.print("Digite a idade: ");
				idade = sc.nextInt();
			}
			if (idade < 21) {
				menorVinteUm++;
			}
			else if(idade > 50) {
				maiorCinquenta++;
			}
			else {
				descarte++;
			}
			System.out.println("\nEntre com -99 para parar o programa.");
			System.out.print("Digite a idade: ");
			idade = sc.nextInt();
		}
		
		//SAÍDAS
		System.out.print("\n-------------------------------------------------------------\n");
		System.out.printf("\nQuantidade de pessoas com menos de 21 anos: %d", menorVinteUm);
		System.out.printf("\nQuantidade de pessoas com mais de 50 anos: %d", maiorCinquenta);
		
		sc.close();
	}

}
