programa
{
	
	funcao inicio()
	{
		inteiro C
		real N, E = 0.00, salario = 0.00, salarioExcedente = 0.00

		escreva("Digite o código: ")
		leia(C)
		escreva("Digite o número de horas trabalhadas: ")
		leia(N)

		se (N > 50){
			E = N - 50
			salario = 50 * 10.00
			salarioExcedente = E * 20.00
			salario = salario + salarioExcedente
			escreva("\n*** Funcionário " + C + " ***")
			escreva("\nSalário total = R$ " + salario + "\nSalário excedente = R$ " + salarioExcedente)
		}
		senao{
			salario = N * 10.00
			escreva("\n*** Funcionário " + C + " ***")
			escreva("\nSalário total = R$ " + salario + "\nSalário excedente = R$ " + salarioExcedente)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 659; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */