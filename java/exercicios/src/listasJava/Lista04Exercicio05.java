package listasJava;

/* Exerc�cio 5
 * Crie uma classe patinete e apresente os atributos e 
 * m�todos referentes esta classe, em seguida crie um 
 * objeto patinete, defina as inst�ncias deste objeto e 
 * apresente as informa��es deste objeto no console.
 */

import entidades.Patinete;

public class Lista04Exercicio05 {

	public static void main(String[] args) {
		
		Patinete p = new Patinete();
		char motor = 'S';
		
		p.marca = "Xiaomi";
		p.modelo = "M365";
		p.codDeBarras = 363369367;
		
		
		System.out.println("INFORMA��ES DO PATINETE");
		System.out.println("Marca: " + p.marca);
		System.out.println("Modelo: " + p.modelo);
		System.out.println("C�digo de Barras: " + p.codDeBarras);
		System.out.print("� motorizado? ");
		p.patineteMotorizado(motor);
		
		if(motor == 'S') {
			p.ligar();
		}
		
		
		

	}

}
