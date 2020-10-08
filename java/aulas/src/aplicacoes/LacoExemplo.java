package aplicacoes;

import java.util.Scanner;

public class LacoExemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int numero = 0, i = 1;
		char opc = 'S';
		for(i = 1; i <= 1000; i++) {
			numero = numero + 1;
			System.out.println(numero + " ");
		}
		 */
		
		/*
		do {
			
			numero++;
			System.out.println(numero);
			System.out.print("Deseja continuar? S ou N: ");
			opc = sc.next().toUpperCase().charAt(0);
		}while(opc == 'S');
		
		System.out.println("FIM DO PROGRAMA");
		*/
		
		
		int i = 1, j = 1, tab;
		
        for (i = 1; i <= 10; i++)
        {
        	System.out.println();
        	System.out.println("--------Tabuada do " + i + "----------");
            for (j = 1; j <= 10; j++)
            {
            	tab = i * j;
            	System.out.println(i + " x " + j + " = " + tab);
            }
        }
        
		
		/*
		int numero, i = 1, j = 1, tab; 
		char opc = 'S';
		
		do {
		System.out.print("Digite o número para a tabuada: ");
		numero = sc.nextInt();
		
		System.out.println();
    	System.out.println("--------Tabuada do " + numero + "----------");
		
		for (i = 1; i <= 10; i++)
        {
        	tab = numero * i;
        	System.out.println(numero + " x " + i + " = " + tab);
            
        }
        
		System.out.println("\nDeseja continuar? [S/N]: ");
		opc = sc.next().toUpperCase().charAt(0);
		}while(opc == 'S');
		*/
		sc.close();
	}

}
