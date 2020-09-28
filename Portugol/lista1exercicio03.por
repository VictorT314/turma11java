programa
{
	
	funcao inicio()
	{
		inteiro duracaoEvento, horas = 0, minutos = 0, segundos = 0, restante = 0

		escreva("Informe a duração do evento (em segundos): ")
		leia(duracaoEvento)

		horas = duracaoEvento / 3600
		restante = duracaoEvento % 3600
		minutos = restante / 60
		restante = restante % 60
		segundos = restante

		escreva("O evento durou " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */