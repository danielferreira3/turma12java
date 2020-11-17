package Entidades;

public class Produto {
	public String nomeProduto;
	public int peso;
	public int quantidade;
	public String valorProdutoUn;
	
	public Produto() {
		
	}
	
	public Produto (String nomeProduto,int peso,int quantidade, String valorProdutoUn) {
		this.nomeProduto = nomeProduto;
		this.peso = peso;
		this.quantidade = quantidade;
		this.valorProdutoUn = valorProdutoUn;
		
	}
	
}