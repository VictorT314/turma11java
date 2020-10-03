programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro notas[4], maiorNota = 0
		inteiro i = 0
		cadeia alunos[4]

		para(i = 0; i < 4; i++){
			escreva("Digite o seu nome: ")
			leia(alunos[i])
			escreva("Digite a sua nota: ")
			leia(notas[i])
			limpa()
			se (notas[i] > maiorNota){
				maiorNota = notas[i]
			}
		}
		para(i = 0; i < 4; i++){
			se (notas[i] == maiorNota){
				escreva("\n["+alunos[i]+"]")
				escreva("["+notas[i]+"*]")
				escreva("\n")
			}senao{
				escreva("\n["+alunos[i]+"]")
				escreva("["+notas[i]+"]")
				escreva("\n")
			}
		}
		
			
		}
		
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */