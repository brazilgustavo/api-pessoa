package br.gov.df.pm.pessoa.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.df.pm.pessoa.model.Pessoa;
import br.gov.df.pm.pessoa.resource.request.PessoaFilterRequest;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	@Query("    select p "
			+ " from Pessoa p " 
			+ " where "
			+ "      (:#{#filter?.nome} is null or :#{#filter?.nome} ='' or p.nome like %:#{#filter.nome}% ) "
			+ "    and (:#{#filter?.cpf} is null or :#{#filter?.cpf} ='' or p.cpf = :#{#filter.cpf}  )  "
			+ "    and (:#{#filter?.id} is null or p.id = :#{#filter.id}  )  "
			+ " order by p.nome asc  "
			)
	Page<Pessoa> filtrar( 
			PessoaFilterRequest filter,
			Pageable pageable);
}
