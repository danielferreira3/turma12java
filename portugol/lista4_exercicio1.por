programa
{
	/*
	 * 1. Faça um programa que crie um vetor por leitura com 5 valores 
	 * de pontuação de uma atividade e o escreva em seguida. 
	 * Encontre após a maior pontuação e a apresente.
	 */
	funcao inicio()
	{
		inteiro valores[5],x
		inteiro maiorPontuacao= 0
		para (x=0;x<5;x++)
		{
			escreva ("digite a pontuação ",x+1,"°"," Aluno\n")
			leia (valores[x])

			se (maiorPontuacao < valores[x])
			{
				maiorPontuacao = valores[x]
			}
			
		}
		escreva ("A maior pontuação é de ",maiorPontuacao," pontos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 524; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 10, 10, 7}-{x, 10, 21, 1}-{maiorPontuacao, 11, 10, 14};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */