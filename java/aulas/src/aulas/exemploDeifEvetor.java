package aulas;

import java.util.Scanner;
public class exemploDeifEvetor
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		String nomeUsuario; // muitos caracters
		char sexoUsuario; //sempre 1 caracter
		int anoNascimentoUsuario,idadeUsuario;
		
		// a titulo de pesquisa - como se declarar vetor
	//	String nomes[] = new String[10]; // vetor vazio
	//	String produtos[] = {"Camisa", "Cal�a","Blusa"}; //vetor com os dados
	//	int precos[] = new int[3];
		// N�O SERVE PRA NADA NESTE CODIGO
		
		
		
		System.out.print("Digite o nome do usu�rio[a]:");
		nomeUsuario = teclado.next().toUpperCase();
		System.out.print("Digite F-feminino ou M-masculuno ou O-outros:");
		sexoUsuario = teclado.next().toUpperCase().charAt(0); //tem que converter usando o charAt(0)
		System.out.print("Ano de nascimento: ");
		anoNascimentoUsuario = teclado.nextInt();
		
		idadeUsuario = 2020 - anoNascimentoUsuario;
		
		if (sexoUsuario=='M')  // && e, || ou
		{
			System.out.printf("Oi meu amigo %s, sua idade � %d anos!!!", nomeUsuario, idadeUsuario );
		}
		else if (sexoUsuario=='F')
		{
			System.out.printf("Oi minha amiga %s, sua idade � %d anos!!!", nomeUsuario, idadeUsuario );
		}
		else if (sexoUsuario=='O')
		{
			System.out.printf("Oi amigx %s, sua idade � %d anos!!!", nomeUsuario, idadeUsuario );
		}
		else
		{
			System.out.printf("Oi %s, vc n�o informou genero. bye!!!", nomeUsuario);
		}
	}
}