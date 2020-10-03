programa
{
	/*
	 * Elabore um programa que calcule o que deve ser pago por um produto, 
	 * considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
	 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento 
	 * escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%

	 */
	funcao pula(){
		escreva("\n")
	}

	 
	funcao inicio()
	{
		// VARIÁVEIS
		const inteiro LIM = 4
		inteiro opcao
		real valor, valorFinal = 0.00
		cadeia opcoes[LIM] = {
		"1 - À vista em dinheiro ou cheque, recebe 20% de desconto", 
		"2 - À vista no cartão de crédito, recebe 15% de desconto",
		"3 - Em duas vezes, preço normal de etiqueta sem juros",
		"4 - Em três vezes, preço normal de etiqueta mais juros de 10%"}

		//PROCESSAMENTO
		escreva("Informe o preço do produto: ")
		leia(valor)

		enquanto(valor < 0.00){
			limpa()
			escreva("Valor incompatível! Informe um valor positivo!")
			pula()
			escreva("Informe o preço do produto: ")
			leia(valor)
		}
		limpa()
		escreva("CONDIÇÕES DE PAGAMENTO")
		pula()
		pula()
		para(inteiro i = 0; i < LIM; i++){
			escreva(opcoes[i])
			pula()
		}
		escreva("Por favor, selecione uma opção: ")
		leia(opcao)

		enquanto(opcao != 1 e opcao != 2 e opcao!= 3 e opcao != 4)){
			escreva("Opção inválida! Tente novamente.")
			pula()
			escreva("Por favor, selecione uma opção válida: ")
			leia(opcao)
		}
		limpa()

		//SAÍDAS
		se (opcao == 1){
			valorFinal = valor - 0.2*valor
			escreva("OPÇÃO ESCOLHIDA")
			pula()
			escreva(opcoes[opcao-1])
			pula()
			pula()
			escreva("Valor inicial = R$ " + valor + "\t" + "Valor final = R$ " + valorFinal)
			pula()
		}
		senao se(opcao == 2){
			valorFinal = valor - 0.15*valor
			escreva("OPÇÃO ESCOLHIDA")
			pula()
			escreva(opcoes[opcao-1])
			pula()
			pula()
			escreva("Valor inicial = R$ " + valor + "\t" + "Valor final = R$ " + valorFinal)
			pula()
		}
		senao se(opcao == 3){
			valorFinal = valor
			escreva("OPÇÃO ESCOLHIDA")
			pula()
			escreva(opcoes[opcao-1])
			pula()
			pula()
			escreva("Valor inicial = R$ " + valor + "\t" + "Valor final = R$ " + valorFinal + " em 2x de R$ ", (valorFinal/2))
			pula()
		}
		senao{
			valorFinal = valor + 0.10*valor
			escreva("OPÇÃO ESCOLHIDA")
			pula()
			escreva(opcoes[opcao-1])
			pula()
			pula()
			escreva("Valor inicial = R$ " + valor + "\t" + "Valor final = R$ " + valorFinal + " em 3x de R$ ", (valorFinal/3))
			pula()
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */