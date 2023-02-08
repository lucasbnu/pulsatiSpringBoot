package com.example.Filmes.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

/*
create table ANA_FILMES
(
    ID                NUMBER         not null
        primary key,
    NOME              VARCHAR2(4000) not null,
    DESCRICAO         VARCHAR2(4000),
    DATA_LANCAMENTO   DATE           not null,
    QUANTIDADE_VENDAS VARCHAR2(500),
    PAIS_ORIGEM       VARCHAR2(100)
)
 */

@Entity
@Data
@Table(name = "ANA_FILMES")
public class FilmesModel {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "DATA_LANCAMENTO")
    private Date dataLancamento;

    @Column(name = "QUANTIDADE_VENDAS")
    private String quantidadeVendas;
    @Column(name = "PAIS_ORIGEM")
    private String paisOrigem;


}
