package listasJava;
/*
 * Exercício 6
 * Crie uma classe conta bancaria e apresente 
 * os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto conta bancaria, 
 * defina as instancias deste objeto e apresente 
 * as informações deste objeto no console.
 */


import entidades.ContaBancaria;

public class Lista04Exercicio06 {

	public static void main(String[] args) {
		
		ContaBancaria ct = new ContaBancaria();
		
		ct.banco = "Itaú";
		ct.agencia = 1234;
		ct.conta = 15987;
		ct.digito = 3;
		ct.saldo = 1247.98;
		
		System.out.println("DADOS DA CONTA");
		System.out.println("Banco: " + ct.banco);
		System.out.println("Agencia: " + ct.agencia);
		System.out.println("Conta: " + ct.conta + "-" + ct.digito);
		System.out.printf("Saldo atual em conta: R$ %.2f", ct.saldo);
		

	}

}
