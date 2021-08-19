package br.dev.nando.biblo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.dev.nando.biblo.api.model.Historico;

@Repository
public interface HistoricoRepository extends JpaRepository<Historico, Long>{

}
