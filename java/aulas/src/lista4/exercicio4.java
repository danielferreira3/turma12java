package lista4;

import java.util.Scanner;

/*
 * 4 Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 * ou seja, diagonal principal.
 */
public class exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valores [][] = new int [3][3];
		int x=0,y=0,somaDiagonal=0;
		
		for (x=0; x<3; x++) {
			
			for(y=0; y<3; y++) {
				
				System.out.println("informe os valore ");
				valores[x][y] = leia.nextInt();
				if (x==y)
				{
					somaDiagonal = somaDiagonal + valores[x][y];
				}
			}
			
			
		}
			for (x=0; x<3; x++) {
			
				for(y=0; y<3; y++) {
				
				System.out.print(valores[x][y]);
				System.out.print(" ");
			}
			System.out.println();
			
		}
			System.out.println("a soma da diagonal é " + somaDiagonal);
	}
}
