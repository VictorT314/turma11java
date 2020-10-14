package listasJava;

/*
 * Exerc�cio 3
 * Crie uma classe produto eletr�nico e apresente 
 * os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto produto eletr�nico, 
 * defina as inst�ncias deste objeto e apresente 
 * as informa��es deste objeto no console.
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
		System.out.println("Gerando c�digo de barras...");
		pula();
		p.codBarras = p.gerarCodBarras();
		System.out.print("Informe a quantidade a adicionar: ");
		p.quantidade = sc.nextInt();
		pula();
		System.out.print("Informe o pre�o unit�rio de f�brica: R$ ");
		p.precoDeFabrica = sc.nextDouble();
		pula();
		System.out.print("Informe o pre�o unit�rio de venda: R$ ");
		p.precoDeVenda = sc.nextDouble();
		pula();
		System.out.println("Calculando lucros...");
		pula();
		p.percLucro = (100 * (p.precoDeVenda - p.precoDeFabrica))/(p.precoDeFabrica);
		
		//SA�DAS
		pula();
		System.out.println("Produto cadastrado com sucesso!");
		pula();
		System.out.println("DADOS DO PRODUTO");
		System.out.printf("Nome: %s", p.nome);
		pula();
		System.out.printf("Marca: %s", p.marca);
		pula();
		System.out.printf("C�digo de Barras: %d", p.codBarras);
		pula();
		System.out.printf("Quantidade adicionada: %d", p.quantidade);
		pula();
		System.out.printf("Pre�o unit�rio de f�brica: R$ %.2f", p.precoDeFabrica);
		pula();
		System.out.printf("Pre�o unit�rio de venda: R$ %.2f", p.precoDeVenda);
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
