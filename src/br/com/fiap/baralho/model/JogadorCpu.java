package br.com.fiap.baralho.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogadorCpu {
	
	private List<Carta> mao;
	private int pontos;
	
	public JogadorCpu() {
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
		if (pontos < 16)
			return true;
		else
			return false;
	}
}
