package entidades;

import java.util.Random;

public class ProdutoEletronico {
	
	Random sorteia = new Random();
	public String nome;
	public String marca;
	public int codBarras;
	public int quantidade;
	public double precoDeFabrica;
	public double precoDeVenda;
	public double percLucro;
	
	public double lucro() {
		return (quantidade * (precoDeVenda - precoDeFabrica));
	}
	public int gerarCodBarras() {
		return(sorteia.nextInt(899999999) + 100000000);
	}
}
