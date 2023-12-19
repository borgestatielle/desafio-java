package com.wakandaacademy.desafiojava.pessoa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wakandaacademy.desafiojava.pessoa.api.PessoaListResponse;
import com.wakandaacademy.desafiojava.pessoa.api.PessoaRequest;
import com.wakandaacademy.desafiojava.pessoa.api.PessoaResponse;
import com.wakandaacademy.desafiojava.pessoa.api.repository.PessoaRepository;
import com.wakandaacademy.desafiojava.pessoa.domain.Pessoa;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PessoaApplicationService implements PessoaService {
	private final PessoaRepository pessoaRepository;

	@Override
	public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
		log.info("[inicia] PessoaApplicationService - criaPessoa");
		Pessoa pessoa = pessoaRepository.salva(new Pessoa(pessoaRequest));
		log.info("[finaliza] PessoaApplicationService - criaPessoa");
		return PessoaResponse.builder()
				.idPessoa(pessoa.getIdPessoa())
				.build();
	}

	@Override
	public List<PessoaListResponse> buscaTodasPessoas() {
		log.info("[inicia] PessoaApplicationService - buscaTodasPessoas");
		log.info("[finaliza] PessoaApplicationService - buscaTodasPessoas");
		return null;
	}

}
