package entidades;

public class Operario extends Pessoa {

	private double valorProducao;
	private double comissao;
	private double vencimentoBase;
	
	//CONSTRUTOR
	public Operario(String nome, String telefone, double valorProducao, double comissao) {
		super(nome, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	//GETTERS + SETTERS
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComisao(double comisao) {
		this.comissao = comisao;
	}

	public double getVencimentoBase() {
		return vencimentoBase;
	}

	public void setVencimentoBase(double vencimentoBase) {
		this.vencimentoBase = vencimentoBase;
	}
	
	//MÉTODO VENCIMENTO BASE
	public double calcularVencimentoBase() {
		return(this.valorProducao + ((this.valorProducao * this.comissao)/100));
	}

	
	
	
}
