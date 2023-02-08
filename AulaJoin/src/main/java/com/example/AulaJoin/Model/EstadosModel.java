/*
-- auto-generated definition
create table ADRI_ESTADOS
(
    ESTADO_ID   NUMBER        not null
        primary key,
    NOME_ESTADO VARCHAR2(100) not null,
    ID_PAIS     NUMBER
        constraint ID_PAIS_ADRI_FK
            references ADRI_PAISES
)
/


 */
package com.example.AulaJoin.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "ADRI_ESTADOS")
public class EstadosModel {
    @Id
    @NotNull(message = "O campo ID do estado não pode ser nulo")
    @Column(name = "ESTADO_ID")
    private Long estadoId;

    @NotNull(message = "O campo nome do estado não pode ser nulo")
    @Column(name = "NOME_ESTADO")
    private String nomeEstado;
   @JoinColumn(name = "ID_PAIS", referencedColumnName = "PAIS_ID")
    @ManyToOne
    private PaisModel paisModel;
}
