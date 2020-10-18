package aplicacoes;

import java.util.ArrayList;
import java.util.List;

import entidades.Listas;

public class TestesBanco {

	public static void main(String[] args) {
		boolean teste = false;
		List<Listas> lista = new ArrayList<>();
		/*
		Listas lista1 = new Listas("Nome1", 1, 1, 1);
		Listas lista2 = new Listas("Nome2", 2, 2, 2);
		Listas lista3 = new Listas("Nome3", 3, 3, 3);
		Listas lista4 = new Listas("Nome4", 4, 4, 4);
		*/
		lista.add(new Listas("Nome1", 1, 1, 1));
		lista.add(new Listas("Nome2", 2, 2, 2));
		lista.add(new Listas("Nome3", 3, 3, 3));
		lista.add(new Listas("Nome4", 4, 4, 4));
		int numero = 2;
		for(Listas x:lista) {
			x.getNumero2();
			if(numero == x.getNumero2()) {
				teste = true;
			}
		}
		
		System.out.println(teste);
		
		
	}

}

