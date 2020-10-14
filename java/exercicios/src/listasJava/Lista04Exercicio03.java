package listasJava;

/*
 * Exercício 3
 * Crie uma classe produto eletrônico e apresente 
 * os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto produto eletrônico, 
 * defina as instâncias deste objeto e apresente 
 * as informações deste objeto no console.
 */
import java.util.Scanner;
import entidades.ProdutoEletronico;


public class Lista04Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProdutoEletronico p = new ProdutoEletronico();
		
		//PROCESSAMENTO
		System.out.println("CADASTRO DE PRODUTO");
		System.out.print("Informe o nome do produto: ");
		p.nome = sc.next().toUpperCase();
		pula();
		System.out.print("Informe a marca do produto: ");
		p.marca = sc.next().toUpperCase();
		pula();
		System.out.println("Gerando código de barras...");
		pula();
		p.codBarras = p.gerarCodBarras();
		System.out.print("Informe a quantidade a adicionar: ");
		p.quantidade = sc.nextInt();
		pula();
		System.out.print("Informe o preço unitário de fábrica: R$ ");
		p.precoDeFabrica = sc.nextDouble();
		pula();
		System.out.print("Informe o preço unitário de venda: R$ ");
		p.precoDeVenda = sc.nextDouble();
		pula();
		System.out.println("Calculando lucros...");
		pula();
		p.percLucro = (100 * (p.precoDeVenda - p.precoDeFabrica))/(p.precoDeFabrica);
		
		//SAÍDAS
		pula();
		System.out.println("Produto cadastrado com sucesso!");
		pula();
		System.out.println("DADOS DO PRODUTO");
		System.out.printf("Nome: %s", p.nome);
		pula();
		System.out.printf("Marca: %s", p.marca);
		pula();
		System.out.printf("Código de Barras: %d", p.codBarras);
		pula();
		System.out.printf("Quantidade adicionada: %d", p.quantidade);
		pula();
		System.out.printf("Preço unitário de fábrica: R$ %.2f", p.precoDeFabrica);
		pula();
		System.out.printf("Preço unitário de venda: R$ %.2f", p.precoDeVenda);
		pula();
		System.out.printf("TOTAL DO LUCRO DE VENDAS: R$ %.2f", p.lucro());
		pula();
		System.out.printf("PERCENTUAL DE LUCRO: %.2f%%", p.percLucro);
		
		
		sc.close();
	}
	public static void pula() {
		System.out.println();
	}
}
