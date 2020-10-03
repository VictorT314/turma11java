programa
{
	
	funcao inicio()
	{
		real P, E = 0.00, M = 0.00

		escreva("Digite o valor do peso(kg): ")
		leia(P)

		E = P - 50
		M = E * 4.00

		se (P > 50){
			escreva("Houve excesso de " + E + " kg. Será aplicado multa de R$ " + M + ".")
		} senao{
			escreva("E = " + E + "\nM = " + M)
			escreva("\nNão houve excesso. Nenhuma multa a ser aplicada.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */