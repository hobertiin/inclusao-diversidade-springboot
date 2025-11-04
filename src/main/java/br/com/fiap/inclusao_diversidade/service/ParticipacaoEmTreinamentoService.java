package br.com.fiap.inclusao_diversidade.service;

import br.com.fiap.inclusao_diversidade.model.ParticipacaoEmTreinamento;
import br.com.fiap.inclusao_diversidade.repository.ParticipacaoEmTreinamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipacaoEmTreinamentoService {

    private final ParticipacaoEmTreinamentoRepository participacaoRepository;

    public ParticipacaoEmTreinamentoService(ParticipacaoEmTreinamentoRepository participacaoRepository) {
        this.participacaoRepository = participacaoRepository;
    }

    public List<ParticipacaoEmTreinamento> listarTodos() {
        return participacaoRepository.findAll();
    }

    public Optional<ParticipacaoEmTreinamento> buscarPorId(Long id) {
        return participacaoRepository.findById(id);
    }

    public ParticipacaoEmTreinamento salvar(ParticipacaoEmTreinamento participacao) {
        return participacaoRepository.save(participacao);
    }

    public void deletar(Long id) {
        participacaoRepository.deleteById(id);
    }
}

