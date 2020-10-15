package listasJava;

import entidades.Administrador;
import entidades.Pessoa;

/*
 * Exercício 4
 * Implemente a classe Administrador como subclasse da 
 * classe pessoa. Um determinado administrador tem como 
 * atributos da classe Pessoa e também os atributos 
 * próprios como ajudaDeCusto (ajudas referentes a 
 * viagens, estadias).
 */
public class Lista05Exercicio04 {

	public static void main(String[] args) {
		Administrador a = new Administrador("GERALDO SANTOS", "4002-8922", 4000.00);
		a.setTelefone("4002-8922");

		System.out.println("DADOS DO ADMINISTRADOR");
		System.out.println("Nome: " + a.getNome());
		System.out.println("Telefone: " + a.getTelefone());
		System.out.printf("Ajuda de Custo: R$ %.2f", a.getAjudaDeCusto());
	}

}
