package com.wakandaacademy.desafiojava.pessoa.api;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/pessoa")
public interface PessoaAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	PessoaResponse postPessoa(@RequestBody PessoaRequest pessoaRequest);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<PessoaListResponse> getTodasPessoas();

	@GetMapping(value = "/{idPessoa}")
	@ResponseStatus(code = HttpStatus.OK)
	PessoaDetalhadoResponse getPessoaAtravesId(@PathVariable UUID idPessoa);
	
}
