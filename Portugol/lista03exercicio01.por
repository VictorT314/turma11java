programa
{
	
	funcao inicio()
	{
		real salarioTotal = 0.00, mediaSalarial = 0.00, mediaFilhos = 0.00, maiorSalario = 0.00, percent = 0.00, salario, filhos, totalFilhos = 0.00, percentual = 0.00 
		const inteiro LIMITE = 20
		
		para (inteiro habitante = 1; habitante <= LIMITE; habitante++){
			escreva("Digite o salário: ")
			leia(salario)
			salarioTotal = salario + salarioTotal
			escreva("Digite o número de filhos: ")
			leia(filhos)
			totalFilhos = totalFilhos + filhos

			se (salario < 100.00){
				percent = percent + 1
			}
			
			se (salario > maiorSalario){
				maiorSalario = salario
			}
			
		}
		mediaSalarial = salarioTotal/20
		mediaFilhos = totalFilhos/20
		percentual = (percent * 100)/20
		escreva("\nMédia do salário da população: R$" + mediaSalarial)
		escreva("\nMédia do número de filhos da população: " + mediaFilhos)
		escreva("\nMaior salário da população: R$" + maiorSalario)
		escreva("\nPercentual de pessoas com salário de até R$ 100,00: " + percent + " pessoas (" + percentual + "%)")
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