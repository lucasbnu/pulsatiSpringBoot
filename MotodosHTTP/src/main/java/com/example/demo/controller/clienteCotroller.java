package com.example.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.clienteModel;
import com.example.demo.repository.clienteRepository;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class clienteCotroller {

     private clienteRepository clienteRepository = new clienteRepository();

    @GetMapping("/buscar")
    public ResponseEntity< List<clienteModel> > getClientes() {
        return ResponseEntity.ok( clienteRepository.getClientes() );
    }
    @PostMapping("/Adicionar")
    public void addCliente(@RequestBody clienteModel cliente) {
        clienteRepository.addCliente(cliente);
    } // localhost:8080/cliente/Adicionar

    @DeleteMapping("/Apagar")
    public void deleteCliente(@RequestBody clienteModel cliente) {
        clienteRepository.deleteCliente(cliente);
    }

    @PutMapping("/Atualizar")
    public void updateCliente(@RequestBody clienteModel cliente) {
        clienteRepository.updateCliente(cliente);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<clienteModel> getClienteById(@PathVariable int id) {
        return ResponseEntity.ok( clienteRepository.getClienteById(id) );
    }
}
