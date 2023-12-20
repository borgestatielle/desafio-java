package com.wakandaacademy.desafiojava.pessoa.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.wakandaacademy.desafiojava.pessoa.domain.Pessoa;

import lombok.Value;

@Value
public class PessoaListResponse {
	private UUID idPessoa;
	private String nomeCompleto;

	public static List<PessoaListResponse> converte(List<Pessoa> pessoas) {
		return pessoas.stream()
				.map(PessoaListResponse::new)
				.collect(Collectors.toList());
	}

	private PessoaListResponse(Pessoa pessoa) {
		this.idPessoa = pessoa.getIdPessoa();
		this.nomeCompleto = pessoa.getNomeCompleto();
	}
	
}
