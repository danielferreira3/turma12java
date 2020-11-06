programa
{
	inclua biblioteca Util
	/*
	 * 3.  	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

	 */
	funcao inicio()
	{
		const inteiro LINHAN1 = 4
		const inteiro LINHAN2 = 4
		const inteiro COLUNAN1 = 6
		const inteiro COLUNAN2 = 6
		const inteiro LINHAM1 = 4
		const inteiro LINHAM2 = 4
		const inteiro COLUNAM1 = 6
		const inteiro COLUNAM2 = 6
		inteiro colunam1
		inteiro colunam2
		inteiro quadrinhos[LINHAN1][COLUNAN1]
		inteiro quadrinho2[LINHAN2][COLUNAN2]
		inteiro quadrinhosSoma=0
		inteiro quadrinhosSub = 0
	
		inteiro x=0,y=0
		para (x=0; x< LINHAN1; x++)
		{
			para (y=0; y< COLUNAN1; y++)
			{
				quadrinhos[x][y] = Util.sorteia(1, 9)
				escreva (quadrinhos[x][y])
				escreva(" ")
			}
			escreva ("\n")
		}
		escreva("\n")
		para (x=0; x< LINHAN2; x++)
		
		{
			
			para (y=0; y< COLUNAN2; y++)
			{	
				quadrinho2[x][y] = Util.sorteia(1, 9)
				escreva (quadrinho2[x][y])
				escreva(" ")
			}
			escreva ("\n")
		}
		escreva ("\n")
		para (x=0; x< LINHAM1; x++)
		
		{
			
			para (y=0; y< COLUNAM1; y++)
			{	
				
				
				quadrinho2[x][y] = quadrinho2[x][y] + quadrinhos[x][y]
				quadrinhosSoma = quadrinho2[x][y]
				escreva (quadrinhosSoma)
				escreva(" ")
				
			}
			escreva ("\n")
			
			para (y=0; y< COLUNAM2; y++)
			
			{	
					
				quadrinho2[x][y] = quadrinho2[x][y] - quadrinhos[x][y]
				quadrinhosSub = quadrinho2[x][y]
				escreva (quadrinhosSub)
				escreva(" ")
			}
			escreva("\n")
			
		}
		
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1569; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */