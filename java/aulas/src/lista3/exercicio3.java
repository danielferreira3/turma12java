package lista3;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num;
		int x = 0;
		int soma = 0;
		System.out.println("digite um numero a ser somado");
		num = leia.nextInt();
		
		do 
		{	
			x++;
			soma = soma + x;
			System.out.println(soma);
			
		} while (x < num);
	}
}
