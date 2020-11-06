programa
{
	
	funcao inicio()
	{
		cadeia nomes[29] ={
	/*0*/	"Aluna Ana veronica Nascimento cruz\t",
	/*1*/	"Aluno Bruno Estivalli Vicente\t\t",
	/*2*/	"Aluno Bruno Henrique Moraes Santos\t",
	/*3*/	"Aluno Daniel Ferreira\t\t\t",
	/*4*/	"Aluna Dayane de Oliveira\t\t",
	/*5*/	"Aluno Denis Vinicius Bolla da Silva\t",
	/*6*/	"Aluno Diego  Joaquim Silva\t\t ",
	/*7*/	"Aluno Erick Alan\t\t\t",
	/*8*/	"Aluno Everson Silva\t\t\t",
	/*9*/	"Aluno Gabriel Enrique Cabral Silva\t",
	/*10*/	"Aluno Guilherme Alex\t\t\t",
	/*11*/	"Aluno Guilherme Fidelis Pereira\t\t",
	/*12*/	"Aluno Gustavo Miquéias Lopes Santana\t",
	/*13*/	"Aluno Isac Cordeiro de Oliveira\t\t",
	/*14*/	"Aluno Iuri Garcia Nunes\t\t\t",
	/*15*/	"Aluna Jenifer Lima Placido\t\t",
	/*16*/	"Aluna Jéssica Cristiane\t\t\t",
	/*17*/	"Aluno Joao Pedro Sena\t\t\t",
	/*18*/	"Aluna Larissa Moraes Ribeiro\t\t",
	/*19*/	"Aluno Leonardo de Moraes Magalhães\t",
	/*20*/	"Aluno Lucas Santos Gonçalves\t\t",
	/*21*/	"Aluna Mariana  de Cássia Antunes Oliveira",
	/*22*/	"Aluna Patricia da Silva Machado\t\t",
	/*23*/	"Aluna Paula Leticia\t\t\t",
	/*24*/	"Aluno Raul Fernandes\t\t\t",
	/*25*/	"Aluno RICARDO MAGALHAES FINKELSTEIN\t",
	/*26*/	"Aluno Thiago dos Anjos\t\t\t",
	/*27*/	"Aluna Vitória Gonçalves de Freitas\t",
	/*28*/	"Aluno William Xavier\t\t\t"}
	
	cadeia email[29] ={
/*0*/	"anaveronica3001@hotmail.com",
/*1*/	"bruno.estivalli@gmail.com",
/*2*/	"brunohmoraes93@gmail.com",
/*3*/	"daniel.z.ferreira@hotmail.com",
/*4*/	"dayane873@gmail.com\t",
/*5*/	"denisvini@gmail.com\t",
/*6*/	"joaquim.diego8@gmail.com",
/*7*/	"erickalan068@gmail.com\t",
/*8*/	"eversonmessias@outlook.com",
/*9*/	"gabrieldgrafico@outlook.com",
/*10*/	"guilhermealex01@gmail.com",
/*11*/	"gui.fdsk@hotmail.com\t",
/*12*/	"gumiqueias@hotmail.com\t",
/*13*/	"zaq.c@live.com\t\t",
/*14*/	"iurinunes01@gmail.com\t",
/*15*/	"jenifer.sdti@gmail.com\t",
/*16*/	"jessicacristianebtr@gmail.com",
/*17*/	"joao_usercon@hotmail.com",
/*18*/	"larissaribeiro03@hotmail.com",
/*19*/	"leo_o_nardo1@outlook.com",
/*20*/	"lucas.00.santos@outlook.com",
/*21*/	"mari_oli25@hotmail.com\t",
/*22*/	"pathsilva09@gmail.com\t",
/*23*/	"paula.leticia.braz@gmail.com",
/*24*/	"raulogus2@gmail.com\t",
/*25*/	"ricardomrfin@gmail.com\t",
/*26*/	"thiagohdosanjos99@gmail.com",
/*27*/	"vitoriagcf@hotmail.com\t",
/*28*/	"william.xavier07@hotmail.com"}
	
	inteiro x=0
	logico continua = verdadeiro
	caracter continuar
	inteiro pontos[29]
	caracter entrega
	inteiro nota[29]
	
	
	cadeia  codigo[29] = {"G3-0","G3-1","G3-2","G3-3","G3-4","G3-5","G3-6","G3-7","G3-8","G3-9",
"G3-10","G3-11","G3-12","G3-13","G3-14","G3-15","G3-16","G3-17","G3-18","G3-19","G3-20","G3-21","G3-22",
"G3-23","G3-24","G3-25","G3-26","G3-27","G3-28"}
					
			
			enquanto(continua)
			{	
				escreva("CODIGO","\t","NOME","\t\t\t\t\t\t","EMAIL,")
				escreva("\n\n")
				para(x=0; x<29;x++)
				{
					escreva (codigo[x],"\t")
					escreva (nomes[x],"\t")
					escreva("\t\t",email[x])
					escreva("\n")
					escreva("---------------------------------------------------------------------------------------------------------------------------------------------------")
					escreva("\n")
					
				}
			escreva("Codigo de aluno? ")
			leia(x)
			limpa()
			escreva("CODIGO\t","NOME\t","\t\t\t\t\tEMAIL\n")
			escreva(codigo[x],"\t",nomes[x],"\t\t",email[x])
			escreva("\n")
			escreva("SELECIONAR ENTREGA SIM OU NÃO? ")
			leia(entrega)
			escreva("\n")
			se(entrega == 'S' ou entrega == 's')
				{
				pontos[x] = pontos[x] +1
				} senao se(entrega == 'N' ou entrega == 'n'){
					pontos[x]=pontos[x]+0
				}
			
			escreva("Digite uma nota para o aluno de 0 a 10 ")
				leia(nota[x])
			escreva("\n")	
			escreva("\ncontinuar SIM ou NAO? ")
			leia (continuar)
			escreva("\n")
			
			se(continuar == 'S' ou continuar == 's')
				{
									
				}senao se(continuar == 'N' ou continuar == 'n') {
					
					escreva("CODIGO","\t","NOME","\t\t\t\t\t\t\t","EMAIL","\t\t\t\t\tENTREGAS","\tNOTA")
				escreva("\n\n")
				para(x=0; x<29;x++)
				{
					escreva (codigo[x],"\t")
					escreva (nomes[x],"\t")
					escreva("\t",email[x],"\t")
					escreva("\t",pontos[x],"\t\t")
					escreva(nota[x])
					escreva("\n")
					escreva("----------------------------------------------------------------------------------------------------------------------------------------")
					escreva("\n")
					
				}
					pare
				}
					
				
			}
		
			
		}	
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4096; 
 * @DOBRAMENTO-CODIGO = [36];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */