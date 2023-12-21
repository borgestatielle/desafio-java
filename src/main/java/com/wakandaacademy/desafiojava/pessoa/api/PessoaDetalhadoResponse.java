package com.wakandaacademy.desafiojava.pessoa.api;

import java.util.UUID;

import lombok.Value;

@Value
public class PessoaDetalhadoResponse {
	private UUID idPessoa;
	private String nomeCompleto;
}
