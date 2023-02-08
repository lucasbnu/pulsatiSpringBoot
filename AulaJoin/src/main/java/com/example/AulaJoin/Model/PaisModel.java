/*
-- auto-generated definition
create table ADRI_PAISES
(
    PAIS_ID   NUMBER        not null
        primary key,
    NOME_PAIS VARCHAR2(100) not null
)
/
 */
package com.example.AulaJoin.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "ADRI_PAISES")
public class PaisModel {
    @Id
    @NotNull(message = "O campo ID do país não pode ser nulo")
    @Column(name = "PAIS_ID")
    private Long paisId;

    @NotNull(message = "O campo nome do país não pode ser nulo")
    @Column(name = "NOME_PAIS")
    private String nomePais;
}
