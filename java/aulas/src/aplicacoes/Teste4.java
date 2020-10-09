package aplicacoes;

/*
	 * Vetor com 4 times de São Paulo:
	
	Vetor para times:
	1 - Corinthians;
	2 - Palmeiras;
	3 - São Paulo FC;
	4 - Santos.
	
	Vetor para pontos:
	
	Ganha - 3 pts;
	Empata - 1 pt;
	Perde - 0 pts.
	
	1 Rodada:
	Perguntar para cada time se ganhou, perdeu ou empatou;
	Mostrar a pontuação da primeira rodada.
	Continua? [S/N]: 
	
	2 Rodada:
	Perguntar para cada time se ganhou, perdeu ou empatou;
	Mostrar a pontuação acumulada com primeira e segunda rodadas.
	
	3 Rodada:
	Idem;
	
	Colocar em ordem
 */

import java.util.Scanner;

public class Teste4 {

	public static void main(String[] args) {
		char resultado, continua = 'S';
		int contador = 1;
		String[] times = new String[4];
		int[] pontos = new int[4];
		times[0] = "Corinthians";
		times[1] = "Palmeiras";
		times[2] = "São Paulo s2";
		times[3] = "Santos";
		Scanner entrada = new Scanner(System.in);
		while (continua == 'S') {
			System.out.printf("%da rodada\n\n", contador);
			for (int clubes = 0; clubes < times.length; clubes++) {
				System.out.print("\n" + times[clubes] + " ganhou(G), empatou(E) ou perdeu(P)?");
				resultado = entrada.next().toUpperCase().charAt(0);
				if (resultado == 'G') {
					pontos[clubes] += 3;
				} else if (resultado == 'E') {
					pontos[clubes] += 1;
				}
			}
			System.out.println("\nResultados");
			for (int indice = 0; indice < times.length; indice++) {
				System.out.print("\n" + times[indice] + " tem " + pontos[indice] + " pontos.");
			}
			System.out.println("\nContinua? Sim(S) ou Não(N)");
			continua = entrada.next().toUpperCase().charAt(0);
			contador++;
		}
		entrada.close();
		System.out.println("Fim do Campeonato");
	}

}
