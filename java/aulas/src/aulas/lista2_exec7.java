package aulas;

import java.util.Scanner;

public class lista2_exec7 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double base;
		double altura;
		double area;
		System.out.println("digite a base do triangulo ");
		base = leia.nextDouble();
		System.out.println("digite a altura do triangulo ");
		altura = leia.nextDouble();
		area = ((base * altura) / 2);

		if (base > 0 && altura > 0)
		{
			System.out.println ("a area do seu triangulo é " + area );
		}
		else
		{
			System.out.println("area e altura invalido");
		}
	}
}
