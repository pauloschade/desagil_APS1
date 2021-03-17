package br.edu.insper.desagil.aps1;

public class Testador {
	public boolean testeA() {
		//cria carrinho
		Carrinho cart = new Carrinho();
		//cria caixa
		Caixa caixa = new Caixa();
		//valor total
		double total = caixa.valorTotal(cart);
		
		//valor tem que ser igual a zero
		if (total == 0) {
			return true;
		}
	    return false;
	}

	public boolean testeB() {
		//cria carrinho
		Carrinho cart = new Carrinho();
		
		//Cria e adiciona produto ao carrinho
		Produto produto_caderno = new Produto(1, "caderno", 20);
		cart.incrementaLista(produto_caderno);
		
		//cria caixa
		Caixa caixa = new Caixa();
		double total = caixa.valorTotal(cart);
		
		//total tem que ser igual a 7
		if(total == 20) {
			return true;
		}
		
		
	    return false;
	}
	
	public boolean testeC() {
		//cria carrinho
		Carrinho cart = new Carrinho();
		
		//Cria e adiciona produtos ao carrinho
		Produto produto_caneta = new Produto(3, "caneta", 5);
		//adiciona caneta
		cart.incrementaLista(produto_caneta);

		//cria caixa
		Caixa caixa = new Caixa();
		
		//desconto de 20% para canetas
		caixa.insereItem(produto_caneta, 20);
			
		double total = caixa.valorTotal(cart);
		
		// 0.8 * 5 = 4
		if(total == 4) {
			return true;
		}
		
		
	    return false;
	}

	public boolean testeD() {
		//cria carrinho
		Carrinho cart = new Carrinho();
		
		//Cria e adiciona produtos ao carrinho
		Produto produto_caderno = new Produto(1, "caderno", 20);
		Produto produto_caneta = new Produto(3, "caneta", 5);
		//adiciona papel
		cart.incrementaLista(produto_caderno);
		//aumenta quantidade de caderno
		cart.incrementaLista(produto_caderno);
		//adiciona caneta
		cart.incrementaLista(produto_caneta);
		//aumenta a quantidade de canetas
		cart.incrementaLista(produto_caneta);

		//cria caixa
		Caixa caixa = new Caixa();
		
		//desconto de 20% para canetas
		caixa.insereItem(produto_caneta, 20);
			
		double total = caixa.valorTotal(cart);
		
		// (20 + 20) de caderno + 0.8(5+5) caneta = 48
		if(total == 48) {
			return true;
		}
		
		
	    return false;
	}

	public boolean testeE() {
		//cria carrinho
		Carrinho cart = new Carrinho();
		
		//Cria e adiciona produtos ao carrinho
		Produto produto_caderno = new Produto(1, "caderno", 20);
		Produto produto_caneta = new Produto(3, "caneta", 5);
		//adiciona papel
		cart.incrementaLista(produto_caderno);
		//adiciona caneta
		cart.incrementaLista(produto_caneta);
		//aumenta a quantidade de canetas
		cart.incrementaLista(produto_caneta);

		//cria caixa
		Caixa caixa = new Caixa();
		
		//desconto de 20% para canetas
		caixa.insereItem(produto_caneta, 20);
			
		double total = caixa.valorTotal(cart);
		
		// 20 de caderno + 0.8(5+5) caneta = 28
		if(total == 28) {
			return true;
		}
		
		
	    return false;
	}

	
}
