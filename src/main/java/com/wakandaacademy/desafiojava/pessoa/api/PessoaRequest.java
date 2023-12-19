package com.wakandaacademy.desafiojava.pessoa.api;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.wakandaacademy.desafiojava.endereco.domain.Endereco;

import lombok.Value;

@Value
public class PessoaRequest {
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private LocalDate dataNascimento;
	private List<Endereco> enderecos;

}
