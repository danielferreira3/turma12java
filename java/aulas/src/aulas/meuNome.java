package aulas;

import java.util.Scanner;

public class meuNome {
	
	public static void main(String[] args) {
		
		//instaciando o teclado
		Scanner leia = new Scanner(System.in);
		String nome;
		int anoNascimento = 1997;
		int idade = 0;	
		
		System.out.println("Digite seu nome");
		nome = leia.nextLine();
		System.out.println("Digite a sua idade");
		idade = leia.nextInt();
		//frase de saida
		System.out.println("nome �: " + nome );
		
		idade = 2020 - anoNascimento;
		System.out.println("idade � " + idade + " Anos");
		
		System.out.printf("seu nome � %s, idade %d,Anos",nome,idade);
	}

}
