programa
{
	//ano = 365 dias
	//mes = 30 dias
	funcao inicio()
	{
	
	inteiro dia
	inteiro mes
	inteiro ano
	//Ano,mes e dias atual
	inteiro anoAtual
	inteiro diasAtual
	inteiro mesAtual
	inteiro formola1
	inteiro formola2
	inteiro formola3
	inteiro resultado
		escreva ("escreva o dia em que voce nasceu? ")
		leia (dia)
		escreva ("escreva o mes em que voce nasceu? ")
		leia (mes)
		escreva ("escreva o ano em que voce nasceu? ")
		leia (ano)
		escreva ("escreva o dia atual? ")
		leia (diasAtual)
		escreva ("mes atual? ")
		leia(mesAtual)
		escreva ("ano atual? ")
		leia (anoAtual)
		formola1 = (anoAtual - ano) * 365
		formola2 =  diasAtual - dia
		formola3 = (mesAtual - mes) * 30 
		resultado = formola1 + formola2 + formola3
		escreva ("Voce tem " + resultado + " dias de vida")

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 727; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */