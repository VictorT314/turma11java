programa
{
	
	funcao inicio()
	{
		const inteiro LIMITE = 5
		real pontuacao[LIMITE], maiorPontuacao = 0.00 
		inteiro contador = 0
		
		
		para(inteiro indice = 0; indice < LIMITE; indice++){
			pula()
			escreva("Digite o valor da pontuação: ")
			leia(pontuacao[indice])

			se (pontuacao[indice] > maiorPontuacao){
				maiorPontuacao = pontuacao[indice]
			}
			limpa()
			
		}
		
		escreva("Lista de pontuações:")
		pula()
		pula()
		enquanto (contador < LIMITE){
			escreva("Pontuação " + (contador + 1) + ": " + pontuacao[contador])
			pula()
			contador++
		}
		pula()
		escreva("Maior pontuação: " + maiorPontuacao)
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
 * @POSICAO-CURSOR = 633; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */