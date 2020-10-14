package listasJava;


import entidades.Paciente;

/*
 * Exercício 7
 *  Crie uma classe paciente e apresente os atributos 
 *  e métodos referentes esta classe, em seguida crie 
 *  um objeto paciente, defina as instancias deste objeto 
 *  e apresente as informações deste objeto no console.
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
		System.out.println("Profissão: " + p.profissao);
		System.out.println("Endereço: " + p.endereco);
		System.out.println("Telefone: " + p.telefone);
		System.out.println("Diagnóstico médico: " + p.diagnosticoMedico);
		
		
	}

}
