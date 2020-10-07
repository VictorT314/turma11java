package portugol;

import java.util.Scanner;

/*
 * Exerc�cio 1
 * A prefeitura de uma cidade fez uma pesquisa entre 20 
 * de seus habitantes, coletando dados sobre o sal�rio 
 * e n�mero de filhos. A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00.

 */
public class Lista03Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		double salarioTotal = 0.00, mediaSalarial = 0.00, 
		mediaFilhos = 0.00, maiorSalario = 0.00, percent = 0.00, 
		salario, filhos, totalFilhos = 0.00, percentual = 0.00;
		
		final int LIMITE = 20;
		
		//PROCESSAMENTO
		for (int habitante = 1; habitante <= LIMITE; habitante++){
			System.out.print("Digite o sal�rio: ");
			salario = sc.nextDouble();
			salarioTotal = salario + salarioTotal;
			System.out.print("Digite o n�mero de filhos: ");
			filhos = sc.nextDouble();
			totalFilhos = totalFilhos + filhos;
			
			if (salario < 100.00){
				percent = percent + 1;
			}
			
			if (salario > maiorSalario){
				maiorSalario = salario;
			}
		
		}
		
		//SA�DAS
		mediaSalarial = salarioTotal/LIMITE;
		mediaFilhos = totalFilhos/LIMITE;
		percentual = (percent * 100)/LIMITE;
		pula();
		System.out.printf("\nM�dia do sal�rio da popula��o: R$ %.2f", mediaSalarial);
		pula();
		System.out.printf("\nM�dia do n�mero de filhos da popula��o: %.2f", mediaFilhos);
		pula();
		System.out.printf("\nMaior sal�rio da popula��o: R$ %.2f", maiorSalario);
		pula();
		System.out.printf("\nPercentual de pessoas com sal�rio de at� R$ 100,00: %.2f pessoas (%.2f%%)", percent, percentual);
		sc.close();
	}
	
	//FUN��ES
	public static void pula() { //PULAR LINHA
		System.out.println();
	}
	

}
