package com.example.AulaJoin.Controller;

import com.example.AulaJoin.Model.PaisModel;
import com.example.AulaJoin.Repository.PaisRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisController {
    @Autowired
    private PaisRepository repository;
    @GetMapping("/buscar")
    public List<PaisModel> buscarPais() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public PaisModel buscarPaisPorId(@PathVariable  Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/salvar")
    public PaisModel salvarPais(@RequestBody @Valid PaisModel pais) {
        return repository.save(pais);
    }

    @PutMapping("/atualizar")
    public PaisModel atualizarPais(@RequestBody @Valid PaisModel pais) {
        return repository.save(pais);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarPais(@PathVariable Long id) {
        repository.deleteById(id);
    }


}
