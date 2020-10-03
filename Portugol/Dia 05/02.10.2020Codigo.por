programa
{
	funcao pula()
	{
		escreva("\n")
	}
	funcao linha()
	{
		para (inteiro a = 1 ; a < 60; a++){
			escreva("═")
		}
	}
	
	funcao inicio()
	{
		//DECLARANDO OS VETORES
		const inteiro LIMITE = 39
		inteiro mat[LIMITE], quantidade, divisaoAlunos = 0, i = 0, aluno = 0, x = 0
		cadeia lista[] = {"Bruna dos Santos","Bruno Correia da Costa","Bruno de Freitas Sousa","Carla Cristina Conceição de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira","Gabriel Reis Ritter","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","João Victor dos Santos Rigoleto","Jonas de Oliveira Santos","Jonathan Cavalcanti de Paula","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","Mônica dos Santos Ribeiro","Natália Lopes Moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa","Sarah Lidia de Oliveira Braia","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington Pereira dos Santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"}
 		caracter opc = ' '

		faca{
			
			escreva("Matricula       Alune") // cabeçalho
			pula()
			para (x = 0; x <LIMITE; x++)
			{
				mat[x] = x+1 // Atribuição de um número para cada aluno
				
			// LISTAR NA TELA OS NOMES E MATRÍCULAS
				se (x < 9)
				{
					escreva("  ",mat[x],"             ",lista[x]) 	
				}
				senao
				{
					escreva("  ",mat[x],"            ",lista[x]) 	
				}
				pula()
			}
			
			pula()
			escreva("Digite a quantidade de alunos por grupo: ")
			leia(quantidade)
			pula()
			
			enquanto (quantidade > 20){
				escreva("A quantidade deve ser menor do que 20!!")
				pula()
				escreva("Digite a quantidade de alunos por grupo: ")
				leia(quantidade)
			}
			limpa()
			divisaoAlunos = LIMITE/quantidade //limite de alunos por grupo
			aluno = 0
			para (x = 0; x < divisaoAlunos; x++){ //laço para escrever "Grupo X"
				pula()
				escreva("Grupo ",(x+1),": ")
				pula()
				pula()
				para(i = 0; i < quantidade; i++){ //laço para integrantes no grupo
						escreva(mat[aluno], "\t")
						escreva(lista[aluno])
						aluno = aluno + 1
						pula()
					}
				
			}
			se (aluno < LIMITE){ //Caso a divisão de grupos não seja exata
				pula()
				escreva("DIVISÃO NÃO EXATA PARA OS GRUPOS!!! INTEGRANTES QUE SOBRARAM: ")
				pula()
				pula()
				
				para(aluno; aluno < LIMITE; aluno++){
					escreva(mat[aluno], "\t")
					escreva(lista[aluno])
					pula()
				}
			}
			
			pula()
			escreva("Deseja continuar?(S-sim ou N-não): ")
			leia(opc)
		}enquanto(opc == 'S' ou opc == 's')
		pula()
		escreva("FIM DO PROGRAMA")
		pula()
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */