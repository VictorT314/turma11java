programa
{
	
	funcao inicio()
	{
		real num1, num2, num3, num4, q1 = 0.00, q2 = 0.00, q3 = 0.00, q4 = 0.00

		escreva("Digite o primeiro número: ")
		leia(num1)
		escreva("Digite o segundo número: ")
		leia(num2)
		escreva("Digite o terceiro número: ")
		leia(num3)
		escreva("Digite o quarto número: ")
		leia(num4)

		q1 = num1 * num1
		q2 = num2 * num2
		q3 = num3 * num3
		q4 = num4 * num4

		se (q3 >= 1000){
			escreva("\n num3 = " + num3 + "       " + "(num3)² = " + q3)
		}
		senao{
			escreva("\nnum1 = " + num1 + "        " + "(num1)² = " + q1)
			escreva("\nnum2 = " + num2 + "        " + "(num2)² = " + q2)
			escreva("\nnum3 = " + num3 + "        " + "(num3)² = " + q3)
			escreva("\nnum4 = " + num4 + "        " + "(num4)² = " + q4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 490; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */