package portugol;
/* Exercicio 6
 * Construa um programa em c que, tendo como dados de 
 * entrada dois pontos quaisquer no plano, P(x1, y1) e 
 * P(x2, y2), escreva a distância entre eles. 
 */
import java.util.Scanner;

public class Lista01Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		double x1, x2, y1, y2, d;
		
		//PROCESSAMENTO
		System.out.print("Insira a abscissa do primeiro ponto (x1): ");
		x1 = sc.nextFloat();
		System.out.print("Insira a ordenada do primeiro ponto (y1): ");
		y1 = sc.nextFloat();
		System.out.print("Insira a abscissa do segundo ponto (x2): ");
		x2 = sc.nextFloat();
		System.out.print("Insira a ordenada do segundo ponto (y2): ");
		y2 = sc.nextFloat();
		
		d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		//SAÍDAS
		System.out.printf("A distância entre os pontos é de %.2f unidades.", d);
		
		
		sc.close();
	}

}
