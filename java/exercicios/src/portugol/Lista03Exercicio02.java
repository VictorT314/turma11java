package portugol;
/* Exerc�cio 2
 * Desenvolver um sistema que efetue a soma de todos 
 * os n�meros �mpares que s�o  m�ltiplos de tr�s e 
 * que se encontram no conjunto dos n�meros de 1 at� 500.
 */
public class Lista03Exercicio02 {

	public static void main(String[] args) {
		
		//VARI�VEIS
		int soma = 0;
		
		//PROCESSAMENTO + SA�DAS
		for(int i = 1; i < 500; i++) {
			if (i % 2 != 0 && i % 3 == 0) {
				soma = soma + i;
			}
		}	
		System.out.printf("A soma vale %d.", soma);
	}

}
