package portugol;

import java.util.Scanner;

/*	Exerc�cio 4
 * Fa�a um sistema que leia um n�mero inteiro e 
 * mostre uma mensagem indicando se este n�mero � 
 * par ou �mpar, e se � positivo ou negativo.
 */
public class Lista02Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int numero;
		
		//PROCESSAMENTO
		System.out.print("Digite um n�mero inteiro: ");
		numero = sc.nextInt();
		
		//SA�DAS
		if (numero > 0) {
			if(numero % 2 == 0) {
				System.out.println("O n�mero � par e positivo.");
			}
			else {
				System.out.println("O n�mero � �mpar e positivo.");
			}
		}
		else if (numero < 0){
			System.out.println("O n�mero � negativo.");
		}
		else {
			System.out.println("0 � par e n�utro.");
		}
		
		
		sc.close();
	}

}
