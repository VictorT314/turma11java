package listasJava;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class Lista06Exercicio02 {

	public static void main(String[] args) {
		
		Animal doguinho = new Cachorro();
		doguinho.setNome("Snoopy");
		doguinho.setIdade(5);
		doguinho.correr();
		doguinho.emitirSom();;
		
		Animal cavalo = new Cavalo();
		cavalo.setNome("Corsel");
		cavalo.setIdade(10);
		cavalo.correr();
		cavalo.emitirSom();
		
		Animal preguica = new Preguica();
		preguica.setNome("Sid");
		preguica.setIdade(10);
		preguica.subirArvore();
		preguica.emitirSom();

	}

}
