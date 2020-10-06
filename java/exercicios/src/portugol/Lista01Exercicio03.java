package portugol;

import java.util.Scanner;

/*	Exerc�cio 3
 * Fa�a um sistema que leia o tempo de dura��o de um evento
 * em uma f�brica expressa em segundos e mostre-o expresso 
 * em horas, minutos e segundos.
 */
public class Lista01Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int tempo, horas, minutos, segundos;
		
		//PROCESSAMENTO
		System.out.print("Digite a dura��o do evento (em segundos): ");
		tempo = sc.nextInt();
		
		horas = (tempo / 3600);
		minutos = (tempo % 3600) / 60;
		segundos = (tempo % 3600) % 60;
		
		//SA�DAS
		System.out.printf("O evento durou %d horas, %d minutos e %d segundos.", horas, minutos, segundos);
		
		sc.close();
	}

}
