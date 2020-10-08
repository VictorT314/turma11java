package listasJava;


/* Exercício 1
 * Informar todos os números de 1000 a 1999 que 
 * quando divididos por 11 obtemos resto = 5. (FOR)
 */

public class Lista02Exercicio01 {

	public static void main(String[] args) {
		
		//PROCESSAMENTO + SAÍDAS
		System.out.println("Números entre 1000 e 1999 com resto 5 quando divididos por 11\n");
		for (int i = 1000; i <= 1999; i++) {
			if (i % 11 == 5) {
				System.out.println(i);
			}
		}
	}
}
