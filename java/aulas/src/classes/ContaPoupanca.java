package classes;

public class ContaPoupanca extends conta {

	private int dataAniversario;

	public ContaPoupanca(int numero, int dataAniversario) {
		super(numero);
		this.dataAniversario = dataAniversario;
	}

	public int getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(int dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	//metodo
	public void correcao (int data) {
		double novoSaldo = 0.0;
		
		//saldo nao pode ser vazio nem negativo
		//comparo a data de aniversario com a data informada se sim roda correcao
		if(super.getSaldo()>0 && data == this.dataAniversario) 
		{
			novoSaldo =  (super.getSaldo()*0.005);
			super.creditar(novoSaldo);
			
		}
		
	}
	
}
