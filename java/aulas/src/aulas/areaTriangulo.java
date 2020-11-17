package aulas;

import java.util.Scanner;

public class areaTriangulo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//calcule a area de um triangulo
		
		double base1;
		double altura1;
		double base2;
		double altura2;
		double area1;
		double area2;
		
		System.out.println("Digite a altura do primeiro triangulo ");
		altura1 = leia.nextDouble();
		System.out.println("Digite a base do primeiro triangulo ");
		base1 = leia.nextDouble();
		System.out.println("Digite a altura do segundo triangulo ");
		altura2 = leia.nextDouble();
		System.out.println("Digite a base do segundo triangulo ");
		base2 = leia.nextDouble();
		area1 = ((base1 * altura1) /2);
		area2 = ((base2 * altura2 ) / 2);
		
		System.out.println("1° triangulo ");
		System.out.println("Base 1° triangulo é: " + base1);
		System.out.println("altura 1° triangulo é: " + altura1);
		System.out.println("area 1° triangulo é: " + area1);
		
		System.out.println("2° triangulo ");
		System.out.println("Base 1° triangulo é: " + base2);
		System.out.println("altura 1° triangulo é: " + altura2);
		System.out.println("area 1° triangulo é: " + area2);
		
		if (area1 > 0 || area2 > 0) 
		{
			System.out.println("a area do 1° triangulo é " + area1);
			System.out.println("a area do 2° triangulo é " + area2);
			
			if(area1> area2) 
			{
				System.out.println("a maior area é a do 1° triangulo com area de " + area1);
			} else 
			{
				System.out.println("a maior area é a do 2° triangulo com area de " + area2);
			}
		} else 
		{
			System.out.println("Numero digitado invalido!!");
		}
	}
}
