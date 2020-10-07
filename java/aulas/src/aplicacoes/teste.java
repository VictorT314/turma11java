package aplicacoes;

import java.util.Scanner;
public class teste {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double AUXILIO = 600;
		String nome;
		char sexo;
		int anoNascimento, idade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		nome = sc.next();
		
		System.out.println("Digite a data de nascimento: ");
		anoNascimento = sc.nextInt();
		
		idade = 2020 - anoNascimento;
		
		if(idade >= 18) {
			System.out.println("Digite o sexo M- Masculino F-Feminino");
			sexo = sc.next().charAt(0);
			if(sexo == 'M' || sexo == 'm') {
				System.out.println("\nNome: " + nome
								  +"\nIdade: " + idade
								  +"\nChefe de familia recebe R$"+ AUXILIO);
			}
			else if(sexo == 'F' || sexo == 'f') {
				System.out.println("\nNome: " + nome
								  +"\nIdade: " + idade
								  +"\nMãe de familia recebe R$"+ AUXILIO * 2);
			}
			else {
				System.out.println("Dados invalidos");
			}
		}
		else {
			System.out.println("Menor de idade não recebe...");
		}
	}
}
