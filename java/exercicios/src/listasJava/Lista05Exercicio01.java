package listasJava;

import entidades.Pessoa;

/*
 * Exerc�cio 1
 * Cria uma Classe Pessoa, contendo os atributos 
 * encapsulados, com seus respectivos seletores 
 * (getters) e modificadores (setters), e ainda o 
 * construtor padr�o e pelo menos mais duas op��es 
 * de construtores conforme sua percep��o. 
 * Atributos: String nome; String endere�o; String telefone; 
 */
public class Lista05Exercicio01 {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("JOS�", "RUA DOS BOBOS, N� 0");
		Pessoa pessoa3 = new Pessoa("MARIA", "RUA S�O PAULO, N�10", "4002-8922");
		
		pessoa1.setNome("PEDRO");
		pessoa1.setEndereco("RUA ASDRUBAL HERMENEGILDES, N�40");
		pessoa1.setTelefone("4006-9286");
		pessoa2.setTelefone("4985-0286");
		pessoa2.setEndereco("RUA DA TAPIOCA, 4");
		
		System.out.println("PESSOA 1");
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Endere�o: " + pessoa1.getEndereco());
		System.out.println("Telefone: " + pessoa1.getTelefone());
		System.out.println();
		System.out.println("PESSOA 2");
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("Endere�o: " + pessoa2.getEndereco());
		System.out.println("Telefone: " + pessoa2.getTelefone());
		System.out.println();
		System.out.println("PESSOA 3");
		System.out.println("Nome: " + pessoa3.getNome());
		System.out.println("Endere�o: " + pessoa3.getEndereco());
		System.out.println("Telefone: " + pessoa3.getTelefone());

	}

}
