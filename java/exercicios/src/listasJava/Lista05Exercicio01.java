package listasJava;

import entidades.Pessoa;

/*
 * Exercício 1
 * Cria uma Classe Pessoa, contendo os atributos 
 * encapsulados, com seus respectivos seletores 
 * (getters) e modificadores (setters), e ainda o 
 * construtor padrão e pelo menos mais duas opções 
 * de construtores conforme sua percepção. 
 * Atributos: String nome; String endereço; String telefone; 
 */
public class Lista05Exercicio01 {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("JOSÉ", "RUA DOS BOBOS, Nº 0");
		Pessoa pessoa3 = new Pessoa("MARIA", "RUA SÃO PAULO, Nº10", "4002-8922");
		
		pessoa1.setNome("PEDRO");
		pessoa1.setEndereco("RUA ASDRUBAL HERMENEGILDES, Nº40");
		pessoa1.setTelefone("4006-9286");
		pessoa2.setTelefone("4985-0286");
		pessoa2.setEndereco("RUA DA TAPIOCA, 4");
		
		System.out.println("PESSOA 1");
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Endereço: " + pessoa1.getEndereco());
		System.out.println("Telefone: " + pessoa1.getTelefone());
		System.out.println();
		System.out.println("PESSOA 2");
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("Endereço: " + pessoa2.getEndereco());
		System.out.println("Telefone: " + pessoa2.getTelefone());
		System.out.println();
		System.out.println("PESSOA 3");
		System.out.println("Nome: " + pessoa3.getNome());
		System.out.println("Endereço: " + pessoa3.getEndereco());
		System.out.println("Telefone: " + pessoa3.getTelefone());

	}

}
