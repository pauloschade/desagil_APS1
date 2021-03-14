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
	
	public int totalPrice() {
		int preco = this.produto.getPreco();
		return this.quantidade * preco;
	}
	

}
