package listasJava;

import java.util.Random;
import java.util.Scanner;

/* Exerc�cio 4
 * Uma empresa desenvolveu uma pesquisa para saber 
 * as caracter�sticas psicol�gicas dos indiv�duos 
 * de uma regi�o. Para tanto, a cada uma das pessoas 
 * era perguntado: idade, sexo (1-feminino / 
 * 2-masculino / 3-Outros), e as op��es (1, se a pessoa 
 * era calma; 2, se a pessoa era nervosa e 3, se a pessoa 
 * era agressiva). Pede-se para elaborar um sistema que 
 * permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
 * 
o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.

 */

public class Lista02Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random sorteia = new Random();
		
		
		//VARI�VEIS
		final int LIM = 150;
		int pessoas = 0, idade = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0,
				outrosCalmos = 0, nervosasMaisQuarenta = 0, calmasMenosDezoito = 0;
		int sexo = 1, opc = 1;
		
		//PROCESSAMENTO
		while (pessoas < LIM) {
			System.out.print("Digite a sua idade: ");
			idade = sc.nextInt();
			//idade = sorteia.nextInt(100); //Usando classe Random
			//System.out.println(idade) //Remova coment�rio para imprimir a vari�vel ap�s sorteada
			System.out.print("Informe o sexo, 1 - feminino, 2 - masculino ou 3 - outros: ");
			sexo = sc.nextInt();
			//sexo = sorteia.nextInt(3) + 1; //Usando classe Random
			//System.out.println(sexo) //Remova coment�rio para imprimir a vari�vel ap�s sorteada
			if(sexo == 1) {
				System.out.println("Escolha uma das caracter�sticas");
				System.out.println("1 - Calma;");
				System.out.println("2 - Nervosa;");
				System.out.println("3 - Agressiva.");
				System.out.println("Op��o: ");
				opc = sc.nextInt();
				//opc = sorteia.nextInt(3) + 1; //Usando classe Random
				//System.out.println(opc) //Remova coment�rio para imprimir a vari�vel ap�s sorteada
				
			}
			else if(sexo == 2) {
				System.out.println("Escolha uma das caracter�sticas");
				System.out.println("1 - Calmo;");
				System.out.println("2 - Nervoso;");
				System.out.println("3 - Agressivo.");
				System.out.println("Op��o: ");
				opc = sc.nextInt();
				//opc = sorteia.nextInt(3) + 1; //Usando classe Random
				//System.out.println(opc) //Remova coment�rio para imprimir a vari�vel ap�s sorteada
				
			}
			else if (sexo == 3){
				System.out.println("Escolha uma das caracter�sticas");
				System.out.println("1 - Calme;");
				System.out.println("2 - Nervose;");
				System.out.println("3 - Agressive.");
				System.out.println("Op��o: ");
				opc = sc.nextInt();
				//opc = sorteia.nextInt(3) + 1; //Usando classe Random
				//System.out.println(opc) //Remova coment�rio para imprimir a vari�vel ap�s sorteada
			}
			if(opc == 1) { // N�mero de pessoas calmas.
				pessoasCalmas = pessoasCalmas + 1;
			}
			if (sexo == 1 && opc == 2) { // N�mero de mulheres nervosas.
				mulheresNervosas = mulheresNervosas + 1;
			}
			if (sexo == 2 && opc == 3) { // N�mero de homens agressivos.
				homensAgressivos = homensAgressivos + 1;
			}
			if (sexo == 3 && opc == 1) { // N�mero de outros calmos.
				outrosCalmos = outrosCalmos + 1;
			}
			if (opc == 2 && idade > 40) { // N�mero de pessoas nervosas maiores do que 40 anos.
				nervosasMaisQuarenta = nervosasMaisQuarenta + 1;
			}
			if (opc == 1 && idade < 18) { // N�mero de pessoas calmas menores de 18 anos.
				calmasMenosDezoito = calmasMenosDezoito + 1;
			}
			pessoas++;
			
		}
		
		//SA�DAS
		System.out.print("\n---------------------------------------\n");
		System.out.println("Dados recebidos");
		System.out.println("N�mero de pessoas calmas: " + pessoasCalmas);
		System.out.println("N�mero de mulheres nervosas: " + mulheresNervosas);
		System.out.println("N�mero de homens agressivos: " + homensAgressivos);
		System.out.println("N�mero de outros calmos: " + outrosCalmos);
		System.out.println("N�mero de pessoas nervosas com mais de 40 anos: " + nervosasMaisQuarenta);
		System.out.println("N�mero de pessoas calmas com menos de 18 anos: " + calmasMenosDezoito);
		
		
		sc.close();
	}
}
