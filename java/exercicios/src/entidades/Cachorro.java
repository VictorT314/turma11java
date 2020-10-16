package entidades;

public class Cachorro extends Animal {
	
	@Override
	public void correr() {
		System.out.println("*correndo*");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("*latindo*");
	}
	

}
