package portugol;

import java.util.Scanner;

/*	Exercício 5
 * A Secretaria de Meio Ambiente que controla o índice 
 * de poluição mantém 3 grupos de indústrias que são 
 * altamente poluentes do meio ambiente. O índice de 
 * poluição aceitável varia de 0,05 até 0,25. Se o índice 
 * sobe para 0,3 as indústrias do 1º grupo são intimadas 
 * a suspenderem suas atividades, se o índice crescer para 
 * 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem 
 * suas atividades, se o índice atingir 0,5 todos os grupos devem 
 * ser notificados a paralisarem suas atividades. Faça um sistema 
 * que leia o índice de poluição medido e emita a notificação 
 * adequada aos diferentes grupos de empresas.
 */
public class Lista02Exercicio05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double indice;
		
		//PROCESSAMENTO
		System.out.print("Digite o valor do índice de poluição: ");
		indice = sc.nextDouble();
		
		//SAÍDAS
		if(indice >= 0.3 && indice < 0.4){
			System.out.println("\nIndústrias do grupo 1 devem suspender as atividades!");
		}
		else if(indice >= 0.4 && indice < 0.5){
			System.out.println("\nIndústrias dos grupos 1 e 2 devem suspender as atividades!");
		}
		else if(indice >= 0.5){
			System.out.println("\nTodas as indústrias devem suspender as atividades!");
		}
		else{
			System.out.println("\nÍndice de poluição dentro das normalidades.");

		sc.close();
		}
	}
}
