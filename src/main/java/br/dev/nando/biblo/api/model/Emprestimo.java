package br.dev.nando.biblo.api.model;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emprestimo")
public class Emprestimo {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_emprestimo")
	private Long idEmprestimo;
	@Column
	private String situacao;
	@Column(name = "dt_emprestimo")
	private OffsetDateTime dataEmprestimo;
	@Column(name = "dt_devolucao")
	private OffsetDateTime dataDevolucao;
	@ManyToOne
	private Bibliotecario bibliotecario;
	@ManyToOne
	private Leitor leitor;
	@OneToOne
	private Livro livro;
	
	
	public long getIdEmprestimo() {
		return idEmprestimo;
		
	}
	public void setIdEmprestimo(long idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public OffsetDateTime getDt_Emprestimo() {
		return dataEmprestimo;
	}
	public void setDt_Emprestimo(OffsetDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public OffsetDateTime getDt_Devolucao() {
		return dataDevolucao;
	}
	public void setDt_Devolucao(OffsetDateTime dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}
	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}
	public Leitor getLeitor() {
		return leitor;
	}
	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}
	public Livro getlivro() {
		return livro;
	}
	public void setlivro(Livro livro) {
		this.livro = livro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEmprestimo == null) ? 0 : idEmprestimo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprestimo other = (Emprestimo) obj;
		if (idEmprestimo == null) {
			if (other.idEmprestimo != null)
				return false;
		} else if (!idEmprestimo.equals(other.idEmprestimo))
			return false;
		return true;
	}
	
	
	

}
