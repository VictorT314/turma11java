package entidades;

public class Vendedor extends Pessoa {
	
	private double valorVendas;
	private double comissao;
	private double vencimentoBase;
	
	//CONSTRUTOR COMPLETO
	public Vendedor(String nome, String telefone, double valorVendas, double comissao) {
		super(nome, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	//GETTERS + SETTERS
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getVencimentoBase() {
		return vencimentoBase;
	}

	public void setVencimentoBase(double vencimentoBase) {
		this.vencimentoBase = vencimentoBase;
	}
	
	//CALCULAR VENCIMENTO BASE
	public double calcularVencimentoBase() {
		return (this.valorVendas + ((this.valorVendas * this.comissao)/100));
	}
	
	

}
