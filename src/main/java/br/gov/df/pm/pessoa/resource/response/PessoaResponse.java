package br.gov.df.pm.pessoa.resource.response;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Builder;
import lombok.Data;

@Data
@Table(name = "pessoa")
public class PessoaResponse {

	public PessoaResponse() {
		// TODO Auto-generated constructor stub
	}

	private Integer id;
	
	private Integer idpolicial;
	
	private String cpf;
	
	private String nomeMae;
	
	private String nomePai;
	
	private String rg;
	
	private String cnhRegistro;
	
	private String cnhCategoria;
	
//	@Column(name = "pes_CNHDtValidade")
//	@Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern="dd/MM/yyyy")
//	private Date cnhValidade;
	
	private String policialMatricula;
	
	private String funcionarioMatricula;
	
	private Integer almanaque;
	
	private String quadroSigla;
	
	private Date policialDataAdmissao;
	
	private Date dataAtualizacao;
	
	private Date dataNascimento;
	
	private Integer quadroCodigo;
	
	private Integer quadroOrdem;
	
	private String quadroNome;
	
	private String enderecoComplemento;
	
	private String enderecoCidadeNome;
	
	private String enderecoUfeSigla;
	
	private Integer enderecoCidadeCodigo;
	
	private Integer enderecoUfeCodigo;
	
	private String enderecoCep;
	
	private String enderecoLogradouroNome;
	private String email1;
	
	private String email2;
	
	private String telefone1;
	
	private String telefone2;
	
	private String postoNome;
	
	private String postoSigla;
	
	private Integer postoOrdem;
	
	private Integer postoCodigo;
	
	private String nomeguerra;
	
	private Integer tipoPessoaCodigo;
	
	private String tipoPessoaNome;
	
	private Integer sexoCodigo;
	
	private String sexoNome;
	
	private String nome;
	
	private Date pensionistaDataInclusao;
	
	private Date pensionistaDataDesligamento;
	
	private Date pensionistaDataSuspensaoAssistenciaMedica;
	
	private String pensionistaSiape;
	
	private Integer pensionistaCodigo;
	
	private String policialSiape;
	
	private Integer dependenteParentescoCodigo;
	
	private String dependenteParentesco;
	
	private Date dependenteDataSuspensaoAssistenciaMedica;
	
	private Date dependenteDataDesligamento;
	
	private String dependenteMatricula;
	
	private String dependenteMatriculaInstituidor;
	
	private String lotacaoNome;
	
	private String lotacaoSigla;
	
	private Integer lotacaoCodigo;
	
	private Integer situacaoFuncionalCodigo;
	
	private String situacaoFuncionalNome;
	
	private Integer atividadeCodigo;
	
	private String atividadeNome;
	
	private Integer funcaoCodigo;
	
	private String funcaoNome;
	
	private Integer escalaCodigo;
	
	private String escalaNome;
	
	private Integer situacaoPolicialCodigo;
	
	private Integer porteSuspenso;
	
	private Integer ctgrafiSuspenso;
	
}