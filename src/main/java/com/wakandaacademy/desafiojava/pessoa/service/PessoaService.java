package com.wakandaacademy.desafiojava.pessoa.service;

import com.wakandaacademy.desafiojava.pessoa.api.PessoaRequest;
import com.wakandaacademy.desafiojava.pessoa.api.PessoaResponse;

public interface PessoaService {
	PessoaResponse criaPessoa(PessoaRequest pessoaRequest);

}
