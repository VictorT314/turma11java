package entidades;

public class Cavalo extends Animal {
	
	@Override
	public void correr() {
		System.out.println("*correndo*");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("*relinchando*");
	}

}
