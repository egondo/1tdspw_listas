package br.com.fiap.baralho.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador {
	
	private List<Carta> mao;
	private int pontos;
	
	public Jogador() {
		this.mao = new ArrayList<>();
		this.pontos = 0;
	}
	
	public void recebeCarta(Carta c) {
		mao.add(c);
		if (c.getValor() >= 10)
			pontos = pontos + 10;
		else
			pontos = pontos + c.getValor();
	}

	public int getPontos() {
		return pontos;
	}
	
	public boolean querCarta() {
		for(Carta c : mao) {
			System.out.print(c);
			System.out.print(" ");
		}
		System.out.println("\nPontos " + pontos);
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Quer carta (s/n): ");
		String resp = tec.nextLine();
		if (resp.equals("s"))
			return true;
		else
			return false;
	}
}
