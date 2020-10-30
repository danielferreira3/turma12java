programa
{
		//50 kilos
		//multa de 4,00 reais
		inteiro pesoDeTomate 
		real exesso
		real valorDaMulta = 4
		inteiro pesoMaximo = 50
	funcao inicio()
	{
		escreva("informe o peso? ")
		leia (pesoDeTomate)
		se (pesoDeTomate > 50){
			exesso = (pesoDeTomate % pesoMaximo)	
			
			escreva ("Voce excedeu o limite maximo do peso\n")
			escreva ("ultrapassando " + exesso + " Kg a mais e levou uma multa de " + valorDaMulta + " Reais" )
			
		} senao {
			escreva ("Parabéns voce não ultrapssou o limite de peso")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */