package entidades;

import java.util.Random;

public class Funcionario {
	Random sorteia = new Random();
	
	public String nome;
	public String sobrenome;
	public int idade;
	public int codigo;
	public String dataDeAdmissao;
	public double salario;
	
	public int gerarCodFuncionario() {
		return (sorteia.nextInt(899999) + 100000);
	}

}
