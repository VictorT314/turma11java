package portugol;
import java.util.Scanner;

/* Exerc�cio 1
 * Fa�a um sistema que leia a idade de uma pessoa
 * expressa em anos, meses e dias e mostre-a expressa
 *  apenas em dias.
 */
public class Lista01Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int idadeEmDias, anos, meses, dias;
		
		//PROCESSAMENTO
		System.out.println("Digite a sua idade");
		System.out.printf("Anos: ");
		anos = sc.nextInt();
		System.out.printf("Meses: ");
		meses = sc.nextInt();
		System.out.printf("Dias: ");
		dias = sc.nextInt();
		
		idadeEmDias = (anos * 365) + (meses * 30) + dias;
		
		//SA�DAS
		System.out.printf("A sua idade em dias � %d.", idadeEmDias);
		
	
		sc.close();

	}

}
