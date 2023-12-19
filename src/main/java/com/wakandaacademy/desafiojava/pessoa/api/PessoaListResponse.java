package com.wakandaacademy.desafiojava.pessoa.api;

import java.util.List;
import java.util.UUID;

import com.wakandaacademy.desafiojava.pessoa.domain.Pessoa;

public class PessoaListResponse {
	private UUID idPessoa;
	private String nomeCompleto;

	public static List<PessoaListResponse> converte(List<Pessoa> pessoas) {
		return null;
	}
}
