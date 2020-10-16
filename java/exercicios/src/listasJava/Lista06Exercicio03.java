package listasJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



import entidades.EstoqueLoja;

/*
 * Exercício 3
 * Crie uma um programa para trabalhar com estoque de uma loja, 
 * o programa deverá trabalhar com Collection do tipo List do Java 
 * para manipular os dados desse estoque, o programa deverá atender 
 * as seguintes funcionalidades:

	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.

 */
public class Lista06Exercicio03 {

	public static void main(String[] args) {
		Random sorteia = new Random();
		List <EstoqueLoja> produtos = new ArrayList<EstoqueLoja>();
		int indice = 0;
		
		
		EstoqueLoja produto1 = new EstoqueLoja("Video-Game", (sorteia.nextInt(899999999) + 100000000), 20, 2499.00);
		EstoqueLoja produto2 = new EstoqueLoja("TV 4K 50 polegadas", (sorteia.nextInt(899999999) + 100000000), 10, 2299.00);
		EstoqueLoja produto3 = new EstoqueLoja("PC Gamer", (sorteia.nextInt(899999999) + 100000000), 20, 4499.00);
		EstoqueLoja produto4 = new EstoqueLoja("Tablet", (sorteia.nextInt(899999999) + 100000000), 20, 899.00);
		EstoqueLoja produto5 = new EstoqueLoja("Smartphone", (sorteia.nextInt(899999999) + 100000000), 20, 799.00);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		
		System.out.println("Adicionando produtos à Lista...");
		System.out.println();
		System.out.println("LISTA ATUALIZADA");
		
		for (EstoqueLoja produto : produtos) 
		{
			System.out.println(produto.toString());
			System.out.println("\n");
			System.out.println("\n");
		}
		
		produtos.remove(produto1);
		produtos.remove(produto2);
		System.out.println("Removendo produtos à Lista...");
		System.out.println();
		System.out.println("LISTA ATUALIZADA");
		
		for (EstoqueLoja produto : produtos) 
		{
			System.out.println(produto.toString());
			System.out.println("\n");
			System.out.println("\n");
		}
		
		produtos.add(produto2);
		indice = produtos.indexOf(produto2);
		produto1.setPreco(1999.00);
		produtos.set(indice, produto1);
		
		System.out.println("Atualizando preços...");
		System.out.println("LISTA ATUALIZADA");
		for (EstoqueLoja produto : produtos) 
		{
			System.out.println(produto.toString());
			System.out.println("\n");
			System.out.println("\n");
		}
		
	}

}
