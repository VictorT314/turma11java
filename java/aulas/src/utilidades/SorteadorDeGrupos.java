package utilidades;

import java.util.Random;
import java.util.Scanner;

public class SorteadorDeGrupos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random sr = new Random();
		Scanner leia = new Scanner(System.in);

		String lista[] = { "Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa",
				"Carla Cristina Conceição de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos",
				"Debora Miranda Carmona", "Everton Luiz Rosário de Oliveira", "Gabriel Reis Ritter",
				"Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva",
				"Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "João Victor dos Santos Rigoleto",

				"Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima",

				"Leonardo Iamur Terra", "Lysandro Andrade Martin", "Matheus Araujo de moraes",
				"Matheus Fernandes Rodrigues", "Matheus Trindade Torok", "Mônica dos santos ribeiro",
				"Natália Lopes moreno", "Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corrêa",
				"Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes",
				"Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington pereira dos santos",
				"Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus" };

		final int LIMITE = lista.length;
		int x = 0;
		int grupo = 1;
		int grupoUsuario = 0;
		int[] mat = new int[LIMITE];
		int resposta;
		int contador = 0;
		int pessoas = 0;
		int[] randomiza = new int[LIMITE];
		boolean teste = true;
		int y = 0;
		int contRandom = 0;
		int imprima = 0;

		for (x = 0; x < LIMITE; x++) {
			randomiza[x] = x + 100;
		}

		for (x = 0; x < LIMITE; x++) {

			do {
				randomiza[x] = sr.nextInt(LIMITE);
				teste = true;
				contRandom = 0;
				for (y = 0; y < LIMITE; y++) {
					if (randomiza[y] == randomiza[x])

					{
						contRandom++;
						if (contRandom > 1) {
							teste = false;
						}
					}
				}

			} while (teste == false);
			System.out.print("[ " + randomiza[x] + " ]");

		}
		System.out.println();
		for (x = 0; x < LIMITE; x++) {
			mat[x] = x + 1;
		}
		System.out.println("Matricula\t   Alunx	 ");

		for (x = 0; x < LIMITE; x++) {
			System.out.println("   " + mat[x] + "\t\t" + lista[x]);

		}

		System.out.println("quer separar em grupos  sim'S', para o programa nao'N'");
		resposta = leia.next().toUpperCase().charAt(0);
		if (resposta == 'S' || resposta == 's') {

			do {
				System.out.println("O numero de pessoas por para ser divido");
				pessoas = leia.nextInt();
				if (LIMITE % pessoas == 0) {
					grupoUsuario = LIMITE / pessoas;
				} else {
					grupoUsuario = (LIMITE / pessoas) + 1;
				}
				// escreva ("\n ",grupoUsuario,"\n") // log de grupos
			} while (grupoUsuario > (LIMITE / 2) + 1);
			for (x = 0; x < LIMITE; x += pessoas) {
				for (y = 0; y < pessoas; y++) {
					if (contador < LIMITE) {
						imprima = randomiza[contador];
						System.out.println(
								"matricula:" + (imprima + 1) + "\tgrupo : " + grupo + "\t Alunx: " + lista[imprima]);
						contador++;
						System.out.println();
					}
				}
				grupo++;
				System.out.println();
			}

		}

	}
}