programa
{
	
	funcao inicio()
	{
		real base, altura, area = 0.00

		linha()
		escreva("Digite a medida da base do triângulo: ")
		leia(base)
		linha()
		escreva("Digite a medida da altura do triângulo: ")
		leia(altura)
		

		se(base <= 0 ou altura <= 0){
			linha()
			escreva("\nA medida deve ter valor positivo e diferente de zero!")
		}
		senao{
			area = base * altura / 2
			linha()
			escreva("Base: " + base + " u.c.")
			escreva("\nAltura: " + altura + " u.c.")
			escreva("\nÁrea: " + area + " u.a.\n")
			linha()
		}
	}
	funcao linha(){
		escreva("+------------------------------------------------+\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */