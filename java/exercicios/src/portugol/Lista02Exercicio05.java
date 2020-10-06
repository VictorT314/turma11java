package portugol;

import java.util.Scanner;

/*	Exerc�cio 5
 * A Secretaria de Meio Ambiente que controla o �ndice 
 * de polui��o mant�m 3 grupos de ind�strias que s�o 
 * altamente poluentes do meio ambiente. O �ndice de 
 * polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice 
 * sobe para 0,3 as ind�strias do 1� grupo s�o intimadas 
 * a suspenderem suas atividades, se o �ndice crescer para 
 * 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem 
 * suas atividades, se o �ndice atingir 0,5 todos os grupos devem 
 * ser notificados a paralisarem suas atividades. Fa�a um sistema 
 * que leia o �ndice de polui��o medido e emita a notifica��o 
 * adequada aos diferentes grupos de empresas.
 */
public class Lista02Exercicio05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		double indice;
		
		//PROCESSAMENTO
		System.out.print("Digite o valor do �ndice de polui��o: ");
		indice = sc.nextDouble();
		
		//SA�DAS
		if(indice >= 0.3 && indice < 0.4){
			System.out.println("\nInd�strias do grupo 1 devem suspender as atividades!");
		}
		else if(indice >= 0.4 && indice < 0.5){
			System.out.println("\nInd�strias dos grupos 1 e 2 devem suspender as atividades!");
		}
		else if(indice >= 0.5){
			System.out.println("\nTodas as ind�strias devem suspender as atividades!");
		}
		else{
			System.out.println("\n�ndice de polui��o dentro das normalidades.");

		sc.close();
		}
	}
}
