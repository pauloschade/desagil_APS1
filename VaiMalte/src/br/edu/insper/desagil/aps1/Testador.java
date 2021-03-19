package br.edu.insper.desagil.aps1;

public class Testador {
	
	private Caixa caixa = new Caixa();
	private Carrinho cart = new Carrinho();
	private Produto caderno = new Produto(1, "caderno", 20);
	private Produto caneta = new Produto(3, "caneta", 5);
	
	//Criando produto com o mesmo código para testar se o método
	//que impede adicionar 2 produtos com id igual mas nome diferentes funciona
	private Produto computador = new Produto(3, "computador", 500);
	
	public boolean testeA() {
			
		double total = caixa.valorTotal(cart);
		
		if (total == 0) {
			return true;
		}
	    return false;
	}

	public boolean testeB() {
	
		cart.adicionaPedido(caderno);
		
		double total = caixa.valorTotal(cart);
		
		if(total == 20) {
			return true;
		}
		
	    return false;
	}
	
	public boolean testeC() {
		
		cart.adicionaPedido(caneta);
		
		//Se o método estiver funcionando não deve ser adicionado ao caixa
		cart.adicionaPedido(computador);
		
		caixa.insereDesconto(caneta, 20);
		
		//Se já adicionou um desconto não deve adicionar mais
		caixa.insereDesconto(caneta, 50);
		
		double total = caixa.valorTotal(cart);
		
		if(total == 4) {
			return true;
		}
		
		
	    return false;
	}

	public boolean testeD() {
		
		cart.adicionaPedido(caderno);
		cart.adicionaPedido(caderno);
		cart.adicionaPedido(caneta);
		
		caixa.insereDesconto(caneta, 20);
			
		double total = caixa.valorTotal(cart);
		
		if(total == 44) {
			return true;
		}
		
		
	    return false;
	}

	public boolean testeE() {
	
		cart.adicionaPedido(caderno);
		cart.adicionaPedido(caneta);
		cart.adicionaPedido(caneta);
		
		caixa.insereDesconto(caneta, 20);
			
		double total = caixa.valorTotal(cart);
		
		if(total == 28) {
			return true;
		}
		
		
	    return false;
	}

	
}
