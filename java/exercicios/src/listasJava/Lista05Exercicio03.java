package listasJava;

import entidades.Empregado;

/*
 * Exerc�cio 3
 * Considere, como subclasse da classe Pessoa, 
 * a classe Empregado. Considere que cada inst�ncia 
 * da classe Empregado tem, para al�m dos atributos 
 * que caracterizam a classe Pessoa, os atributos 
 * codigoSetor (inteiro), salarioBase (vencimento base) 
 * e imposto (porcentagem retida dos impostos). 
 * Implemente a classe Empregado com m�todos seletores 
 * e modificadores e um m�todo calcularSalario. 
 * Escreva um programa de teste adequado para a classe Empregado. 
 */
public class Lista05Exercicio03 {

	public static void main(String[] args) {
		Empregado e = new Empregado ("JOS� FERNANDES", "4895-4532", 445, 4895.00, 2);
		
		
		System.out.println("Nome: " + e.getNome());
		System.out.println("Telefone: " + e.getTelefone());
		System.out.println("C�digo do Setor: " + e.getCodigoSetor());
		System.out.printf("Sal�rio Base: R$ %.2f", e.getSalarioBase());
		System.out.println();
		System.out.printf("Percentagem de impostos: %.2f%%", e.getImposto());
		System.out.println();
		System.out.printf("Sal�rio Final: R$ %.2f", e.calcularSalario());
	}

}
