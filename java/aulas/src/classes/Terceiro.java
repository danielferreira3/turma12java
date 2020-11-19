package classes;



public class Terceiro extends Funcionario {

	private double adicional;
		
		
	public Terceiro() {
		super();
	}

	
	
	public Terceiro(String codigo, double horas, double valorHoras, double adicional) {
		super(codigo, horas, valorHoras);
		this.adicional = adicional;
	}



	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	@Override
	public double pagamentoSalario() {
		
		return (this.valorHoras * this.horas) + this.adicional;
	}
	
	
}
