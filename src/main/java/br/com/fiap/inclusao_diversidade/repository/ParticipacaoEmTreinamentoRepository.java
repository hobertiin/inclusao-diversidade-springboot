package br.com.fiap.inclusao_diversidade.repository;

import br.com.fiap.inclusao_diversidade.model.ParticipacaoEmTreinamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipacaoEmTreinamentoRepository extends JpaRepository<ParticipacaoEmTreinamento, Long> {
}
