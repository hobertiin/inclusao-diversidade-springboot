package br.com.fiap.inclusao_diversidade.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;


@Entity
@Table(name = "tbl_treinamento")
public class Treinamento {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_TREINAMENTO"
    )

    @SequenceGenerator(
            name = "SEQ_TREINAMENTO",
            sequenceName = "SEQ_TREINAMENTO",
            allocationSize = 1
    )
    private Long id;
    @NotEmpty(message = "O titulo é obrigatório")
    private String titulo;

    private String descricao;

    @Column(name = "data_treinamento")
    private LocalDate data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
