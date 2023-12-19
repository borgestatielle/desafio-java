package com.wakandaacademy.desafiojava.pessoa.api.repository;

import java.util.List;

import com.wakandaacademy.desafiojava.pessoa.domain.Pessoa;

public interface PessoaRepository {
	Pessoa salva(Pessoa pessoa);
	List<Pessoa> buscaTodasPessoas();

}
