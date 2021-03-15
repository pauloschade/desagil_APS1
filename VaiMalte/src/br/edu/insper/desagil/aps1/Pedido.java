package br.edu.insper.desagil.aps1;

public class Pedido {
	
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		super();
		this.produto = produto;
		this.quantidade = 1;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void increaseQuantidade() {
		this.quantidade += 1;
	}
	
	public double totalPrice() {
		double total;
		double preco = this.produto.getPreco();
		total = preco * this.quantidade;
		return total;
	}
	

}
