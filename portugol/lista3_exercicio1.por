programa
{
	
	/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
	 *coletando dados sobre o salário e número de filhos. 
	 *A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
	 */
	funcao inicio()
	{
		inteiro filhos = 0
		real salario
		real mediaSalario = 0.0
		real mediaFilhos = 0.0
		real maiorSalario = 0.0
		real menor100 = 0.0
		inteiro quantidade 

		escreva ("Quantitade de pessoas ")
		leia (quantidade)

		para (inteiro x=1; x <=quantidade; x++)
		{
			 escreva ("digite seu salario ")
			 leia (salario)
			 limpa()
			 mediaSalario = mediaSalario + salario
			 se (salario < 100)
			 {
				menor100	= menor100+1		 	
			 }
			 escreva ("Quantidade de filhos; ")
			 leia (filhos)
			 limpa()
			 mediaFilhos = mediaFilhos + filhos
			 
			 se (maiorSalario < salario)
			 {
			 	maiorSalario = salario
			 }
			
		}
		menor100 = ((menor100 * 100) / quantidade)
		mediaSalario = mediaSalario / quantidade
		mediaFilhos = mediaFilhos / quantidade
		escreva ("\n","media de salario ", mediaSalario "\n")
		escreva ("\n","media de filhos é; ", mediaFilhos"\n")
		escreva ("\n","o maior salario é; ", maiorSalario,"\n")
		escreva ("percentual de pessoas com salário até R$100,00 é ", menor100 + " %")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 597; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */