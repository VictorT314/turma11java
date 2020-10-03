programa
{
	
	funcao inicio()
	{
		//Variáveis
		cadeia nomeUsuario
		inteiro anoNascimento, idadeUsuario = 0
		real salarioUsuario

		// Processamento
		escreva("Digite o nome do usuário: ")
		leia(nomeUsuario)
		escreva("Digite o ano de nascimento: ")
		leia(anoNascimento)
		escreva("Digite o salário: ")
		leia(salarioUsuario)

		idadeUsuario = 2020 - anoNascimento

		//Saídas
		escreva("Oi, meu nome é " + nomeUsuario)
		escreva("\nEu nasci no ano de " + anoNascimento)
		escreva("\nMeu salário atual é " + salarioUsuario)
		escreva("\nMinha idade é " + idadeUsuario + " anos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */