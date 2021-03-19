package br.edu.insper.desagil.aps1;

public class Testador {
	
	private Caixa caixa = new Caixa();
	private Carrinho cart = new Carrinho();
	private Produto caderno = new Produto(1, "caderno", 20);
	private Produto caneta = new Produto(3, "caneta", 5);
	
	public boolean testeA() {
			
		double total = caixa.valorTotal(cart);
		
		if (total == 0) {
			return true;
		}
	    return false;
	}

	public boolean testeB() {
	
		cart.incrementaLista(caderno);
		
		double total = caixa.valorTotal(cart);
		
		if(total == 20) {
			return true;
		}
		
	    return false;
	}
	
	public boolean testeC() {
		
		cart.incrementaLista(caneta);

		caixa.insereDesconto(caneta, 20);
			
		double total = caixa.valorTotal(cart);
		
		if(total == 4) {
			return true;
		}
		
		
	    return false;
	}

	public boolean testeD() {
		
		cart.incrementaLista(caderno);
		cart.incrementaLista(caderno);
		cart.incrementaLista(caneta);
		
		caixa.insereDesconto(caneta, 20);
			
		double total = caixa.valorTotal(cart);
		
		if(total == 44) {
			return true;
		}
		
		
	    return false;
	}

	public boolean testeE() {
	
		cart.incrementaLista(caderno);
		cart.incrementaLista(caneta);
		cart.incrementaLista(caneta);
		
		caixa.insereDesconto(caneta, 20);
			
		double total = caixa.valorTotal(cart);
		
		if(total == 28) {
			return true;
		}
		
		
	    return false;
	}

	
}
