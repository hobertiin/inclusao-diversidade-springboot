package br.com.fiap.inclusao_diversidade.controller;

import br.com.fiap.inclusao_diversidade.model.Colaborador;
import br.com.fiap.inclusao_diversidade.service.ColaboradorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colaboradores")
public class ColaboradorController {

    private final ColaboradorService colaboradorService;

    public ColaboradorController(ColaboradorService colaboradorService) {
        this.colaboradorService = colaboradorService;
    }

    @GetMapping
    public ResponseEntity<List<Colaborador>> listarTodos() {
        return ResponseEntity.ok(colaboradorService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Colaborador> buscarPorId(@PathVariable Long id) {
        return colaboradorService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Colaborador> criar(@RequestBody Colaborador colaborador) {
        return ResponseEntity.ok(colaboradorService.salvar(colaborador));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Colaborador> atualizar(@PathVariable Long id, @RequestBody Colaborador colaborador) {
        return colaboradorService.buscarPorId(id)
                .map(c -> {
                    colaborador.setId(id);
                    return ResponseEntity.ok(colaboradorService.salvar(colaborador));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        colaboradorService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

