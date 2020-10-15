package entidades;

public class Administrador extends Pessoa {
	
	private double ajudaDeCusto;
	
	//CONSTRUTOR
	public Administrador(String nome, String telefone, double ajudaDeCusto) {
		super(nome, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	//GETTER + SETTER
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	

}
