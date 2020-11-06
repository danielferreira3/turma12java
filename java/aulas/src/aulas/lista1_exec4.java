package aulas;

import java.util.Scanner;

public class lista1_exec4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		
		System.out.println("Valor de A? ");
		a = leia.nextInt();
		System.out.println("Valor de B? ");
		b = leia.nextInt();
		System.out.println("Valor de C? ");
		c = leia.nextInt();
		int R = (a + b);
		int S = (b + c);
		R = R * R;
		S = S * S;
		double D = R + S;
		D = D / 2;
		
		System.out.println("o valor de D é " + D);
	}
}
