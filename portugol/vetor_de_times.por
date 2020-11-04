programa
{
	
	funcao inicio()
	{
		cadeia times[4] //vetor habibs - começa com 0
		inteiro pontos[4] //vetor de de numeros inteiros
		times[0] = "CORITHIANS"
		times[1] = "PALMEIRAS"
		times[2] = "SANTOS"
		times[3] = "SPFC"
		caracter op
		
		para (inteiro x= 0; x<4; x++)
		{
			escreva("\n",times[x])
			
		}
		para (inteiro x = 0; x<4; x++){
			escreva("\nDigite se o time ", times[x], "  Ganhou, Empatou ou Perdeu: ")
			leia(op)
			se (se op =='G')
			{
				pontos[x] = pontos[x]+3	
			}
			
		}
		para (inteiro x = 0; x<4 ; x++){
			escreva("\n",times[x]," tem ",pontos[x], " pontos!!!")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */