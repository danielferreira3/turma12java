programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		/*
		 * 4-Faça um programa que calcula e escreve a seguinte soma:
		 * soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		 */
		 real soma = 0
		 real valor=1
		
		 para (inteiro x=1 ; x<=50; x++)
		 {
		 	soma = valor/x + soma
		 	//valorImpar = valorImpar + 2
		 	valor=valor + 2 //aula 1 ou 2
		 }
		 escreva(mat.arredondar(soma,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 262; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */