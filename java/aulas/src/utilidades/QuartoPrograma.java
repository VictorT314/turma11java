package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		String nome;
		int anoNascimento, idade = 0;
		double salario;
		
		//PROCESSAMENTO
		System.out.print("Digite o seu nome: ");
		nome = sc.next();
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = sc.nextInt();
		System.out.print("Digite o sal�rio: ");
		salario = sc.nextDouble();
		
		idade = (2020 - anoNascimento);
		
		//SA�DAS
		System.out.printf("\nOl�, %s. Voc� tem %d anos e seu sal�rio � de R$ %.2f", nome, idade, salario);
		
		sc.close();
	}

}
