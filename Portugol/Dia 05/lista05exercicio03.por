programa
{
	/*
	 * Escrever um programa que leia uma quantidade desconhecida 
	 * de números e conte quantos deles estão nos seguintes 
	 * intervalos: [0-25], [26-50], [51-75] e [76-100]. 
	 * A entrada de dados deve terminar quando for lido um número negativo.
	 */
	funcao resposta(inteiro quantidades[], cadeia intervalos[]){
		para(inteiro x = 0; x < 4; x++){
			escreva("Intervalo " + intervalos[x] + ": " + quantidades[x])
			pula()
		}
	}
	
	funcao pula(){
		escreva("\n")
	}
	 
	funcao inicio()
	{
		//VARIÁVEIS
		real numeros[1000] 
		inteiro quantidades[4], x = 0, y = 0, cont = 0, i = 0, j = 0
		cadeia intervalos[4] = {"[0-25]", "[26-50]", "[51-75]", "[76-100]"}

		//PROCESSAMENTO
		faca{
			escreva("Digite um número (Para sair, digite um número negativo): ")
			leia(numeros[i])
			limpa()
			enquanto(numeros[i] >= 0){
				i++
				escreva("Digite um número (Para sair, digite um número negativo): ")
				leia(numeros[i])
				limpa()
			}
		}enquanto(numeros[i] >= 0)

		para(x = 0; x < 4; x++){
			quantidades[x] = 0
		}
		
		para(x = 0; x < i; x++){
			se (numeros[x] >= 0 e numeros[x] <= 25){
				quantidades[y] = quantidades[y] + 1
			}
			y++
			senao se(numeros[x] >= 26 e numeros[x] <= 50){
				quantidades[y] = quantidades[y] + 1
			}
			y++
			senao se(numeros[x] >= 51 e numeros[x] <= 75){
				quantidades[y] = quantidades[y] + 1
			}
			y++
			senao se(numeros[x] >= 76 e numeros[x] <= 100){
				quantidades[y] = quantidades[y] + 1
			}
			y = 0
		}

		escreva("Números digitados: ")
		para(x = 0; x < i; x++){
			escreva("[" + numeros[x] + "] ")
		}

		//SAÍDAS
		pula()
		pula()
		escreva("QUANTIDADE DE NÚMEROS POR INTERVALO")
		pula()
		resposta(quantidades,intervalos)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1537; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */