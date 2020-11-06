package aulas;

import java.util.Scanner;

public class lista1_exec6 {
	

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, d;
		double r1,r2;
		double resultado;
		System.out.println ("Digite o valor de x1 ");
		x1 = leia.nextDouble();
		System.out.println ("Digite o valor de x2 ");
		x2 = leia.nextDouble();
		System.out.println ("Digite o valor de y1 ");
		y1 = leia.nextDouble();
		System.out.println ("Digite o valor de y2 ");
		y2 = leia.nextDouble();

		r1 = (x2 - x1);
		r2 = (y2 - y1);
		d = ((r1 *r1) + (r2*r2));
		resultado = Math.sqrt(d);
		System.out.println(resultado);
	}
}
