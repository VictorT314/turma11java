programa
{
		 
	funcao inicio()
	{
		real numero, media = 0.00, soma = 0.00, cont = 0.00

		escreva("Digite um número: ")
		leia(numero)
		
		enquanto (numero >= 0){
			soma = soma + numero
			cont = cont + 1
			escreva("Digite um número: ")
			leia(numero)
			
		}
		media = soma / cont
		
		escreva("\nRecebido " + cont + " numeros. \nSoma = " + soma + "\nMédia = " + media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */