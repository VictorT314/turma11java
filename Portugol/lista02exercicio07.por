programa
{
	
	funcao inicio()
	{
		real base, altura, area = 0.00

		escreva("Digite a medida da base do triângulo: ")
		leia(base)
		escreva("Digite a medida da altura do triângulo: ")
		leia(altura)

		se(base <= 0 ou altura <= 0){
			escreva("\nA medida deve ter valor positivo e diferente de zero!")
		}
		senao{
			area = base * altura / 2
			escreva("\nBase: " + base + " u.c.")
			escreva("\nAltura: " + altura + " u.c.")
			escreva("\nÁrea: " + area + " u.a.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 65; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */