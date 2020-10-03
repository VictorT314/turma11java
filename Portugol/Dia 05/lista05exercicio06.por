programa
{
	inclua biblioteca Util
	/*
	 * Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. 
	 * Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.
	 */
	funcao concatenar(){
		escreva(" ")
	}
	funcao pula(){
		escreva("\n")
	}
	funcao inicio()
	{	
		//VARIÁVEIS
		const inteiro LIM = 3
		real vetor[LIM], matriz[LIM][LIM]
		inteiro i = 0, j = 0

		//PROCESSAMENTO
		para(i = 0; i < LIM; i++){ //laço para obter o vetor com sorteio
			vetor[i] = Util.sorteia(0, 100)
			}
		pula()
		escreva("VETOR: ")
		pula()
		pula()
		para(i = 0; i < LIM; i++){ //laço para escrever o vetor
			escreva(vetor[i])
			concatenar()
		}
		pula()
		
		para(i = 0; i < LIM; i++){ //laço para obter a matriz com sorteio
			para(j = 0; j < LIM; j++){
				matriz[i][j] = Util.sorteia(0, 100)
			}
		}
		pula()
		escreva("MATRIZ: ")
		pula()
		pula()
		para(i = 0; i < LIM; i++){ //laço para escrever a matriz
			para(j = 0; j < LIM; j++){
				escreva(matriz[i][j])
				concatenar()
			}
		pula()
		}
		para(i = 0; i < LIM; i++){ //laço para calcular o produto do vetor com a matriz (resultado é uma matriz coluna)
			para(j = 0; i < LIM; i++){
				matriz[i][j] = vetor[i] * matriz[i][j]
			}
		}
		pula()
		escreva("Resultado")
		pula()
		para(i = 0; i < LIM; i++){
			para(j = 0; i < LIM; i++){
				escreva(matriz[i][j])
				pula()
			}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */