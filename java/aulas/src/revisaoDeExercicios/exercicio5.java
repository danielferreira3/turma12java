package revisaoDeExercicios;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		/*
		 * Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e,
		 *  depois, um c�digo inteiro. Se o c�digo for zero, finalize o programa;
		 *   se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na
		 *    ordem inversa. Caso, o c�digo for diferente de 1 e 2, escreva uma mensagem
		 *     informando que o c�digo inv�lido.
		 */
		double vetor[]=new double[5];
		int codigo=0;
		int i=0;
		
		
		for ( i = 0; i < 5; i++) 
		{
			
			System.out.print("digite posi�oes "+(i+1)+": ");
			vetor[i]=leia.nextDouble();
		}	
			System.out.print("digite codigo: ");
			codigo=leia.nextInt();
			
			
			if(codigo==0)
			{
				System.out.println("Programa Finalizado.");
			}
			else if(codigo==1)
			{
				System.out.println("Ordem direta:\n");
				for (i =0 ; i < 5; i++)
				{
					System.out.println(vetor[i]);
				}
				
			}
			else if(codigo==2)
			{
				System.out.println("Ordem inversa:\n");
				for (i =4 ; i >= 0; i--)
				{
					System.out.println(vetor[i]);
				}
				
			}
			else
			{
				System.out.println("Codigo invalido.....");
			}
			
		
		{
			
		}
		
		
	}
}
