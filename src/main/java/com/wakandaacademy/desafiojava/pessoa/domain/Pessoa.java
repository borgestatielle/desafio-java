package com.wakandaacademy.desafiojava.pessoa.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.wakandaacademy.desafiojava.endereco.domain.Endereco;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idPessoa;
	@NotBlank
	private String nomeCompleto;
	@NotNull
	private LocalDate dataNascimento;
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
	private List<Endereco> enderecos;

	public Pessoa(@NotBlank String nomeCompleto, @NotNull LocalDate dataNascimento, List<Endereco> enderecos) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.enderecos = enderecos;
	}

}