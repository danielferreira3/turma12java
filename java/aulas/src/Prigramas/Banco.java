package Prigramas;

import java.util.Scanner;

import classes.ContaCorrente;
import classes.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
Scanner leia = new Scanner (System.in);
	
		char opcao;
		double valor;
		double valor2;
		int tipoDeConta ;
		int contador = 0;
		int resposta;
		
		System.out.println("Digite o tipo de conta; 1 - conta poupança, 2 - conta corrente, 3 - conta especial 4- conta empresarial");
		tipoDeConta = leia.nextInt();
		
			contador++;
		if(tipoDeConta == 3) {
		ContaEspecial ce1 = new ContaEspecial(001,1000);
		System.out.println("numero da conta "+ ce1.getNumero());
		System.out.println("Saldo da conta "+ce1.getSaldo());
		for (int x=1; x<5;x++) {
			System.out.println("voce deseja C-creditar ou D-debitar?; ");
			opcao = leia.next().toUpperCase().charAt(0);
			if(opcao =='C') {
				System.out.println("Qual o valor de credito; ");
				valor = leia.nextDouble();
				ce1.creditar(valor);
			}
			else if (opcao == 'D') {
				if (ce1.getSaldo()<=0) {
					System.out.println("Conta sem saldo: ");
					
				} else {
				System.out.println("Qual o valor para débito; ");
				valor = leia.nextDouble();
				ce1.debitar(valor);
				}
			}
			System.out.println("seu saldo é " + ce1.getSaldo());
			
			if(ce1.getSaldo()<=0) {
				System.out.println("Deseja utilizar o limite de credito especil? de " + ce1.getLimite() + "\n Didite 1- sim 2-não");
				resposta = leia.nextInt();
				if(resposta == 1 ) {
					System.out.println("Digite o valor que deseja utilizar ");
					valor = leia.nextDouble();				
					ce1.usarLimite(valor);
				}
			}
		
		}
		
		System.out.println("Voce ja atingiu o limite de movimentações ");
		
		}
	}
}
