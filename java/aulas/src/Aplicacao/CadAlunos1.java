package Aplicacao;

import java.util.Scanner;

import Entidades.Aluno;

public class CadAlunos1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		int matricula;
		System.out.println("Digite o seu nome ");
		nome = input.next();
		
		System.out.println("Digite a sua matricula ");
		matricula = input.nextInt();
		
		Aluno aluno1 = new Aluno(matricula,nome);
		
		
		System.out.println("Digite M - masculino F-Feminino O-outros");
		aluno1.setGenero(input.next().toUpperCase().charAt(0));
		aluno1.obterGenero();
		System.out.println(aluno1.obterGenero());
		
		System.out.println("Digite o ano de nascimento ");
		aluno1.setAnoNascimento(input.next().toUpperCase().charAt(0));
		aluno1.idade();
		System.out.println(aluno1.idade());
		
		if(aluno1.idade() > 0 && aluno1.idade() < 13) {
			
			System.out.println("voce esta no ensino fundamental ");
		} else if (aluno1.idade() >= 13 && aluno1.idade() <= 17) {
			
			System.out.println("Voce esta no ensino medio ");
		} else if (aluno1.idade() > 17 ) {
			System.out.println("Voce esta no ensino superior");
		} else
		{
			System.out.println("informou a idade errada!!!");
		}

	}

}
