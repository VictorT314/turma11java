programa
{
	
	funcao inicio()
	{
		cadeia nomeUsuario
		caracter opcao
		inteiro anoNascimento, idade

		escreva("Digite o seu nome: ")
		leia(nomeUsuario)
		escreva("Digite M - masculino ou F - feminino: ")
		leia(opcao)
		escreva("Digite o ano de Nascimento: ")
		leia(anoNascimento)

		idade = 2020 - anoNascimento
		
		se (opcao == 'M' ou opcao == 'm'){
			se (idade < 25){
				escreva("Oi, senhor " + nomeUsuario + ", você é jovem.")
			} senao se (idade >= 25 e idade < 60){
				escreva("Oi, senhor " + nomeUsuario + ", você é maduro.")
			} senao{
				escreva("Oi, senhor " + nomeUsuario + ", você é idoso.")
			}
		} senao se (opcao == 'F' ou opcao == 'f'){
			se (idade < 25){
				escreva("Oi, senhora " + nomeUsuario + ", você é jovem.")
			} senao se (idade >= 25 e idade < 60){
				escreva("Oi, senhora " + nomeUsuario + ", você é madura.")
			} senao{
				escreva("Oi, senhora " + nomeUsuario + ", você é idosa.")
			}
		} senao{
			se (idade < 25){
				escreva("Oi, senhorx " + nomeUsuario + ", você é jovem.")
			} senao se (idade >= 25 e idade < 60){
				escreva("Oi, senhorx " + nomeUsuario + ", você é madurx.")
			} senao{
				escreva("Oi, senhorx " + nomeUsuario + ", você é idosx.")
			}
		}

		
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 792; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */