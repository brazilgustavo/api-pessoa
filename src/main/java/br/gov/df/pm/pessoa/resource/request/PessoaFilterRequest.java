package br.gov.df.pm.pessoa.resource.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PessoaFilterRequest {

	private Integer id;
	
	private String nome;
	
	private String cpf;
}
