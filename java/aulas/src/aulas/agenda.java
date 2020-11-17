package aulas;

import java.util.Scanner;

public class agenda {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String agenda[][] = new String[5][31];
		int diaDoMes;
		
		
		System.out.println("Digite o dia do mes ");
		diaDoMes = leia.nextInt();
		System.out.println("Digite a tarefa");
		
		int x =0;
		for(x=0;x<5;x++) {
			
			agenda[x][diaDoMes -1] = leia.next();
			
			
		}
		
		for(x=0;x<5;x++) {
			System.out.println("Tarefas do dia "+ diaDoMes);
			System.out.println("tarefa " + (x+1) +" "+ agenda[x][diaDoMes-1]);
		}
	}
	
}
