programa
{
	/*
	 * Obtenha um número digitado pelo usuário e repita a operação de 
	 * multiplicar ele por três  (imprimindo o novo valor) 
	 * até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
	 * deveremos observar na tela a seguinte sequência: 5 15 45 135.
	 */
	funcao inicio()
	{
		inteiro valor
		escreva("digite um valor")
		leia(valor)
		para(inteiro x=0; x < 100; x++)
		{
			escreva("\n",valor)
			valor = valor * 3
			se (valor == 135)
			{
				escreva("\n", valor)
			pare	
			
			}
			
		
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 213; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */