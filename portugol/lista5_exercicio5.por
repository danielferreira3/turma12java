programa
{
	/*
	 * 5-  Faça um programa que leia um vetor de 5 posições para números reais e, 
	 * depois, um código inteiro. Se o código for zero, finalize o programa; se for 1,
	 * mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
	 * Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código 
	 * inválido.
	 */
	funcao inicio()
	{
		real vetor[5]
		inteiro codigo=0
		
		para (inteiro x = 0; x<5; x++)
		{
			escreva("Digite o valor:",x+1," : ")	
			leia(vetor[x])
		}
		escreva("Digite o codigo 0 /1 /2 :")
		leia(codigo)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */