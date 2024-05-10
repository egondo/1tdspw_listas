package br.com.fiap.baralho.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baralho {

	private List<Carta> monte;
	
	public Baralho() {
		this.monte = new ArrayList<>();
		for(int i = 1; i <= 13; i++) {
			Carta c = new Carta(i, "PAUS");
			this.monte.add(c);
			c = new Carta(i, "COPAS");
			this.monte.add(c);
			c = new Carta(i, "ESPADAS");
			this.monte.add(c);
			c = new Carta(i, "OUROS");
			this.monte.add(c);
		}
	}
	
	public void embaralhar() {
		Random r = new Random();
		int contagem = 0;
				
		while (contagem < 100) {
			int i = r.nextInt(52);
			int j = r.nextInt(52);
			Carta aux = monte.get(i);
			Carta aux2 = monte.get(j);
			
			monte.set(i, aux2);
			monte.set(j, aux);
			contagem++;
		}
	}
	
	public void imprime() {
		/*
		 * int i = 0; while (i < monte.size()) { System.out.print(monte.get(i)); i++; }
		 */
		for(Carta c : monte) {
			System.out.print(c);
			System.out.print(" ");
		}
	}
	
	
	
	
	
	
	
}
