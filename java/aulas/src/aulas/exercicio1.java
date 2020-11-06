package aulas;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		
		
		double temperatura = 0.0;
		double fahrenheit =  0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("qual a temperatura em celsius? ");
		temperatura = leia.nextDouble();
		fahrenheit = ((temperatura * 9)/5) + 32;
		
		System.out.println(fahrenheit + " graus em fahrenheit");
	}
}
