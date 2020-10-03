programa
{
	
	funcao inicio()
	{
		inteiro M[3][3], somaElementos = 0, somaDiagonal = 0
		inteiro i = 0, j = 0  // onde i = linhas e j = colunas

		para(i = 0; i < 3; i++){
			para(j = 0; j < 3; j++){
				escreva("Digite o elemento M[" + i + "][" + j + "]: ")
				leia(M[i][j])
				limpa()
				somaElementos = somaElementos + M[i][j]
				se(i == j){
					somaDiagonal = somaDiagonal + M[i][j]
				}
			}
		}
		
		pula()
		escreva("MATRIZ M: ")
		pula()
		pula()
		para(i = 0; i < 3; i++){
			para(j = 0; j < 3; j++){
				escreva(M[i][j])
				concatenar()
			}
			pula()
		}
		pula()
		escreva("A soma dos elementos de M é " + somaElementos)
		pula()
		escreva("A soma dos elementos da diagonal principal de M é " + somaDiagonal)
		pula()
		
	}
	funcao concatenar(){
		escreva("  ")
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
 * @POSICAO-CURSOR = 407; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */