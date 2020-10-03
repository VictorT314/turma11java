programa
{
	/*
	 * Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
	 */
	funcao linha(){
		para(inteiro x = 0; x < 609; x++){
			escreva("═")
		}
	}
	funcao inicio()
	{
		//VARIÁVEIS
		const inteiro LIM = 50
		real  soma[LIM],numeradores[LIM], denominadores[LIM], resultadoSoma = 0.00
		inteiro x = 0

		//PROCESSAMENTO
		
		para(x = 1; x <= LIM; x++){
			numeradores[x-1] = (2*x - 1) 
		}
		para(x = 0; x < LIM; x++){
			denominadores[x] = x + 1
			resultadoSoma = resultadoSoma + (numeradores[x]/denominadores[x])
		}
		linha()
		escreva("\n")
		escreva("║Soma ")
		para(x = 0; x < LIM; x++){
			escreva(numeradores[x] + "/" + denominadores[x])
			se(x != (LIM - 1)){
				escreva(" + ")
			}
		}
		
		escreva(" = ")
		escreva(resultadoSoma + "║")
		escreva("\n")
		linha()
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 122; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */