package br.edu.insper.desagil.aps1;

import java.util.*;

public class Caixa {
	private Map<Integer, Integer> descontos;
	
	public Caixa() {
		super();
		this.descontos = new HashMap<>();
	}
	
	public void insereItem(Produto produto, int desconto) {
		if(desconto>=1 && desconto<=99) {
			this.descontos.put(produto.getCodigo(), desconto);
			return;
		}
		return;
	}
	
	public double valorTotal(Carrinho carrinho) {
		double total = 0;
		for (Pedido i: carrinho.getPedidos()) {
			
			int codigo = i.getProduto().getCodigo();
			
			if (descontos.containsKey(codigo)){
				total += i.totalPrice() * (1 - (descontos.get(codigo)));
			} else {
				total += i.totalPrice();
			}
		}
		
		return total;
		
	}
	
	
}
