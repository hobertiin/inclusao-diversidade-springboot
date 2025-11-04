package br.com.fiap.inclusao_diversidade.repository;

import br.com.fiap.inclusao_diversidade.model.Treinamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinamentoRepository extends JpaRepository< Treinamento, Long > {
}
