package listasJava;

import entidades.Vendedor;

/*
 * Exerc�cio 6
 * Implemente a classe Vendedor como subclasse da 
 * classe Pessoa. Um determinado vendedor tem como 
 * atributos da classe Pessoa e tamb�m os atributos 
 * pr�prios como valorVendas (correspondente ao valor 
 * monet�rio dos artigos vendidos) e o atributo comissao 
 * (porcentagem do valorVendas que ser� adicionado ao 
 * vencimento base do Vendedor). 
 */
public class Lista05Exercicio06 {

	public static void main(String[] args) {
		Vendedor v = new Vendedor("GEN�SIO SALES", "4002-8922", 2450.00, 5);
		
		System.out.println("DADOS DO VENDEDOR");
		System.out.println("Nome: " + v.getNome());
		System.out.println("Telefone: " + v.getTelefone());
		System.out.printf("Valor de Vendas: R$ %.2f", v.getValorVendas());
		System.out.println();
		System.out.printf("Comiss�o: %.2f%%", v.getComissao());
		System.out.println();
		System.out.printf("Vencimento Base: R$ %.2f", v.calcularVencimentoBase());

	}

}
