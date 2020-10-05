programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Faça um programa que lê um vetor de 3 elementos
		 * e uma matriz de 3 x 3 elementos. Em seguida o
		 * programa deve fazer a multiplicação do vetor
		 * pelas colunas da matriz.
		 */
		const inteiro LIMITE=3
		inteiro resultado[LIMITE], vetor[LIMITE], matriz[LIMITE][LIMITE], resultadomatriz[LIMITE][LIMITE], x = 0, y = 0, linha=0, coluna=0
		
		escreva("VETOR:\n")
		para (x = 0; x<LIMITE; x++){
			vetor[x]=Util.sorteia(1, LIMITE)
			escreva(vetor[x])
			escreva(" ")
		}
		escreva("\n")
		// preenchendo a matriz
		escreva("\n")
		escreva("MATRIZ:\n")
		para (linha = 0; linha<LIMITE; linha++){
			para (coluna = 0; coluna<LIMITE; coluna++){
				matriz[linha][coluna]=Util.sorteia(1,LIMITE)
				escreva(matriz[linha][coluna], " ")	
				
			}
			escreva("\n")
	
		}

		para(coluna = 0; coluna<LIMITE; coluna++){
			para (linha = 0; linha<LIMITE; linha++){
				resultado[coluna]=resultado[coluna]+(vetor[coluna]*matriz[linha][coluna]) // versao somatorio
				resultadomatriz[linha][coluna]=(vetor[coluna]*matriz[linha][coluna]) //versão nova matriz
			}
		}
		escreva("\n")
		//MOSTRA O VETOR RESULTADO
		escreva("RESULTADO\n")
		para ( x = 0; x<LIMITE; x++){
			escreva(resultado[x])
			escreva(" ")
		}	
		escreva("\n")
		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */