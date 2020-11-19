package classes;

public class ContaEmpresa extends conta {

	private double emprestimo;

	public ContaEmpresa(int numero, String cpf_cnpj) {
		super(numero, cpf_cnpj);
		
	}

	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	//metodos
	public void pedirEmprestimo(double valorEmprestimo) {
		//saldo pode ser zero e negativo
		//valor do emprestima não pode ser maior que o valor emprestimo
		if (valorEmprestimo <= this.emprestimo) 
		{
			super.creditar(valorEmprestimo);
			this.emprestimo -= valorEmprestimo;
		}
	}
	
}
