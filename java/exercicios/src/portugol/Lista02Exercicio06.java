package portugol;

import java.util.Scanner;

/*	Exercício 6
 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos

 */
public class Lista02Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		int idade;
		
		//PROCESSAMENTO + SAÍDAS
		System.out.println("Digite a idade do(a) nadador(a): ");
		idade = sc.nextInt();
		
		
		if(idade >= 5 && idade <= 7){
			System.out.println("\nCategoria: Infaltil A");
		} 
		else if(idade >= 8 && idade <= 11){
			System.out.println("\nCategoria: Infaltil B");
		}
		else if(idade == 12 || idade == 13){
			System.out.println("\nCategoria: Juvenil A");
		}
		else if(idade >= 14 && idade <= 17){
			System.out.println("\nCategoria: Juvenil B");
		}
		else if(idade >= 18){
			System.out.println("\nCategoria: Adultos");
		}
		else{
			System.out.println("\nIdade não aceita no sistema!");
		}
		sc.close();
	}

}
