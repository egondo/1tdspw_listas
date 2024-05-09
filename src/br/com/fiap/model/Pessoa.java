package br.com.fiap.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private String nome;
	
	private String celular;
	
	private LocalDate nascimento;
	
	private List<Endereco> enderecos;

	
	public void addEndereco(Endereco end) {
		if (this.enderecos == null) {
			this.enderecos = new ArrayList<>();
		}
		this.enderecos.add(end);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
}
