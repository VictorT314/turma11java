package listasJava;

import java.util.Scanner;

import entidades.Aviao;

/*
 * Exercicio 2
 * Crie uma classe avi�o e apresente os atributos e 
 * m�todos referentes esta classe, em seguida crie 
 * um objeto avi�o, defina as inst�ncias deste objeto 
 * e apresente as informa��es deste objeto no console.
 */
public class Lista04Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aviao a = new Aviao();
		
		System.out.print("Preencha os dados para o voo");
		pula();
		System.out.print("Insira o modelo da aeronave: ");
		a.modelo = sc.next().toUpperCase();
		pula();
		System.out.print("Insira o local de fabrica��o: ");
		a.localFabricacao = sc.next().toUpperCase();
		pula();
		System.out.print("Informe a capacidade da aeronave: ");
		a.capacidade = sc.nextInt();
		pula();
		System.out.print("Informe a data da �ltima manuten��o (DD/MM/AAAA): ");
		a.dataUltimaManuntencao = sc.next();
		pula();
		System.out.print("Informe o nome do piloto: ");
		a.nomePiloto = sc.next();
		pula();
		System.out.print("Informe o local de origem da viagem: ");
		a.origem = sc.next().toUpperCase();
		pula();
		System.out.print("Informe o local de destino da viagem: ");
		a.destino = sc.next().toUpperCase();
		pula();
		System.out.print("Informe o hor�rio de partida: ");
		a.horaPartida = sc.next();
		pula();
		System.out.print("Informe o hor�rio previsto para chegada: ");
		a.previsaoChegada = sc.next();
		pula();
		pula();
		
		System.out.println("DADOS DO VOO");
		pula();
		System.out.println("Modelo Aeronave: " + a.modelo);
		System.out.println("Local de Fabrica��o: " + a.localFabricacao);
		System.out.println("Capacidade: " + a.capacidade);
		System.out.println("Data �ltima Manuten��o: " + a.dataUltimaManuntencao);
		System.out.println("Piloto: " + a.nomePiloto);
		System.out.println("Origem: " + a.origem);
		System.out.println("Destino: " + a.destino);
		System.out.println("Partida: " + a.horaPartida);
		System.out.println("Chegada: " + a.previsaoChegada);
		pula();
		
		System.out.println("FIM DADOS VOO");
		
		
		sc.close();
	}
	public static void pula(){
		System.out.println();
	}

}
