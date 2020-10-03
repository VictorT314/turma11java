programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Insira a idade do(a) nadador(a): ")
		leia(idade)

		se(idade >= 5 e idade <= 7){
			escreva("\nCategoria: Infaltil A") 
		} 
		senao se(idade >= 8 e idade <= 11){
			escreva("\nCategoria: Infaltil B")
		}
		senao se(idade == 12 ou idade == 13){
			escreva("\nCategoria: Juvenil A")
		}
		senao se(idade >= 14 e idade <= 17){
			escreva("\nCategoria: Juvenil B")
		}
		senao se(idade >= 18){
			escreva("\nCategoria: Adultos")
		}
		senao{
			escreva("\nIdade não aceita no sistema!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 545; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */