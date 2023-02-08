package com.example.demo.model;

import lombok.Data;

@Data
public class PessoaModel {
    private int id;
    private String nome;
    private int idade;
    PessoaModel(){}

    public PessoaModel(int id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

}
