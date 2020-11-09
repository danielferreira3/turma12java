package aulas;

import java.util.Scanner;

public class lista2_exec2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigoDeOperario;
		int horasTrabalhadas;
		double valorPorHora = 10.00;
		double excesso;

		System.out.println("Digite seu codigo de operario ");
		codigoDeOperario = leia.nextInt();
		System.out.println("Quantas horas trabalhadas? ");
		horasTrabalhadas = leia.nextInt();
		
		if (horasTrabalhadas > 50){ 
		 excesso = (horasTrabalhadas % 50)*20.00;
		 System.out.println("Valor de horas extra é " + excesso + " Reais\n");
		 System.out.println("seu salario com horas extra é " + ((horasTrabalhadas * valorPorHora) + excesso) + " Reais" );
		}
		else
		{
		System.out.println("Voce não teve horas extras esse mes seu salario é " + (valorPorHora * horasTrabalhadas) + " Reais" );	
		}
	}
}
