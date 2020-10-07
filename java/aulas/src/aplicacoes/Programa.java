package aplicacoes;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		//VARIÁVEIS
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
		
		//SAÍDAS
		if(idade >= 18) {
			
			if(sexo == 'M') {
				System.out.print("É chefe de familia: ");
				opcao = sc.next().toUpperCase().charAt(0);
				if(opcao == 'S') {
					System.out.printf("\nOlá, sr. %s, você foi aprovado para receber o auxílio no valor de R$ %.2f", nome, AUXILIO);
				}
				else {
					System.out.println("\nNão aprovado para receber o auxílio. Motivo: não é chefe de família!");
				}
			}
			else if(sexo == 'F') {
				System.out.print("É chefa de familia: ");
				opcao = sc.next().toUpperCase().charAt(0);
				if(opcao == 'S') {
					System.out.printf("\nOlá, sra. %s, você foi aprovada para receber o auxílio no valor de R$ %.2f", nome, (AUXILIO * 2));
				}
				else {
					System.out.println("\nNão aprovada para receber o auxílio. Motivo: não é chefa de família!");
				}
				
			}
		}
		else if((idade < 18) && (sexo == 'M')){
			System.out.println("\nVocê não foi aprovado para receber o auxílio. Motivo: Menor de idade não recebe o auxílio!");
		}
		else if((idade < 18) && (sexo != 'M')){
			System.out.println("\nVocê não foi aprovada para receber o auxílio. Motivo: Menor de idade não recebe o auxílio!");
		}

	}
}
