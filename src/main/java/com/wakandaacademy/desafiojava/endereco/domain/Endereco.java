package com.wakandaacademy.desafiojava.endereco.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.wakandaacademy.desafiojava.endereco.repository.EnderecoRequest;
import com.wakandaacademy.desafiojava.pessoa.domain.Pessoa;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "endereco")
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idEndereco;
	private String cep;
	private String logradouro;
	private String cidade;
	private String numero;

	@Setter
	private boolean principal;

	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;

	public Endereco(EnderecoRequest enderecoRequestRequest, boolean principal) {
		this.logradouro = enderecoRequestRequest.getLogradouro();
		this.cidade = enderecoRequestRequest.getCidade();
		this.numero = enderecoRequestRequest.getNumero();
		this.principal = principal;
	}

	public Endereco(EnderecoRequest enderecoRequestRequest) {
		this.logradouro = enderecoRequestRequest.getLogradouro();
		this.cidade = enderecoRequestRequest.getCidade();
		this.numero = enderecoRequestRequest.getNumero();
	}
}