package listasJava;

import java.util.Scanner;

/*
 * Exerc�cio 3
 * Fa�a um programa que receba a idade de uma pessoa 
 * e mostre na sa�da em qual categoria ela se encontra:
 * 10-14 infantil
 * 15-17 juvenil
 * 18-25 adulto
 * 
 */
public class Lista01Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
				int idade;
				
		//PROCESSAMENTO + SA�DAS
		System.out.printf("Digite a idade: ");
		idade = sc.nextInt();
				
				
		if(idade >= 10 && idade <= 14){
			System.out.println("\nCategoria: Infantil");
		} 
		else if(idade >= 15 && idade <= 17){
			System.out.println("\nCategoria: Juvenil ");
		}
		else if(idade >= 18 && idade <= 25){
			System.out.println("\nCategoria: Adulto");
		}
		else{
			System.out.println("\nIdade n�o aceita no sistema!");
		}
		
		sc.close();

	}

}
