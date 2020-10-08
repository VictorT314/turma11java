package listasJava;

import java.util.Random;
import java.util.Scanner;

/* Exercício 4
 * Uma empresa desenvolveu uma pesquisa para saber 
 * as características psicológicas dos indivíduos 
 * de uma região. Para tanto, a cada uma das pessoas 
 * era perguntado: idade, sexo (1-feminino / 
 * 2-masculino / 3-Outros), e as opções (1, se a pessoa 
 * era calma; 2, se a pessoa era nervosa e 3, se a pessoa 
 * era agressiva). Pede-se para elaborar um sistema que 
 * permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
 * 
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.

 */

public class Lista02Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random sorteia = new Random();
		
		
		//VARIÁVEIS
		final int LIM = 150;
		int pessoas = 0, idade = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0,
				outrosCalmos = 0, nervosasMaisQuarenta = 0, calmasMenosDezoito = 0;
		int sexo = 1, opc = 1;
		
		//PROCESSAMENTO
		while (pessoas < LIM) {
			System.out.print("Digite a sua idade: ");
			idade = sc.nextInt();
			//idade = sorteia.nextInt(100); //Usando classe Random
			//System.out.println(idade) //Remova comentário para imprimir a variável após sorteada
			System.out.print("Informe o sexo, 1 - feminino, 2 - masculino ou 3 - outros: ");
			sexo = sc.nextInt();
			//sexo = sorteia.nextInt(3) + 1; //Usando classe Random
			//System.out.println(sexo) //Remova comentário para imprimir a variável após sorteada
			if(sexo == 1) {
				System.out.println("Escolha uma das características");
				System.out.println("1 - Calma;");
				System.out.println("2 - Nervosa;");
				System.out.println("3 - Agressiva.");
				System.out.println("Opção: ");
				opc = sc.nextInt();
				//opc = sorteia.nextInt(3) + 1; //Usando classe Random
				//System.out.println(opc) //Remova comentário para imprimir a variável após sorteada
				
			}
			else if(sexo == 2) {
				System.out.println("Escolha uma das características");
				System.out.println("1 - Calmo;");
				System.out.println("2 - Nervoso;");
				System.out.println("3 - Agressivo.");
				System.out.println("Opção: ");
				opc = sc.nextInt();
				//opc = sorteia.nextInt(3) + 1; //Usando classe Random
				//System.out.println(opc) //Remova comentário para imprimir a variável após sorteada
				
			}
			else if (sexo == 3){
				System.out.println("Escolha uma das características");
				System.out.println("1 - Calme;");
				System.out.println("2 - Nervose;");
				System.out.println("3 - Agressive.");
				System.out.println("Opção: ");
				opc = sc.nextInt();
				//opc = sorteia.nextInt(3) + 1; //Usando classe Random
				//System.out.println(opc) //Remova comentário para imprimir a variável após sorteada
			}
			if(opc == 1) { // Número de pessoas calmas.
				pessoasCalmas = pessoasCalmas + 1;
			}
			if (sexo == 1 && opc == 2) { // Número de mulheres nervosas.
				mulheresNervosas = mulheresNervosas + 1;
			}
			if (sexo == 2 && opc == 3) { // Número de homens agressivos.
				homensAgressivos = homensAgressivos + 1;
			}
			if (sexo == 3 && opc == 1) { // Número de outros calmos.
				outrosCalmos = outrosCalmos + 1;
			}
			if (opc == 2 && idade > 40) { // Número de pessoas nervosas maiores do que 40 anos.
				nervosasMaisQuarenta = nervosasMaisQuarenta + 1;
			}
			if (opc == 1 && idade < 18) { // Número de pessoas calmas menores de 18 anos.
				calmasMenosDezoito = calmasMenosDezoito + 1;
			}
			pessoas++;
			
		}
		
		//SAÍDAS
		System.out.print("\n---------------------------------------\n");
		System.out.println("Dados recebidos");
		System.out.println("Número de pessoas calmas: " + pessoasCalmas);
		System.out.println("Número de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Número de homens agressivos: " + homensAgressivos);
		System.out.println("Número de outros calmos: " + outrosCalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " + nervosasMaisQuarenta);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + calmasMenosDezoito);
		
		
		sc.close();
	}
}
