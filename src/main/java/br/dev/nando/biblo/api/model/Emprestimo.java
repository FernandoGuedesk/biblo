package br.dev.nando.biblo.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emprestimo")
public class Emprestimo {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idemprestimo")
	private Long idEmprestimo;
	@Column
	private String situacao;
	@Column
	private int dt_Emprestimo;
	@Column
	private int dt_Devolucao;
	@ManyToOne
	private Bibliotecario bibliotecario;
	@ManyToOne
	private Leitor leitor;
	
	
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
	public int getDt_Emprestimo() {
		return dt_Emprestimo;
	}
	public void setDt_Emprestimo(int dt_Emprestimo) {
		this.dt_Emprestimo = dt_Emprestimo;
	}
	public int getDt_Devolucao() {
		return dt_Devolucao;
	}
	public void setDt_Devolucao(int dt_Devolucao) {
		this.dt_Devolucao = dt_Devolucao;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dt_Devolucao;
		result = prime * result + dt_Emprestimo;
		result = prime * result + (int) (idEmprestimo ^ (idEmprestimo >>> 32));
		result = prime * result + ((leitor == null) ? 0 : leitor.hashCode());
		result = prime * result + ((situacao == null) ? 0 : situacao.hashCode());
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
		if (dt_Devolucao != other.dt_Devolucao)
			return false;
		if (dt_Emprestimo != other.dt_Emprestimo)
			return false;
		if (idEmprestimo != other.idEmprestimo)
			return false;
		if (leitor == null) {
			if (other.leitor != null)
				return false;
		} else if (!leitor.equals(other.leitor))
			return false;
		if (situacao == null) {
			if (other.situacao != null)
				return false;
		} else if (!situacao.equals(other.situacao))
			return false;
		return true;
	}
	
	

}
