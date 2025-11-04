package br.com.fiap.inclusao_diversidade.repository;

import br.com.fiap.inclusao_diversidade.model.RelatorioDeDiversidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatorioDeDiversidadeRepository extends JpaRepository<RelatorioDeDiversidade, Long> {
}

