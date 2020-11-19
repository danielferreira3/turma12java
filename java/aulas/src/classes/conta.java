package classes;

public class conta {
	private int numero;
	private String cpf_cnpj;
	private double saldo;
	
	//construtor
	public conta(int numero) {
		super();
		this.numero = numero;
	}
	public conta(int numero, String cpf_cnpj) {
		super();
		this.numero = numero;
		this.cpf_cnpj = cpf_cnpj;
	}
	
	
	//encapsulamento
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public double getSaldo() {
		return saldo;
	}
	public void debitar(double debito) {
		
		this.saldo = this.saldo - debito;
	}
	
	public void creditar (double credito) {
		
		this.saldo = this.saldo + credito;
	}
	
}
