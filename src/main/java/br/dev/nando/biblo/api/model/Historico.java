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
	@Column(name = "id_historico")
	private Long idHistorico;
	@Column(name = "dt_emprestimo")
	private OffsetDateTime dataEmprestimo;
	@Column(name = "dt_devolucao")
	private OffsetDateTime dataDevolucao;
	@Column(name = "id_leitor")
	private Long idLeitor;
	@Column(name = "id_bibliotecario")
	private Long idBibliotecario;
	@Column(name = "id_livro") 
	private Long idLivro;
	
	
	public Long getIdHistorico() {
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
	public Long getIdLeitor() {
		return idLeitor;
	}
	public void setIdLeitor(Long idLeitor) {
		this.idLeitor = idLeitor;
	}
	public Long getIdBibliotecario() {
		return idBibliotecario;
	}
	public void setIdBibliotecario(Long idBibliotecario) {
		this.idBibliotecario = idBibliotecario;
	}
	public Long getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
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
