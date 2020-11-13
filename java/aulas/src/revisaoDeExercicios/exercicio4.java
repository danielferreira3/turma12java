package revisaoDeExercicios;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que calcula e escreve a seguinte soma: soma
		 *  = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		 */
		Scanner leia=new Scanner(System.in);
		
		int soma=0;
		
		for(int x=0;x<50;x++)
		{
			
			
			soma=x+1;
			System.out.println((x+soma)+"/"+(x+1));
			
			
				
			
		}
	}

}
