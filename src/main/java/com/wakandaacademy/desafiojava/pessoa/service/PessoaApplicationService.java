package com.wakandaacademy.desafiojava.pessoa.service;

import org.springframework.stereotype.Service;

import com.wakandaacademy.desafiojava.pessoa.api.PessoaRequest;
import com.wakandaacademy.desafiojava.pessoa.api.PessoaResponse;
import com.wakandaacademy.desafiojava.pessoa.domain.Pessoa;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PessoaApplicationService implements PessoaService {

	@Override
	public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaApplicationService - criaPessoa");
		Pessoa pessoa = pessoaRepository.salva(new Pessoa(pessoaRequest));
		log.info("[finaliza] PessoaApplicationService - criaPessoa");
		return null;
	}

}
