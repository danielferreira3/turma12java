package revisaoDeExercicios;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double preco = 0;
		int codigo;
		double avista = 0, cartao1, cartao2, cartao3 = 0;

		System.out.println("preço do produto: ");
		preco = leia.nextDouble();

		avista =  ((20 * preco) / 100);
		cartao1 = ((15*preco)/100);
		cartao2 = Math.floor(preco / 2);
		cartao3 = ((10*preco)/100);

		System.out.println("Codigo 0 para Valor à vista: " + (preco - avista));
		System.out.println("\nCodigo 1 para Valor à vista no cartão: " + (preco - cartao1));
		System.out.println("\nCodigo 2 para Valor parcelado em 2x: " + cartao2);
		System.out.printf("\nCodigo 3 para Valor parcelado em 3x: " + (preco  + cartao3)/3);

		System.out.println("\nDigite o codigo de pagamento: ");
		codigo = leia.nextInt();

		if (codigo == 0) {
			System.out.println("valor a ser pago é de " + (preco - avista));

		} else if (codigo == 1) {
			System.out.println("valor a ser pago é de " + (preco - cartao1));
		}
		if (codigo == 2) {
			System.out.println("valor a ser pago é de 2 x de "+cartao2);
		}
		if (codigo == 3) {
			System.out.println("valor a ser pago é 3 x de " + (preco  + cartao3) / 3);
		}

	}
}
