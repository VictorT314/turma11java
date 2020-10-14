package listasJava;

import java.util.Scanner;
import entidades.Funcionario;

/*
 * Exercício 4
 * Crie uma classe funcionário e apresente os 
 * atributos e métodos referentes esta classe, 
 * em seguida crie um objeto funcionário, defina 
 * as instâncias deste objeto e apresente as informações 
 * deste objeto no console.
 */
public class Lista04Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Funcionario f = new Funcionario();
		
		//PROCESSAMENTO
		System.out.println("CADASTRO DE FUNCIONÁRIOS");
		System.out.print("Insira o nome do funcionário: ");
		f.nome = sc.next().toUpperCase();
		pula();
		System.out.print("Insira o sobrenome do funcionário: ");
		f.sobrenome = sc.next().toUpperCase();
		pula();
		System.out.print("Insira a idade do funcionário: ");
		f.idade = sc.nextInt();
		pula();
		System.out.println("Gerando código do funcionário...");
		pula();
		f.codigo = f.gerarCodFuncionario();
		System.out.print("Informe a data de admissão(DD/MM/AAAA): ");
		f.dataDeAdmissao = sc.next();
		pula();
		System.out.print("Informe o salário do funcionário: R$ ");
		f.salario = sc.nextDouble();
		
		//SAÍDAS
		pula();
		System.out.println("Cadastro realizado com sucesso!");
		System.out.print("DADOS DO FUNCIONÁRIO");
		pula();
		System.out.printf("Nome: %s", f.nome);
		pula();
		System.out.printf("Sobrenome: %s", f.sobrenome);
		pula();
		System.out.printf("Idade: %d anos.", f.idade);
		pula();
		System.out.printf("Código do funcionário: %d", f.codigo);
		pula();
		System.out.printf("Data de admissão: %s", f.dataDeAdmissao);
		pula();
		System.out.printf("Salário: R$ %.2f", f.salario);
		pula();
		
		sc.close();
	}
	public static void pula() {
		System.out.println();
	}

}
