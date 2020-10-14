package listasJava;

import java.util.Scanner;
import entidades.Funcionario;

/*
 * Exerc�cio 4
 * Crie uma classe funcion�rio e apresente os 
 * atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto funcion�rio, defina 
 * as inst�ncias deste objeto e apresente as informa��es 
 * deste objeto no console.
 */
public class Lista04Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Funcionario f = new Funcionario();
		
		//PROCESSAMENTO
		System.out.println("CADASTRO DE FUNCION�RIOS");
		System.out.print("Insira o nome do funcion�rio: ");
		f.nome = sc.next().toUpperCase();
		pula();
		System.out.print("Insira o sobrenome do funcion�rio: ");
		f.sobrenome = sc.next().toUpperCase();
		pula();
		System.out.print("Insira a idade do funcion�rio: ");
		f.idade = sc.nextInt();
		pula();
		System.out.println("Gerando c�digo do funcion�rio...");
		pula();
		f.codigo = f.gerarCodFuncionario();
		System.out.print("Informe a data de admiss�o(DD/MM/AAAA): ");
		f.dataDeAdmissao = sc.next();
		pula();
		System.out.print("Informe o sal�rio do funcion�rio: R$ ");
		f.salario = sc.nextDouble();
		
		//SA�DAS
		pula();
		System.out.println("Cadastro realizado com sucesso!");
		System.out.print("DADOS DO FUNCION�RIO");
		pula();
		System.out.printf("Nome: %s", f.nome);
		pula();
		System.out.printf("Sobrenome: %s", f.sobrenome);
		pula();
		System.out.printf("Idade: %d anos.", f.idade);
		pula();
		System.out.printf("C�digo do funcion�rio: %d", f.codigo);
		pula();
		System.out.printf("Data de admiss�o: %s", f.dataDeAdmissao);
		pula();
		System.out.printf("Sal�rio: R$ %.2f", f.salario);
		pula();
		
		sc.close();
	}
	public static void pula() {
		System.out.println();
	}

}
