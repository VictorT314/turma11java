package entidades;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	
	//CONSTRUTOR
	public Empregado(String nome, String telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	//GETTERS + SETTERS
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	//MÉTODO CALCULA SALÁRIO
	public double calcularSalario() {
		return (this.salarioBase - (this.salarioBase * (this.imposto/100)));
	}
	

}
