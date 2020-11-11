package lista3;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int filhos = 0;
		double salario;
		double mediaSalario = 0.0;
		double mediaFilhos = 0.0;
		double maiorSalario = 0.0;
		double menor100 = 0.0;
		int quantidade ;

		System.out.println("Quantitade de pessoas ");
		quantidade = leia.nextInt();

		for (int x=1; x <=quantidade; x++)
			{
				 System.out.println("digite seu salario ");
				 salario = leia.nextDouble();
				 
				 mediaSalario = mediaSalario + salario;
				 if (salario < 100)
				 {
					menor100	= menor100+1;		 	
				 }
				 System.out.println("Quantidade de filhos; ");
				 filhos = leia.nextInt();

				 mediaFilhos = mediaFilhos + filhos;
					 
				 if (maiorSalario < salario)
					 {
					 	maiorSalario = salario;
					 }
					
				}
				menor100 = ((menor100 * 100) / quantidade);
				mediaSalario = mediaSalario / quantidade;
				mediaFilhos = mediaFilhos / quantidade;
				System.out.println("\n"+"media de salario "+ mediaSalario +"\n");
				System.out.println("\n"+"media de filhos é; "+ mediaFilhos+"\n");
				System.out.println("\n"+"o maior salario é; "+ maiorSalario+"\n");
				System.out.println("percentual de pessoas com salário até R$100,00 é "+ menor100 + " %");
	}
}
