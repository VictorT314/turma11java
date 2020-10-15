package listasJava;

import entidades.Operario;

/*
 * Exerc�cio 5
 * Implemente a classe Operario como subclasse da 
 * classe Pessoa. Um determinado oper�rio tem como 
 * atributos da classe Pessoa e tamb�m os atributos 
 * pr�prios como valorProducao (que corresponde ao 
 * valor monet�rio dos artigos efetivamente produzidos 
 * pelo oper�rio) e comissao (que corresponde � 
 * porcentagem do valorProducao que ser� adicionado 
 * ao vencimento base do oper�rio). 
 */
public class Lista05Exercicio05 {

	public static void main(String[] args) {
		Operario op = new Operario("ASDRUBAL SANTOS", "5647-8596", 1500.00, 10);
		
		System.out.println("DADOS DO OPER�RIO");
		System.out.println("Nome: " + op.getNome());
		System.out.println("Telefone: " + op.getTelefone());
		System.out.printf("Valor de Produ��o: R$ %.2f", op.getValorProducao());
		System.out.println();
		System.out.printf("Comiss�o: %.2f%%", op.getComissao());
		System.out.println();
		System.out.printf("Vencimento Base: R$ %.2f", op.calcularVencimentoBase());
	}

}
