package listasJava;

import entidades.Fornecedor;
import entidades.Pessoa;

/*
 * Exercício 2
 * Considere, como subclasse da classe Pessoa 
 * (desenvolvida no exercício anterior) a classe 
 * Fornecedor. Considere que cada instância da 
 * classe Fornecedor tem, para além dos atributos 
 * que caracterizam a classe Pessoa, os atributos 
 * valorCredito (correspondente ao crédito máximo 
 * atribuído ao fornecedor) e valorDivida (montante 
 * da dívida para com o fornecedor). Implemente na 
 * classe Fornecedor, para além dos usuais métodos 
 * seletores e modificadores, um método obterSaldo() 
 * que devolve a diferença entre os valores dos atributos 
 * valorCredito e valorDivida. Depois de implementada a 
 * classe Fornecedor, crie um programa de teste adequado 
 * que lhe permita verificar o funcionamento dos métodos 
 * implementados na classe Fornecedor e os herdados da classe Pessoa.
 */
public class Lista05Exercicio02 {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("ASDRUBAL HERMENEGILDES", "RUA ILEGÍVEL INELEGÍVEL, 447", "4002-8922");
		Fornecedor forn = new Fornecedor("EPAMINONDAS", "4897-0332", 4998.58, 4237.90);
		//forn.setTelefone("4897-0332");
		
		System.out.println("DADOS DA PESSOA");
		System.out.println("Nome: " + p.getNome());
		System.out.println("Endereço: " + p.getEndereco());
		System.out.println("Telefone: " + p.getTelefone());
		System.out.printf("Saldo com o fornecedor: R$ %.2f", forn.obterSaldo());
		System.out.println();
		System.out.println();
		System.out.println("DADOS DO FORNECEDOR");
		System.out.println("Nome: " + forn.getNome());
		System.out.printf("Telefone: %s", forn.getTelefone());
		System.out.println();

	}

}
