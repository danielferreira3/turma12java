package aulas;

import java.util.Scanner;

public class lista2_exec1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//50 kilos
				//multa de 4,00 reais
				int pesoDeTomate;
				double exesso;
				double valorDaMulta = 4.00;
				int pesoMaximo = 50;
			
				System.out.println("informe o peso? ");
				pesoDeTomate = leia.nextInt();
			if (pesoDeTomate > 50){
				exesso = (pesoDeTomate % pesoMaximo);	
					
			System.out.println ("Voce excedeu o limite maximo do peso\n");
			System.out.println ("ultrapassando " + exesso + " Kg a mais e levou uma multa de " + valorDaMulta + " Reais" );
					
			} else {
				System.out.println ("Parabéns voce não ultrapssou o limite de peso");
		}
	}
}
