package br.com.shoppingdosbichos.lojinhapet.entity;

import lombok.Getter;

@Getter
public class Cliente {
	
	private String nomeCompleto;
	private String telefone;
	private String cpf;
	
	public Cliente(String nomeCompleto, String telefone, String cpf) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	
}
