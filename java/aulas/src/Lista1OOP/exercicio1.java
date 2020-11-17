package Lista1OOP;

import java.util.Scanner;
import Lista1OOP.Cliente;
public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
		
		System.out.println("Digite o seu nome ");
		cliente1.nome = input.next();
		System.out.println("Digite o seu CPF ");
		cliente1.cpf = input.next();
		System.out.println("Digite o ano de nascimento ");
		cliente1.anoNascimento = input.nextInt();

		cliente1.status();
		cliente1.idade();
	}

}
