package br.com.fiap.inclusao_diversidade.service;

import br.com.fiap.inclusao_diversidade.model.RelatorioDeDiversidade;
import br.com.fiap.inclusao_diversidade.repository.RelatorioDeDiversidadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelatorioDeDiversidadeService {

    private final RelatorioDeDiversidadeRepository relatorioRepository;

    public RelatorioDeDiversidadeService(RelatorioDeDiversidadeRepository relatorioRepository) {
        this.relatorioRepository = relatorioRepository;
    }

    public List<RelatorioDeDiversidade> listarTodos() {
        return relatorioRepository.findAll();
    }

    public Optional<RelatorioDeDiversidade> buscarPorId(Long id) {
        return relatorioRepository.findById(id);
    }

    public RelatorioDeDiversidade salvar(RelatorioDeDiversidade relatorio) {
        return relatorioRepository.save(relatorio);
    }

    public void deletar(Long id) {
        relatorioRepository.deleteById(id);
    }
}

