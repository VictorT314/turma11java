package aplicacoes;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int contador = 0;
		char continua = 'S';
		
		do {
			System.out.print(contador);
			
			System.out.print(" Digite S para continuar e N para terminar o programa: " );
			continua = leia.next().toUpperCase().charAt(0);
			
			contador++;
		} while (continua == 'S');

	}

}
