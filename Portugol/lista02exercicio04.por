programa
{
	
	funcao inicio()
	{
		inteiro N

		escreva("Digite um número inteiro: ")
		leia(N)
		
		se (N > 0){
			se(N % 2 == 0){
				escreva("\n" + N + " é par e positivo.")
			}
			senao{
				escreva("\n" + N + " é ímpar e positivo.")
			}
		}
		senao se(N < 0){
			se(N % 2 == 0){
				escreva("\n" + N + " é par e negativo.") //Considerando que inteiros negativos possuem paridade.
			}
			senao{
				escreva("\n" + N + " é ímpar e negativo.")
			}
		}
		senao{
			escreva("\n0 é par e neutro.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */