package aplicacoes;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		//VARI�VEIS
		final double AUXILIO = 600;
		String nome;
		char sexo, opcao;
		int anoNascimento, idade;
		Scanner sc = new Scanner(System.in);
		
		//PROCESSAMENTO
		System.out.print("Digite o nome: ");
		nome = sc.next();
		
		System.out.print("Digite a data de nascimento: ");
		anoNascimento = sc.nextInt();
		
		idade = 2020 - anoNascimento;	
		
		System.out.print("Digite o sexo M- Masculino F-Feminino: ");
		sexo = sc.next().toUpperCase().charAt(0);
		
		//SA�DAS
		if(idade >= 18) {
			
			if(sexo == 'M') {
				System.out.print("� chefe de familia: ");
				opcao = sc.next().toUpperCase().charAt(0);
				if(opcao == 'S') {
					System.out.printf("\nOl�, sr. %s, voc� foi aprovado para receber o aux�lio no valor de R$ %.2f", nome, AUXILIO);
				}
				else {
					System.out.println("\nN�o aprovado para receber o aux�lio. Motivo: n�o � chefe de fam�lia!");
				}
			}
			else if(sexo == 'F') {
				System.out.print("� chefa de familia: ");
				opcao = sc.next().toUpperCase().charAt(0);
				if(opcao == 'S') {
					System.out.printf("\nOl�, sra. %s, voc� foi aprovada para receber o aux�lio no valor de R$ %.2f", nome, (AUXILIO * 2));
				}
				else {
					System.out.println("\nN�o aprovada para receber o aux�lio. Motivo: n�o � chefa de fam�lia!");
				}
				
			}
		}
		else if((idade < 18) && (sexo == 'M')){
			System.out.println("\nVoc� n�o foi aprovado para receber o aux�lio. Motivo: Menor de idade n�o recebe o aux�lio!");
		}
		else if((idade < 18) && (sexo != 'M')){
			System.out.println("\nVoc� n�o foi aprovada para receber o aux�lio. Motivo: Menor de idade n�o recebe o aux�lio!");
		}

	}
}
