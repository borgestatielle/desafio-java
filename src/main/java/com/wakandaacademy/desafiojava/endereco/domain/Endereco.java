package com.wakandaacademy.desafiojava.endereco.domain;

import com.wakandaacademy.desafiojava.pessoa.domain.Pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Endereco {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String logradouro;
	    private String cep;
	    private String numero;
	    private String cidade;
	    @ManyToOne
	    @JoinColumn(name = "pessoa_id")
	    private Pessoa pessoa;
	    private boolean principal;
}
