programa
{
	
	funcao inicio()
	{
		inteiro totalMultiploImpar3 = 0
		inteiro x = 1

		para (x = 3; x<=500; x++)
		{
			se ((x % 3 == 0) e (x % 2 == 1))
			{
				totalMultiploImpar3 = totalMultiploImpar3 + x
			}
			
		}
		escreva ("\no total de multiplos de 3 impares é", totalMultiploImpar3)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */