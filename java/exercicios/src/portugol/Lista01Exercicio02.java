package portugol;

import java.util.Scanner;

/*	Exerc�cio 2
 * Fa�a um sistema que leia a idade de uma pessoa expressa
 * em dias e mostre-a expressa em anos, meses e dias. 
 */
public class Lista01Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int idade, anos, meses, dias;
		
		//PROCESSAMENTOS
		System.out.print("Digite a sua idade (em dias): ");
		idade = sc.nextInt();
		
		anos = (idade / 365);
		meses = (idade % 365) / 30;
		dias = (idade % 365) % 30;
		
		//SA�DAS
		System.out.printf("Voc� tem %d ano(s), %d mes(es) e %d dia(s) vividos.", anos, meses, dias);
		
		sc.close();
	}

}
