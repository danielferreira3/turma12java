programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
		
		real altura,peso
		cadeia nome
		
		
		escreva("Qual é o seu nome? ")
		leia (nome)
		escreva("Qual é o seu peso? ")
		leia (peso)
		escreva("Qual é a sua altura? ")
		leia(altura)
		
		real imc = mat.arredondar (peso / (altura * altura),2)
		
    		escreva("Ola ",nome,"o seu imc é ", imc,"\n")
		
		se(imc < 18.5)
		{
			escreva("Voce esta a baixo do recomendado\n")	
		} senao se (imc > 25)
		{
			escreva("Voce esta a cima do recomendado\n")
		} senao se (imc >=18.5 e imc <= 25)
		{
			escreva("seu imc esta excelente!")
		} 
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 609; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */