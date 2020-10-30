programa
{
	
	funcao inicio()
	{
		inteiro codigoDeOperario
		inteiro horasTrabalhadas
		real valorPorHora = 10.00
		inteiro excesso

		escreva("Digite seu codigo de operario ")
		leia(codigoDeOperario)
		escreva ("Quantas horas trabalhadas? ")
		leia (horasTrabalhadas)
		
		se (horasTrabalhadas > 50){ 
		 excesso = (horasTrabalhadas % 50)*20.00
		 escreva ("Valor de horas extra é " + excesso + " Reais\n")
		 escreva ("seu salario com horas extra é " + ((50 * valorPorHora) + excesso) + " Reais" )
		} 
		senao 
		{
		escreva ("Voce não teve horas extras esse mes seu salario é " + (valorPorHora * 50) + " Reais" )		
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 615; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */