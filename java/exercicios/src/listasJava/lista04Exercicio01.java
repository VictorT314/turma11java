package listasJava;

import java.util.Random;
import java.util.Scanner;

import entidades.Cliente;

/*
 * Exerc�cio 1
 * Crie uma classe cliente e apresente os atributos e 
 * m�todos referentes a esta classe, em seguida crie um 
 * objeto cliente, defina as inst�ncias deste objeto e 
 * apresente as informa��es deste objeto no console.
 */
public class Lista04Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente c = new Cliente();
		Random sorteia = new Random();
		
		//PROCESSAMENTO
		System.out.println("Bem- vinde!\n");
		pula();
		System.out.print("Digite o seu nome: ");
		c.nome = sc.next().toUpperCase();
		pula();
		System.out.println("Ol�, " + c.nome + "!");
		System.out.print("Por favor, digite o seu sobrenome: ");
		c.sobrenome = sc.next().toUpperCase();
		pula();
		System.out.println("Realizando cadastro...");
		pula();
		System.out.print("Insira um nome de usu�rio: ");
		c.login = sc.next();
		pula();
		System.out.print("Insira uma senha: ");
		c.senha = sc.next();
		c.codigo = sorteia.nextInt(8999) + 1000; 
		pula();
		
		//SA�DAS
		pula();
		System.out.println("Cadastro realizado com sucesso!");
		pula();
		System.out.println("DADOS DO CLIENTE");
		System.out.printf("Nome: %s %s", c.nome, c.sobrenome);
		pula();
		System.out.printf("C�digo do cliente: %d", c.codigo);
		pula();
		System.out.printf("Login: %s", c.login);
		pula();
		System.out.printf("Senha: %s", c.senha);
		pula();
		System.out.println("FIM DO CADASTRO");
		
		sc.close();
	}
	public static void pula() {
		System.out.println();
	}

}
