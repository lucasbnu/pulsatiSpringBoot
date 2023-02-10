package com.example.exemploJoin.Controller;

import com.example.exemploJoin.Model.VendasModel;
import com.example.exemploJoin.Repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendasController {
    @Autowired
    private VendasRepository vendasRepository;

    @GetMapping("/buscar")
    public List<VendasModel> buscarVendas() {
        return vendasRepository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public VendasModel buscarVendasPorId(@PathVariable Long id) {
        return vendasRepository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public VendasModel atualizarVendas(@RequestBody @Validated VendasModel vendas) {
        return vendasRepository.save(vendas);
    }

    @PostMapping("/salvar")
    public VendasModel salvarVendas(@RequestBody @Validated VendasModel vendas) {
        return vendasRepository.save(vendas);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarVendas(@PathVariable Long id) {
        vendasRepository.deleteById(id);
    }

}
