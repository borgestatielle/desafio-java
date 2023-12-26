package com.wakandaacademy.desafiojava.pessoa.api;

import java.util.UUID;

import com.wakandaacademy.desafiojava.pessoa.domain.Pessoa;

import lombok.Value;

@Value
public class PessoaDetalhadoResponse {

	private UUID idPessoa;
	private String nomeCompleto;

	public PessoaDetalhadoResponse(Pessoa pessoa) {
		this.idPessoa = pessoa.getIdPessoa();
		this.nomeCompleto = pessoa.getNomeCompleto();
	}
}

