programa
{
	/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	 * (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	 * 
	 */
	 
	funcao inicio()
	{
		inteiro base
		inteiro altura
		inteiro area
		escreva ("digite a base do triangulo ")
		leia (base)
		escreva ("digite a altura do triangulo ")
		leia (altura)
		area = ((base * altura) / 2)

		se (base > 0 e altura > 0)
		{
			escreva ("a area do seu triangulo é " + area )
		}
		senao
		{
			escreva ("area e altura invalido")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 550; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */