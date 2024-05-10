package br.com.fiap.baralho.model;

public class Jogo21 {
	
	public static void main(String[] args) {
		
		Baralho bar = new Baralho();
		Jogador humano = new Jogador();
		JogadorCpu cpu = new JogadorCpu();
		
		bar.embaralhar();
		
		Carta c = bar.comprar();
		humano.recebeCarta(c);
		humano.recebeCarta(bar.comprar());
		
		cpu.recebeCarta(bar.comprar());
		cpu.recebeCarta(bar.comprar());
		
		while (humano.querCarta()) {
			humano.recebeCarta(bar.comprar());
		}
		
		while (cpu.querCarta()) {
			cpu.recebeCarta(bar.comprar());
		}
		
		System.out.println("HUMANO " + humano.getPontos());
		System.out.println("CPU " + cpu.getPontos());
		
	}

}
