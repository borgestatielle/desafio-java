package com.wakandaacademy.desafiojava.pessoa.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wakandaacademy.desafiojava.pessoa.domain.Pessoa;

public interface PessoaSpringDataJPARepository extends JpaRepository<Pessoa, UUID> {

}
