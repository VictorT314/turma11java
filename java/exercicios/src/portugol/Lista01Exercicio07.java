package portugol;

import java.util.Scanner;

/*	Exercício 7
 * Escreva um sistema que lê os coeficientes
 *  a,b,c,d,e e f de um sistema linear e calcula 
 *  e mostra os valores de x e y.
 */
public class Lista01Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double a, b, c, d, e, f, x = 0, y = 0;
		
		//PROCESSAMENTO
		System.out.print("Digite o valor de a: ");
		a = sc.nextDouble();
		System.out.print("Digite o valor de b: ");
		b = sc.nextDouble();
		System.out.print("Digite o valor de c: ");
		c = sc.nextDouble();
		System.out.print("Digite o valor de d: ");
		d = sc.nextDouble();
		System.out.print("Digite o valor de e: ");
		e = sc.nextDouble();
		System.out.print("Digite o valor de f: ");
		f = sc.nextDouble();
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
		//SAÍDAS
		System.out.printf("O conjunto solução do sistema é x = %.2f e y = %.2f", x, y);
		
		sc.close();
	}

}
