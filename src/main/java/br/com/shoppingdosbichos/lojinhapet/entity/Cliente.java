package br.com.shoppingdosbichos.lojinhapet.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {
	
	private String nomeCompleto;
	private String telefone;
	private String cpf;
	
	private Cliente(String nomeCompleto, String telefone, String cpf) {
		
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	
}
