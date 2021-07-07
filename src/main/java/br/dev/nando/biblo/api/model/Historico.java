package br.dev.nando.biblo.api.model;

public class Historico {
	
	private long idHistorico;
	private int dataEmprestimo;
	private int dataDevolucao;
	
	
	public long getIdHistorico() {
		return idHistorico;
	}
	public void setIdHistorico(long idHistorico) {
		this.idHistorico = idHistorico;
	}
	public int getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(int dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public int getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(int dataDevolucao) {
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
