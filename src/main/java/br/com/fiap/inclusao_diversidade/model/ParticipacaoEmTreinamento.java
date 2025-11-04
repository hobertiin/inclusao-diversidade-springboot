package br.com.fiap.inclusao_diversidade.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_participacao_treinamento")
public class ParticipacaoEmTreinamento {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_PARTICIPACAO_TREINAMENTO"
    )

    @SequenceGenerator(
            name = "SEQ_PARTICIPACAO_TREINAMENTO",
            sequenceName = "SEQ_PARTICIPACAO_TREINAMENTO",
            allocationSize = 1
    )
    private Long id;

    @ManyToOne
    @JoinColumn(name = "colaborador_id")
    private Colaborador colaborador;

    @ManyToOne
    @JoinColumn(name = "treinamento_id")
    private Treinamento treinamento;

    private Boolean completo;
    @Column(name = "data_conclusao")
    private LocalDate dataDeConclusao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Treinamento getTreinamento() {
        return treinamento;
    }

    public void setTreinamento(Treinamento treinamento) {
        this.treinamento = treinamento;
    }

    public Boolean getCompleto() {
        return completo;
    }

    public void setCompleto(Boolean completo) {
        this.completo = completo;
    }

    public LocalDate getDataDeConclusao() {
        return dataDeConclusao;
    }

    public void setDataDeConclusao(LocalDate dataDeConclusao) {
        this.dataDeConclusao = dataDeConclusao;
    }
}
