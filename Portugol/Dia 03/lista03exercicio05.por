programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro numero = 233

		faca{
			limpa()
			escreva("Contagem em progresso: " + numero)
			numero = numero + 5
			Util.aguarde(500)
			
		} enquanto (numero < 300)
		
		faca{
			limpa()
			escreva("Contagem em progresso: " + numero)
			numero = numero + 3
			Util.aguarde(500)
			
			
		} enquanto (numero > 300 e numero < 400)
		
		faca{
			limpa()
			escreva("Contagem em progresso: " + numero)
			numero = numero + 5
			Util.aguarde(500)
			
		} enquanto (numero < 456)
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