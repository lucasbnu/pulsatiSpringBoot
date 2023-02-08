package com.example.AulaJoin.Controller;

import com.example.AulaJoin.Model.CidadesModel;
import com.example.AulaJoin.Repository.CidadesRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadesController {
    @Autowired
    private CidadesRepository repository;

    @GetMapping("/buscar")
    public List<CidadesModel> buscarCidades() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public CidadesModel buscarCidadesPorId(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/salvar")
    public CidadesModel salvarCidades(@RequestBody @Valid CidadesModel cidades) {
        return repository.save(cidades);
    }

    @PutMapping("/atualizar")
    public CidadesModel atualizarCidades(@RequestBody @Valid CidadesModel cidades) {
        return repository.save(cidades);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarCidades(@PathVariable Long id) {
        repository.deleteById(id);
    }



}
