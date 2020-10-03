programa
{
	//FUNÇÕES
	funcao pula(){
		escreva("\n")
	}
	funcao linha(){
		para (inteiro a = 1; a < 60; a++){
			escreva("═")
		}
	}
	funcao inicio()
	{
		//DECLARANDO OS VETORES
		const inteiro LIM = 39
		inteiro mat[LIM] //0 - 38
		cadeia lista[LIM] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Conceição de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","João Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","Mônica dos santos ribeiro","Natália Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"} 
		inteiro x = 0, quantidade

		
		para(x = 0; x < LIM; x++){
			mat[x] = x+1
			
		}

		para(x = 0; x < LIM; x++){
			escreva("MATRÍCULA: ", mat[x],"     ALUNO: ",lista[x])
			pula()
			pula()
			
		}
		escreva("Digite a quantidade de alunos por grupo: ")
		leia(quantidade)

		enquanto(quantidade >= 20){
			escreva("A quantidade deve ser menor do que 20!")
			pula()
			escreva("Digite a quantidade de alunos por grupo: ")
			leia(quantidade)
		}

		para(x = 0; x < quantidade; x++){
			escreva("Grupo ",(x+1),": ")
			pula()
			escreva(lista[x])
		}
	}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1829; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */