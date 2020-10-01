programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]
		inteiro i = 0, j = 0  // onde i = linhas e j = colunas

		para(i = 0; i < 4; i++){
			para(j = 0; j < 6; j++){
				N1[i][j] = Util.sorteia(1, 100)
				N2[i][j] = Util.sorteia(1, 100)
				limpa()
			}
		}
		
		para(i = 0; i < 4; i++){
			para(j = 0; j < 6; j++){
				M1[i][j] = N1[i][j] + N2[i][j]
				M2[i][j] = N1[i][j] - N2[i][j]
			}
		}
		
		pula()
		escreva("MATRIZ N1: ")
		pula()
		pula()
		para(i = 0; i < 4; i++){
			para(j = 0; j < 6; j++){
				escreva(N1[i][j])
				concatenar()
			}
			pula()
		}
		pula()
		escreva("MATRIZ N2: ")
		pula()
		pula()
		para(i = 0; i < 4; i++){
			para(j = 0; j < 6; j++){
				escreva(N2[i][j])
				concatenar()
			}
			pula()
		}
		
		pula()
		escreva("MATRIZ M1 (onde M1 = N1 + N2): ")
		pula()
		pula()
		para(i = 0; i < 4; i++){
			para(j = 0; j < 6; j++){
				escreva(M1[i][j])
				concatenar()
			}
			pula()
		}
		pula()
		escreva("MATRIZ M2 (onde M2 = N1 - N2): ")
		pula()
		pula()
		para(i = 0; i < 4; i++){
			para(j = 0; j < 6; j++){
				escreva(M2[i][j])
				concatenar()
			}
			pula()
		}
	}

	funcao concatenar(){
		escreva(" ")
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
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */