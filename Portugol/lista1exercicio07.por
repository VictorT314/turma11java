programa
{
	
	funcao inicio()
	{
		real a, b, c, d, E, f, x = 0, y = 0

		escreva("Insira o valor de a: ")
		leia(a)
		escreva("Insira o valor de b: ")
		leia(b)
		escreva("Insira o valor de c: ")
		leia(c)
		escreva("Insira o valor de d: ")
		leia(d)
		escreva("Insira o valor de e: ")
		leia(E)
		escreva("Insira o valor de f: ")
		leia(f)

		x = (c*E - b*f)/(a*E - b*d)
		y = (a*f - c*d)/(a*E - b*d)

		escreva("A solução do sistema é x = " + x + " e y = " + y + ".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
