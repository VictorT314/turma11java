package entidades;

public class Preguica extends Animal {
	
	@Override
	public void subirArvore() {
		System.out.println("*escalando*");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("*chiando*");
	}
}
