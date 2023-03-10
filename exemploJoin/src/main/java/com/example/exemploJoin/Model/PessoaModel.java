/*
CREATE TABLE pessoa (
  id NUMBER GENERATED BY DEFAULT AS IDENTITY,
  nome VARCHAR2(50) NOT NULL,
  sobrenome VARCHAR2(50) NOT NULL,
  idade NUMBER(3) NOT NULL,
  PRIMARY KEY (id)
);

 */
package com.example.exemploJoin.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pessoa")
@Data
public class PessoaModel {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "idade")
    private Integer idade;

}
