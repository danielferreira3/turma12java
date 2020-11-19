package classes;

public class Funcionario {
	private String codigo;
	protected double horas;
	protected double valorHoras;
	
	

	public Funcionario() {
		super();
	}
	
	

	public Funcionario(String codigo, double horas, double valorHoras) {
		super();
		this.codigo = codigo;
		this.horas = horas;
		this.valorHoras = valorHoras;
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}	
	
		public double pagamentoSalario() {
			
			return (this.valorHoras * this.horas);
		}
	
			
	
	
	}
	