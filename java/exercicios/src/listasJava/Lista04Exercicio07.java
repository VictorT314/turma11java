package listasJava;


import entidades.Paciente;

/*
 * Exerc�cio 7
 *  Crie uma classe paciente e apresente os atributos 
 *  e m�todos referentes esta classe, em seguida crie 
 *  um objeto paciente, defina as instancias deste objeto 
 *  e apresente as informa��es deste objeto no console.
 */
public class Lista04Exercicio07 {

	public static void main(String[] args) {
		
		Paciente p = new Paciente();
		
		p.nome = "Asdrubal";
		p.sobrenome = "Hermenegildes";
		p.sexo = "Masculino";
		p.idade = 45;
		p.profissao = "Degustador de Pizza";
		p.endereco = "Rua Superbacana, 2";
		p.telefone = "4002-8922";
		p.diagnosticoMedico = "Pizzarismo";
		
		System.out.println("DADOS DO PACIENTE");
		System.out.println("Nome: " + p.nome + " " + p.sobrenome);
		System.out.println("Sexo: " + p.sexo);
		System.out.println("Idade: " + p.idade + " anos.");
		System.out.println("Profiss�o: " + p.profissao);
		System.out.println("Endere�o: " + p.endereco);
		System.out.println("Telefone: " + p.telefone);
		System.out.println("Diagn�stico m�dico: " + p.diagnosticoMedico);
		
		
	}

}
