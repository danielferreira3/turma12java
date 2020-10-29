programa
{
	//Faça um sistema que leia a idade de uma pessoa expressa em dias
	//e mostre-a expressa em anos, meses e dias.
	inteiro dias
	inteiro resultado1
	inteiro resultado2
	inteiro resultado3
	
	funcao inicio()
	{
		escreva("quantos dias voce tem? ")
		leia(dias)
		resultado1 = dias / 365
		resultado2 = (dias%365)/30
		resultado3 = (dias%365) %30		
		escreva ("voce tem " + resultado1 + " anos " + resultado2 + " meses e " + resultado3 + " dias")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */