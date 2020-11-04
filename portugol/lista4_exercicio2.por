programa
{
	inclua biblioteca Util
	/*2.Um dado é lançado 10 vezes e o valor correspondente é anotado.
	 * Faça um programa que gere um vetor com os lançamentos, 
	 * escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, 
	 * contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	 * 
	 */
	funcao inicio()
	{
		const inteiro LIMITE = 6
		inteiro lancamentos[LIMITE]
		inteiro x = 0
		inteiro somaLancamentos = 0
		inteiro = contadorMaior = 0
		inteiro maiorValor = 0
		para(x=0;x<LIMITE;x++)
		{
			lancamentos[x] = Util.sorteia(1,6)
			escreva("\nvalor na posição ", x+1, ":",lancamentos[x])
			somaLancamentos = somaLancamentos + lancamentos[x]
			se (lancamentos[x] >=maiorValor )
			{
				se(lancamentos[x]!=maiorValor)
				{
					contadorMaior=0
				}
				maiorValor = lancamentos[x]
				contadorMaior++
			}
			
		}
		escreva ("\ntotal de valore somados ",somaLancamentos )
		escreva ("\nmedia aritmetica ",(somaLancamentos / LIMITE))
		escreva ("\nMaior valor ",maiorValor)
		escreva("\nQuantas vezes aparece: ",contadorMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */