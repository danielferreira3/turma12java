package Prigramas;

import java.util.Scanner;

import classes.ContaCorrente;

public class CadConta {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		char opcao;
		double valor;
		
		ContaCorrente cc1 = new ContaCorrente(001);
		System.out.println("numero da conta "+ cc1.getNumero());
		System.out.println("Saldo da conta "+cc1.getSaldo());
		System.out.println("voce deseja C-creditar ou D-debitar?; ");
		opcao = leia.next().toUpperCase().charAt(0);
		if(opcao =='C') {
			System.out.println("Qual o valor de credito; ");
			valor = leia.nextDouble();
			cc1.creditar(valor);
		}
		else if (opcao == 'D') {
			if (cc1.getSaldo()<=0) {
				System.out.println("Conta sem saldo: ");
				
			}
			System.out.println("Qual o valor para débito; ");
			valor = leia.nextDouble();
			cc1.debitar(valor);
		}
		System.out.println("seu saldo é " + cc1.getSaldo());
	}
}
