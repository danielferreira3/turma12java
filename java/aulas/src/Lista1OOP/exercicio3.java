package Lista1OOP;

import java.util.Scanner;
import Lista1OOP.Eletronico;
public class exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Eletronico celular = new Eletronico();
		
		celular.tipo = "Celular";
		celular.marca = "motorola";
		celular.modelo = "motoG5";
		celular.status();
		
	}
}
