package br.com.fiap.inclusao_diversidade.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_relatorio_diversidade")
public class RelatorioDeDiversidade {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_RELATORIO_DIVERSIDADE"
    )

    @SequenceGenerator(
            name = "SEQ_RELATORIO_DIVERSIDADE",
            sequenceName = "SEQ_RELATORIO_DIVERSIDADE",
            allocationSize = 1
    )
    private Long id;
    @Column(name = "data_gerada")
    private LocalDate dataGerada;

    @Column(name = "total_colaborador")
    private Integer totalColaborador;

    @Column(name = "contagem_mulheres")
    private Integer contagemDeMulheres;

    @Column(name = "contagem_pessoas_negras")
    private Integer contagemDePessoasNegras;

    @Column(name = "contagem_pessoas_lgbt")
    private Integer contagemDePessoasLgbt;

    @Column(name = "contagem_pessoas_desabilidades")
    private Integer contagemDePessoasComDesabilidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataGerada() {
        return dataGerada;
    }

    public void setDataGerada(LocalDate dataGerada) {
        this.dataGerada = dataGerada;
    }

    public Integer getTotalColaborador() {
        return totalColaborador;
    }

    public void setTotalColaborador(Integer totalColaborador) {
        this.totalColaborador = totalColaborador;
    }

    public Integer getContagemDeMulheres() {
        return contagemDeMulheres;
    }

    public void setContagemDeMulheres(Integer contagemDeMulheres) {
        this.contagemDeMulheres = contagemDeMulheres;
    }

    public Integer getContagemDePessoasNegras() {
        return contagemDePessoasNegras;
    }

    public void setContagemDePessoasNegras(Integer contagemDePessoasNegras) {
        this.contagemDePessoasNegras = contagemDePessoasNegras;
    }

    public Integer getContagemDePessoasLgbt() {
        return contagemDePessoasLgbt;
    }

    public void setContagemDePessoasLgbt(Integer contagemDePessoasLgbt) {
        this.contagemDePessoasLgbt = contagemDePessoasLgbt;
    }

    public Integer getContagemDePessoasComDesabilidade() {
        return contagemDePessoasComDesabilidade;
    }

    public void setContagemDePessoasComDesabilidade(Integer contagemDePessoasComDesabilidade) {
        this.contagemDePessoasComDesabilidade = contagemDePessoasComDesabilidade;
    }
}
