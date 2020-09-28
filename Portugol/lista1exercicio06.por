programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1, x2, y1, y2, d

		escreva("Insira a abscissa do primeiro ponto (x1): ")
		leia(x1)
		escreva("Insira a ordenada do primeiro ponto (y1): ")
		leia(y1)
		escreva("Insira a abscissa do segundo ponto (x2): ")
		leia(x2)
		escreva("Insira a ordenada do segundo ponto (y2): ")
		leia(y2)

		d = mat.raiz((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1), real 2)

		escreva("A distância entre os pontos é de " + d + " unidades.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */