package entidades;

public class Patinete {
	
	public String modelo;
	public long codDeBarras;
	public String marca;
	
	
	public void patineteMotorizado(char motor) {
		if (motor == 'S'){
				System.out.println("Sim");
		} 
		else {
			System.out.println("Não");
		}
	}
	public void ligar() {
		System.out.println("Patinete ligado!");
	}
}
