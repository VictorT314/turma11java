programa
{
	inclua biblioteca Util
	
	
	 funcao pula()
	 {
	 	escreva ("\n")
	 }
	funcao inicio()
	{
		real vetor [5]
		inteiro c = 0
		inteiro x =0
		para (x = 0; x < 5; x++)
		{
			escreva(" Digite o ",x+1,"º elemento para o vetor : ")
			//vetor [x] = x+1
			//vetor[x] = Util.sorteia(0, 100)
			leia(vetor[x])
			pula()
						
			
		}
		limpa ()
		escreva (" Codigos 0 = sair, 1 = imprimir o vetor na ordem direta, 2 = imprimir vetor na ordem inversa")
		pula()
		escreva ("Digite o codigo :")
		leia(c)
		se ( c == 0)
		{
			escreva ("FIM")
		}senao se ( c == 1)
		{
			para (x = 0; x <5 ; x +=1)
			{
				escreva (" ",vetor[x],", ")
			}
		}senao se ( c == 2)
		{
			
			para (x = 4; x >=0 ; x-=1)
			{
				escreva (" ",vetor[x],", ")
			}
			
			
			
		}
			
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */