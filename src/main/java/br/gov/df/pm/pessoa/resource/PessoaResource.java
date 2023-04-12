package br.gov.df.pm.pessoa.resource;

import java.util.List;

import org.hibernate.annotations.Parameter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.df.pm.pessoa.model.Pessoa;
import br.gov.df.pm.pessoa.repository.PessoaRepository;
import br.gov.df.pm.pessoa.resource.request.PessoaFilterRequest;

@RestController
public class PessoaResource {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping("/pessoas")
	public List<Pessoa> pessoas() {
		
		List<Pessoa> listPessoa = pessoaRepository.findAll();
		
		return listPessoa;
	}
	
	@GetMapping("/pessoa")
	public Page<Pessoa> pessoa(@PageableDefault Pageable pageable, PessoaFilterRequest pessoaFilterRequest) {
		
		return pessoaRepository.filtrar(pessoaFilterRequest, pageable);
		
	}	
}
