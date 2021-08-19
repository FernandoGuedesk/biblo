package br.dev.nando.biblo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.dev.nando.biblo.api.model.Leitor;

@Repository
public interface LeitorRepository extends JpaRepository<Leitor, Long>{


}
