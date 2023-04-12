package br.gov.df.pm.pessoa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "pes_Codigo", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "pol_Codigo")
	private Integer idpolicial;
	
	@Column(name = "pes_CPF")
	private String cpf;
	
	@Column(name = "pes_NomeMae")
	private String nomeMae;
	
	@Column(name = "pes_NomePai")
	private String nomePai;
	
	@Column(name = "pes_RG")
	private String rg;
	
	@Column(name = "pes_CNHRegistro")
	private String cnhRegistro;
	
	@Column(name = "cnh_Categoria")
	private String cnhCategoria;
	
//	@Column(name = "pes_CNHDtValidade")
//	@Temporal(TemporalType.DATE)
//    @DateTimeFormat(pattern="dd/MM/yyyy")
//	private Date cnhValidade;
	
	@Column(name = "pol_Matricula")
	private String policialMatricula;
	
	@Column(name = "fuc_Matricula")
	private String funcionarioMatricula;
	
	@Column(name = "pol_Almanaque")
	private Integer almanaque;
	
	@Column(name = "qua_Sigla")
	private String quadroSigla;
	
	@Column(name = "pol_DtAdmissao")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="dd/MM/yyyy")
	private Date policialDataAdmissao;
	
	@Column(name = "pes_DtAtualizacao")
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dataAtualizacao;
	
	@Column(name = "pes_DtNascimento")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dataNascimento;
	
	@Column(name = "qua_Codigo")
	private Integer quadroCodigo;
	
	@Column(name = "qua_Ordem")
	private Integer quadroOrdem;
	
	@Column(name = "qua_Nome")
	private String quadroNome;
	
	@Column(name = "end_Complemento")
	private String enderecoComplemento;
	
	@Column(name = "cid_Nome")
	private String enderecoCidadeNome;
	
	@Column(name = "ufe_Sigla")
	private String enderecoUfeSigla;
	
	@Column(name = "cid_Codigo")
	private Integer enderecoCidadeCodigo;
	
	@Column(name = "ufe_Codigo")
	private Integer enderecoUfeCodigo;
	
	@Column(name = "log_CEP")
	private String enderecoCep;
	
	@Column(name = "log_Nome")
	private String enderecoLogradouroNome;
	
	@Column(name = "email1")
	private String email1;
	
	@Column(name = "email2")
	private String email2;
	
	@Column(name = "telefone1")
	private String telefone1;
	
	@Column(name = "telefone2")
	private String telefone2;
	
	@Column(name = "pgr_Nome")
	private String postoNome;
	
	@Column(name = "pgr_Sigla")
	private String postoSigla;
	
	@Column(name = "pgr_Ordem")
	private Integer postoOrdem;
	
	@Column(name = "pgr_Codigo")
	private Integer postoCodigo;
	
	@Column(name = "pol_NomeGuerra")
	private String nomeguerra;
	
	@Column(name = "tps_Codigo")
	private Integer tipoPessoaCodigo;
	
	@Column(name = "tps_Nome")
	private String tipoPessoaNome;
	
	@Column(name = "sex_Codigo")
	private Integer sexoCodigo;
	
	@Column(name = "sex_Nome")
	private String sexoNome;
	
	@Column(name = "pes_Nome")
	private String nome;
	
	@Column(name = "pen_DtInclusao")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="dd/MM/yyyy")
	private Date pensionistaDataInclusao;
	
	@Column(name = "pen_DtDesligamento")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="dd/MM/yyyy")
	private Date pensionistaDataDesligamento;
	
	@Column(name = "pen_DtSuspensaoAM")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="dd/MM/yyyy")
	private Date pensionistaDataSuspensaoAssistenciaMedica;
	
	@Column(name = "pen_Siape")
	private String pensionistaSiape;
	
	@Column(name = "pen_Codigo")
	private Integer pensionistaCodigo;
	
	@Column(name = "pol_MatriculaSiape")
	private String policialSiape;
	
	@Column(name = "par_Codigo")
	private Integer dependenteParentescoCodigo;
	
	@Column(name = "par_Nome")
	private String dependenteParentesco;
	
	@Column(name = "dep_DtSuspensaoAM")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dependenteDataSuspensaoAssistenciaMedica;
	
	@Column(name = "dep_DtDesligamento")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dependenteDataDesligamento;
	
	@Column(name = "dep_Matricula")
	private String dependenteMatricula;
	
	@Column(name = "matricula_instituidor")
	private String dependenteMatriculaInstituidor;
	
	@Column(name = "upm_Nome")
	private String lotacaoNome;
	
	@Column(name = "upm_Sigla")
	private String lotacaoSigla;
	
	@Column(name = "upm_Codigo")
	private Integer lotacaoCodigo;
	
	@Column(name = "sif_Codigo")
	private Integer situacaoFuncionalCodigo;
	
	@Column(name = "sif_Nome")
	private String situacaoFuncionalNome;
	
	@Column(name = "atv_Codigo")
	private Integer atividadeCodigo;
	
	@Column(name = "atv_Nome")
	private String atividadeNome;
	
	@Column(name = "fun_Codigo")
	private Integer funcaoCodigo;
	
	@Column(name = "fun_Nome")
	private String funcaoNome;
	
	@Column(name = "ree_Codigo")
	private Integer escalaCodigo;
	
	@Column(name = "ree_Nome")
	private String escalaNome;
	
	@Column(name = "sip_Codigo")
	private Integer situacaoPolicialCodigo;
	
	@Column(name = "suspensaoPorte")
	private Integer porteSuspenso;
	
	@Column(name = "suspensaoCtgraf")
	private Integer ctgrafiSuspenso;
	
}