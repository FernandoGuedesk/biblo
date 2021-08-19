package br.dev.nando.biblo.api.model;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="historico")
public class Historico {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idhistorico")
	private Long idHistorico;
	@Column 
	private OffsetDateTime dataEmprestimo;
	@Column
	private OffsetDateTime dataDevolucao;
	
	
	public long getIdHistorico() {
		return idHistorico;
	}
	public void setIdHistorico(long idHistorico) {
		this.idHistorico = idHistorico;
	}
	public OffsetDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(OffsetDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public OffsetDateTime getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(OffsetDateTime dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idHistorico ^ (idHistorico >>> 32));
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
		Historico other = (Historico) obj;
		if (idHistorico != other.idHistorico)
			return false;
		return true;
	}
	
	
}
