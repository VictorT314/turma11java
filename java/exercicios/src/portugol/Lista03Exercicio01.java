package portugol;

import java.util.Scanner;

/*
 * Exercício 1
 * A prefeitura de uma cidade fez uma pesquisa entre 20 
 * de seus habitantes, coletando dados sobre o salário 
 * e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.

 */
public class Lista03Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double salarioTotal = 0.00, mediaSalarial = 0.00, 
		mediaFilhos = 0.00, maiorSalario = 0.00, percent = 0.00, 
		salario, filhos, totalFilhos = 0.00, percentual = 0.00;
		
		final int LIMITE = 20;
		
		//PROCESSAMENTO
		for (int habitante = 1; habitante <= LIMITE; habitante++){
			System.out.print("Digite o salário: ");
			salario = sc.nextDouble();
			salarioTotal = salario + salarioTotal;
			System.out.print("Digite o número de filhos: ");
			filhos = sc.nextDouble();
			totalFilhos = totalFilhos + filhos;
			
			if (salario < 100.00){
				percent = percent + 1;
			}
			
			if (salario > maiorSalario){
				maiorSalario = salario;
			}
		
		}
		
		//SAÍDAS
		mediaSalarial = salarioTotal/LIMITE;
		mediaFilhos = totalFilhos/LIMITE;
		percentual = (percent * 100)/LIMITE;
		pula();
		System.out.printf("\nMédia do salário da população: R$ %.2f", mediaSalarial);
		pula();
		System.out.printf("\nMédia do número de filhos da população: %.2f", mediaFilhos);
		pula();
		System.out.printf("\nMaior salário da população: R$ %.2f", maiorSalario);
		pula();
		System.out.printf("\nPercentual de pessoas com salário de até R$ 100,00: %.2f pessoas (%.2f%%)", percent, percentual);
		sc.close();
	}
	
	//FUNÇÕES
	public static void pula() { //PULAR LINHA
		System.out.println();
	}
	

}
