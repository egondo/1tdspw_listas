package br.com.fiap.baralho.model;

public class Teste {
	
	public static void main(String[] args) {
		Baralho bar = new Baralho();
		//bar.imprime();
		bar.embaralhar();
		//bar.imprime();
		
		Carta c = bar.comprar();
		while (c != null) {
			System.out.println(c);
			c = bar.comprar();
		}
	}

}
