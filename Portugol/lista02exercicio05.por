programa
{
	
	funcao inicio()
	{
		real indice

		escreva("Digite o valor do íncide de poluição: ")
		leia(indice)

		se(indice >= 0.3 e indice < 0.4){
			escreva("\nIndústrias do grupo 1 devem suspender as atividades!")
		}
		senao se(indice >= 0.4 e indice < 0.5){
			escreva("\nIndústrias dos grupos 1 e 2 devem suspender as atividades!")
		}
		senao se(indice >= 0.5){
			escreva("\nTodas as indústrias devem suspender as atividades!")
		}
		senao{
			escreva("\nÍndice de poluição dentro das normalidades.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */