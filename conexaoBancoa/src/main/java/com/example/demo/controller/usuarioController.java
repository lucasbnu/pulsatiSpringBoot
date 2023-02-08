package com.example.demo.controller;

import com.example.demo.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.usuarioModel;

import java.util.List;

@RequestMapping("/usuario")
@RestController
public class usuarioController {

    @Autowired
    private usuarioRepository repository;

    @GetMapping("/buscar")
    public List<usuarioModel> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public usuarioModel buscarPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public usuarioModel atualizar(@RequestBody usuarioModel usuario) {
        return repository.save(usuario);
    }

    @PostMapping("/adicionar")
    public usuarioModel salvar(@RequestBody usuarioModel usuario) {
        return repository.save(usuario);
    }

    @DeleteMapping("/apagar/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }

    @GetMapping("/BuscarporCPF/{CPF}")
    public usuarioModel buscarPorCPF(@PathVariable String CPF) {
        return repository.findByCPF(CPF);
    }

    @GetMapping("/BuscarporNome/{NOME}")
    public List<usuarioModel> buscarPorNome(@PathVariable String NOME) {
        return repository.findByNOME(NOME);
    }

    @GetMapping("/BuscarComNomeJava")
    public List<usuarioModel> buscarComNomeJava() {
        return repository.encontraPessoaJava();
    }
    //NOME, SEXO, TIPO_SANGUINEO
    @GetMapping("/pesquisacaracteristicas/{NOME}/{SEXO}/{TIPO_SANGUINEO}")
    public List<usuarioModel> buscarComNomeSexoTipoSanguineo(@PathVariable String NOME,
                                                             @PathVariable String SEXO,
                                                             @PathVariable String TIPO_SANGUINEO){
        return repository.pesquisaPorCaracteristicas(NOME, SEXO, TIPO_SANGUINEO);
    }

}
