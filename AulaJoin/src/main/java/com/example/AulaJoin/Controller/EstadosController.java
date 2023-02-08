package com.example.AulaJoin.Controller;

import com.example.AulaJoin.Model.EstadosModel;
import com.example.AulaJoin.Repository.EstadosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadosController {
    @Autowired
    private EstadosRepository repository;

    @GetMapping("/buscar")
    public List<EstadosModel> buscarEstados() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public EstadosModel buscarEstadosPorId(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/salvar")
    public EstadosModel salvarEstados(@RequestBody @Valid EstadosModel estados) {
        return repository.save(estados);
    }

    @PutMapping("/atualizar")
    public EstadosModel atualizarEstados(@RequestBody @Valid EstadosModel estados) {
        return repository.save(estados);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarEstados(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
