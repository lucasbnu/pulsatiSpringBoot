package com.example.exemploJoin.Controller;


import com.example.exemploJoin.Model.PessoaModel;
import com.example.exemploJoin.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/buscar")
    public List<PessoaModel> buscarPessoa() {
        return pessoaRepository.findAll();
    }

    @GetMapping(value = "/buscar/{id}")
    public PessoaModel buscarPessoaPorId(@PathVariable Long id) {
        return pessoaRepository.findById(id).get();
    }

    @PostMapping("/salvar")
    public PessoaModel salvarPessoa(@RequestBody PessoaModel pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @PutMapping("/atualizar")
    public PessoaModel atualizarPessoa(@RequestBody PessoaModel pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarPessoa(@PathVariable Long id) {
        pessoaRepository.deleteById(id);
    }

}
