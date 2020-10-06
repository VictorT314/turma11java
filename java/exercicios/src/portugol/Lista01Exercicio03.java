package portugol;

import java.util.Scanner;

/*	Exercício 3
 * Faça um sistema que leia o tempo de duração de um evento
 * em uma fábrica expressa em segundos e mostre-o expresso 
 * em horas, minutos e segundos.
 */
public class Lista01Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int tempo, horas, minutos, segundos;
		
		//PROCESSAMENTO
		System.out.print("Digite a duração do evento (em segundos): ");
		tempo = sc.nextInt();
		
		horas = (tempo / 3600);
		minutos = (tempo % 3600) / 60;
		segundos = (tempo % 3600) % 60;
		
		//SAÍDAS
		System.out.printf("O evento durou %d horas, %d minutos e %d segundos.", horas, minutos, segundos);
		
		sc.close();
	}

}
