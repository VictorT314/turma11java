programa
{
	
	inclua biblioteca Util
	funcao inicio()
	{
		const inteiro LIMITE = 10
		inteiro lancamentos[LIMITE], maiorPontuacao = 0, i = 0

		para(i = 0; i < LIMITE; i++){
			lancamentos[i] = Util.sorteia(1, 6)
			
			se (lancamentos[i] == 6){
				maiorPontuacao = maiorPontuacao + 1  
			}
		}
		para(i = 0; i < LIMITE; i++){
			escreva("O lançamento " + (i + 1) + " resultou em: " + lancamentos[i])
			pula()
		}
		pula()
		escreva("Número de ocorrências do valor 6: " + maiorPontuacao)
		pula()
	}

	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */