package lista4;

import java.util.Scanner;

/*
 * 1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o
 *  de uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
 */
public class exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int aluno[] = new int [5];
		int maiorPontuacao = 0;
		
		
		for(int x=0; x<5 ;x++) 
		{
			System.out.println("Digite a pontua��o do " + (x+1) + "�" + "Aluno");
			aluno[x] = leia.nextInt();
			
			if(maiorPontuacao < aluno[x]) {
				
				maiorPontuacao = aluno[x];
			}
		}
		
		System.out.println("A maior pontuacao � "+maiorPontuacao);
 	}
}
