package com.wakandaacademy.desafiojava.endereco.repository;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.wakandaacademy.desafiojava.pessoa.domain.Pessoa;

import lombok.Value;

@Value
public class EnderecoRequest {
	private String cep;
	private String logradouro;
	private String cidade;
	private String numero;
	private boolean principal;

	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;
}
