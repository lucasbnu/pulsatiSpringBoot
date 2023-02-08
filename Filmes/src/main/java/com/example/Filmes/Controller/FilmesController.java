package com.example.Filmes.Controller;

import com.example.Filmes.Repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Filmes.Model.FilmesModel;
import java.sql.Date;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmesController {
    @Autowired
    private FilmesRepository repository;

    @GetMapping("/buscar")
    public List<FilmesModel> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public FilmesModel buscarPorId(@PathVariable Integer id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public FilmesModel atualizar(@RequestBody FilmesModel filmesModel) {
        return repository.save(filmesModel);
    }

    @PostMapping("/salvar")
    public FilmesModel salvar(@RequestBody FilmesModel filmesModel) {
        return repository.save(filmesModel);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @GetMapping("/buscarPordataLancamento/{dataLancamento}")
    public List<FilmesModel> buscarPorDataLancamento(@PathVariable Date dataLancamento) {
        return repository.findByDataLancamento(dataLancamento);
    }
    @GetMapping("/buscarPorPaisOrigem/{pais}")
    public List<FilmesModel> buscarPorPaisOrigem(@PathVariable String pais) {
        return repository.findByPaisOrigem(pais);
    }


}
