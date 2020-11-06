programa
{
	
	funcao inicio()
	{
		real camisa = 25.00 //reais
		inteiro x = 0
		escreva ("escolha os seguintes numeros referente a forma de pagamento\n")
		escreva ("Digite' 0 'pagamento a vista' 1 'no cartao avista,' 2 'para cartao ate '3X' e acima de '3x' digite' 4 ' ")
		leia (x)

		se (x == 0)
		{
			escreva("voce recebeu 20% de desconto o valor da camisa sai por ",(20*camisa)/100," Reais")	
		} senao se(x == 1 )
		{
			escreva("voce recebeu 15% de desconto o valor da camisa sai por ",(15*camisa)/100,"Reais")
		} senao se(x == 2)
		{
			escreva("Preço normal sem jurus é de ",camisa," Reais")
		} senao se(x == 4)
		{
			escreva("acima de 3x juros de 10%, o valor fica ",((10*camisa)/100)+camisa," Reais")
		} senao se (x > 4)
		{
			escreva("Numero digitado invalido")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 784; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */