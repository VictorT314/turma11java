package aplicacoes;

import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARI�VEIS
		String nomes[] = {"Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa", 
				"Carla Cristina Concei��o de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos", 
				"Debora Miranda Carmona", "Everton Luiz Ros�rio de Oliveira", "Gabriel Reis Ritter", 
				"Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva", 
				"Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "Jo�o Victor dos Santos Rigoleto", 
				"Jonas De Oliveira Santos", "Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", 
				"Karina Soares Lima", "Larissa Meira Dominguez", "Leonardo Iamur Terra", 
				"Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", 
				"Matheus Trindade Torok", "M�nica dos santos ribeiro", "Nat�lia Lopes moreno", 
				"Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corr�a", 
				"Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes", 
				"Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", 
				"Washington pereira dos santos", "Wellington Vieira", "Wesley Bueno da Silva", 
				"Yago Tonoli Domingues", "Zaine de Queiros Jesus"};
		
		int codigo[] = new int[nomes.length];
		int i = 0, escolha = 0;
		char opc = 'S';
		
		
		//PROCESSAMENTO
		do {
			
		System.out.println("LISTA DE ALUNOS\n");
		System.out.println("C�DIGO \t ALUNO");
		for(i = 0; i < nomes.length; i++) {
			
			System.out.println((i+1) + "\t" + nomes[i] );
		}
		System.out.println("Escolha um aluno: ");
		escolha = sc.nextInt();
		
		System.out.println(codigo[i]);
		
		
		sc.close();
		
		}while(opc == 'S');
	}

}
