package portugol;

import java.util.Scanner;

/* Exerc�cio 4
 * Obtenha um n�mero digitado pelo usu�rio e repita 
 * a opera��o de multiplicar ele por tr�s (imprimindo 
 * o novo valor) at� que ele seja maior do que 100. 
 * Ex.: se o usu�rio digita 5,  deveremos observar na 
 * tela a seguinte sequ�ncia: 5 15 45 135.
 */
public class Lista03Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		int numero;
		
		//PROCESSAMENTO + SA�DAS
		System.out.print("Digite um n�mero: ");
		numero = sc.nextInt();
		
		while(numero < 100) {
			System.out.print(numero + " ");
			numero = numero * 3;
		}
		System.out.print(numero);
		sc.close();
	}

}
