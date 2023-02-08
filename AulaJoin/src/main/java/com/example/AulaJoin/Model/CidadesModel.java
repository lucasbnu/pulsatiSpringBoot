/*
-- auto-generated definition
create table ADRI_CIDADES
(
    CIDADE_ID    NUMBER        not null
        primary key,
    NOME_CIDADE  VARCHAR2(100) not null,
    ID_ESTADO    NUMBER
        constraint ID_ESTADOS_ADRI_FK
            references ADRI_ESTADOS,
    DATA_CRIACAO DATE
)
/
 */
package com.example.AulaJoin.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "ADRI_CIDADES")
@Data
public class CidadesModel {
    @Id
    @NotNull(message = "O campo ID da cidade não pode ser nulo")
    @Column(name = "CIDADE_ID")
    private Long cidadeId;

    @Column(name = "NOME_CIDADE")
    @NotNull(message = "O campo nome da cidade não pode ser nulo")
    private String nomeCidade;

    @ManyToOne
    @NotNull(message = "O campo ID do estado não pode ser nulo")
    @JoinColumn(name = "ID_ESTADO", referencedColumnName = "ESTADO_ID")
    private EstadosModel idEstado;


    @Column(name = "DATA_CRIACAO")
    private String dataCriacao;
}
