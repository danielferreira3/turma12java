package Lista1OOP;

public class Cliente {
	public String nome;
	public String cpf;
	public int anoNascimento;
	
	public void status() {
		
		System.out.println("seu nome é " + nome);
		System.out.println("portador do CPF " + cpf);
		
	}
		public void idade() {
			
			System.out.println("Sua idade é " + (2020-this.anoNascimento) + " Anos");
			
		}
	
}
