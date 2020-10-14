package aplicacoes;

import java.util.Scanner;

import entidades.Aluno;
import entidades.Professor;

public class InformacoesProfessores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Professor Ed = new Professor();
		Professor Jess = new Professor();
		Professor Fatima = new Professor();
		Aluno primeiro = new Aluno();
		String situacao = " ";
		/*
		System.out.println("Dados ED");
		System.out.print("Digite o seu nome: ");
		Ed.nome = sc.next();
		System.out.print("Digite M - masculino, F - feminino ou O - outros: ");
		Ed.sexo = sc.next().toUpperCase().charAt(0);
		System.out.print("Qual é a sua especialidade?: ");
		Ed.especialidade = sc.next();
		System.out.print("Digite a sua carga horária: ");
		Ed.cargaHoraria = sc.nextInt();
		System.out.println();
		
		System.out.println("Dados JESSICA");
		System.out.print("Digite o seu nome: ");
		Jess.nome = sc.next();
		System.out.print("Digite M - masculino, F - feminino ou O - outros: ");
		Jess.sexo = sc.next().toUpperCase().charAt(0);
		System.out.print("Qual é a sua especialidade?: ");
		Jess.especialidade = sc.next();
		System.out.print("Digite a sua carga horária: ");
		Jess.cargaHoraria = sc.nextInt();
		System.out.println();
		
		System.out.println("Dados FÁTIMA");
		System.out.print("Digite o seu nome: ");
		Fatima.nome = sc.next();
		System.out.print("Digite M - masculino, F - feminino ou O - outros: ");
		Fatima.sexo = sc.next().toUpperCase().charAt(0);
		System.out.print("Qual é a sua especialidade?: ");
		Fatima.especialidade = sc.next();
		System.out.print("Digite a sua carga horária: ");
		Fatima.cargaHoraria = sc.nextInt();
		
		System.out.println();
		System.out.println("Nome: " + Ed.nome);
		System.out.println("Sexo: " + Ed.sexo);
		System.out.println("Especialidade: " + Ed.especialidade);
		System.out.println("Carga horária: " + Ed.cargaHoraria);
		System.out.println();
		System.out.println("Nome: " + Jess.nome);
		System.out.println("Sexo: " + Jess.sexo);
		System.out.println("Especialidade: " + Jess.especialidade);
		System.out.println("Carga horária: " + Jess.cargaHoraria);
		System.out.println();
		System.out.println("Nome: " + Fatima.nome);
		System.out.println("Sexo: " + Fatima.sexo);
		System.out.println("Especialidade: " + Fatima.especialidade);
		System.out.println("Carga horária: " + Fatima.cargaHoraria);
		System.out.println();
		*/
		
		System.out.print("Digite o nome do aluno: ");
		primeiro.nome = sc.next().toUpperCase();
		System.out.print("Digite M - masculino, F - feminino ou O - outros: ");
		primeiro.sexo = sc.next().toUpperCase().charAt(0);
		System.out.print("Digite o ano de nascimento: ");
		primeiro.anoNascimento = sc.nextInt();
		System.out.print("Digite o nome curso: ");
		primeiro.curso = sc.next().toUpperCase();
		System.out.print("Digite a nota geral: ");
		primeiro.notaGeral = sc.nextInt();
		
		System.out.println();
		System.out.println("PRIMEIRO ALUNO");
		System.out.println("Nome: " + primeiro.nome);
		System.out.print("Sexo: ");
		System.out.println((primeiro.sexo=='F')?"Feminino":(primeiro.sexo=='M')?"Masculino":"Outros");
		System.out.println("Idade: " + (2020 - primeiro.anoNascimento));
		System.out.println("Curso: " + primeiro.curso);
		System.out.println("Nota geral: " + primeiro.notaGeral);
		
		if(primeiro.notaGeral >= 5) {
			situacao = "Aprovado";
		}else {
			situacao = "Reprovado";
		}
		System.out.println("Situação: " + situacao);
		
		
		
		
		sc.close();
	}

}
