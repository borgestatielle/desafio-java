package com.wakandaacademy.desafiojava.pessoa.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import com.wakandaacademy.desafiojava.endereco.domain.Endereco;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pessoa {
	@Id
    private UUID idPessoa;
	@NotBlank
    private String nomeCompleto;
	@NotNull
    private LocalDate dataNascimento;
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Endereco> enderecos;
	
    public Pessoa(@NotBlank String nomeCompleto, @NotNull LocalDate dataNascimento,
			List<Endereco> enderecos) {
    	this.idPessoa = UUID.randomUUID();
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.enderecos = enderecos;
	}
    
    
}