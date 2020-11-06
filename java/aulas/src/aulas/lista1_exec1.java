package aulas;

import java.util.Scanner;

public class lista1_exec1 {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		
	int dia;
	int mes;
	int ano;
	//Ano,mes e dias atual
	int anoAtual;
	int diasAtual;
	int mesAtual;
	int formola1;
	int formola2;
	int formola3;
	int resultado;
	
	System.out.print("escreva o dia em que voce nasceu? ");
	dia = leia.nextInt();
	System.out.print("escreva o mes em que voce nasceu? ");
	mes = leia.nextInt();
	System.out.print("escreva o ano em que voce nasceu? ");
	ano = leia.nextInt();
	System.out.print("escreva o dia atual ");
	diasAtual = leia.nextInt();
	System.out.print("mes atual ");
	mesAtual = leia.nextInt();
	System.out.print("ano atual ");
	anoAtual = leia.nextInt();
	
	formola1 = (anoAtual - ano) * 365;
	formola2 =  diasAtual - dia;
	formola3 = (mesAtual - mes) * 30 ;
	resultado = formola1 + formola2 + formola3;
	System.out.println("Voce tem " + resultado + " dias de vida");
	
	}
}
