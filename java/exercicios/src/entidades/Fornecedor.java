package entidades;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	//CONSTRUTOR PADRÃO
	public Fornecedor() {
		
	}
	
	//CONSTRUTOR VALORCREDITO + VALORDIVIDA
	public Fornecedor(double valorCredito, double valorDivida) {
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	//CONSTRUTOR COMPLETO
	public Fornecedor (String nome, String telefone, double valorCredito, double valorDivida) {
		super(nome, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	//GETTERS + SETTERS
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	//MÉTODOS
	public double obterSaldo() {
		return (this.valorCredito - this.valorDivida);
	}
	
	

}
