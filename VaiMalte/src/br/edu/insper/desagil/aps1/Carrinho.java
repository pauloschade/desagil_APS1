package br.edu.insper.desagil.aps1;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Pedido> pedidos;
	
	public Carrinho() {
		super();
		this.pedidos = new ArrayList<>();
	}
	
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}
	
	public void incrementaLista(Produto produto) {
		
		for (Pedido i: pedidos ) {
			if (i.getProduto().getCodigo() == produto.getCodigo()) {
				i.increaseQuantidade();
				return;
			}
		}
		
		Pedido novoPedido = new Pedido(produto);
		pedidos.add(novoPedido);
		
	}
	
}
