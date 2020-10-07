package portugol;
/* Exercício 2
 * Desenvolver um sistema que efetue a soma de todos 
 * os números ímpares que são  múltiplos de três e 
 * que se encontram no conjunto dos números de 1 até 500.
 */
public class Lista03Exercicio02 {

	public static void main(String[] args) {
		
		//VARIÁVEIS
		int soma = 0;
		
		//PROCESSAMENTO + SAÍDAS
		for(int i = 1; i < 500; i++) {
			if (i % 2 != 0 && i % 3 == 0) {
				soma = soma + i;
			}
		}	
		System.out.printf("A soma vale %d.", soma);
	}

}
