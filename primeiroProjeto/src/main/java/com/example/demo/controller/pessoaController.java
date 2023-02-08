package com.example.demo.controller;

import com.example.demo.model.PessoaModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController//anotação para indicar que é um controller
               //Ele vai fazer com que o Spring saiba que essa classe
               //tem rotas para ele listar
public class pessoaController{
    @GetMapping("/pessoa") // anotação para indicar que é uma rota
                             // do tipo get, que vai ser acessada pelo /pessoa
    public ResponseEntity<List<PessoaModel>> pessoa() {
        //ResponseEntity é um objeto que vai ser retornado
        //List<PessoaModel> é o tipo de dado que vai ser retornado
        // o ResponseEntity tranforma a lista em um objeto json com os dados


        List<PessoaModel> pessoas = new ArrayList<>();// cria a lista de pessoas

        pessoas.add(new PessoaModel(1, "José", 20)); //adiciona pessoas usando o contrutor de pessoa
        pessoas.add(new PessoaModel(2, "Maria", 30)); // o mesmo de cima mas com dados diferentes

        return ResponseEntity.ok(pessoas); // Da o retorno da lista de pessoas

        //Baseado em como foi implementado Pessoa,
        // crie as classes Modelo, e controler que retorna o objeto em json

        //crie a mesma estrutura para produto, com os atributos id, nome, preco
        //crie a mesma estrutura para cliente, com os atributos id, nome, cpf
        //crie a mesma estrutura para fornecedor, com os atributos id, nome, cnpj
        //crie a mesma estrutura para funcionario, com os atributos id, nome, cpf

    }


}
