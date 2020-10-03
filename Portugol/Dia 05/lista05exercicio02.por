programa
{
	/*
	 * O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde 
	 * para dar uma indicação sobre a condição de peso de uma pessoa adulta. 
	 * A fórmula é IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
IMC em adultos Condição 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso

	 */
	funcao pula(){
		escreva("\n")
	}
	 
	funcao inicio()
	{	
		//VARIAVEIS
		real peso, altura, imc = 0.00
		caracter opcao = ' '

		//PROCESSAMENTO
		faca{
			escreva("Informe o seu peso(em kg): ")
			leia(peso)
			pula()
			escreva("Informe a sua altura (em metros): ")
			leia(altura)
			
			enquanto(peso < 0 ou altura <= 0){
				limpa()
				escreva("Dados inválidos! Informe valores positivos!")
				pula()
				escreva("Informe o seu peso(em kg): ")
				leia(peso)
				pula()
				escreva("Informe a sua altura (em metros): ")
				leia(altura)
			}
			limpa()
			imc = peso / (altura * altura)
	
			se (imc < 18.5){
				escreva("Valor do IMC = " + imc)
				pula()
				escreva("Condição: Abaixo do peso")
				pula()
			}
			senao se (imc > 18.5 e imc < 25){
				escreva("Valor do IMC = " + imc)
				pula()
				escreva("Condição: Peso normal.")
				pula()
			}
			senao se (imc > 25 e imc < 30){
				escreva("Valor do IMC = " + imc)
				pula()
				escreva("Condição: Acima do peso.")
				pula()
			}
			senao{
				escreva("Valor do IMC = " + imc)
				pula()
				escreva("Condição: Obeso.")
				pula()
			}
			pula()
			pula()
			escreva("Deseja continuar? Digite S para 'sim' ou N para 'não': ")
			leia(opcao)
			limpa()
		} enquanto(opcao == 'S' ou opcao == 's')
		limpa()
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1689; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */