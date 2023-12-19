package com.wakandaacademy.desafiojava.pessoa.service;

import java.util.List;

import com.wakandaacademy.desafiojava.pessoa.api.PessoaListResponse;
import com.wakandaacademy.desafiojava.pessoa.api.PessoaRequest;
import com.wakandaacademy.desafiojava.pessoa.api.PessoaResponse;

public interface PessoaService {
	PessoaResponse criaPessoa(PessoaRequest pessoaRequest);

	List<PessoaListResponse> buscaTodasPessoas();

}
