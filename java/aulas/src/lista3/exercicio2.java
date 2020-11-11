package lista3;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x = 0;
		int valor;
		System.out.println("digite um valor");
		valor = leia.nextInt();
		
		while (x < 100)
		{
			x = x +1;
		
			System.out.println("\n"+valor);
			valor = valor * 3;
			if (valor == 135)
			{
				System.out.println("\n" + valor);
				break;
			} 
			
		}
	}
}