package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.model.clienteModel;

public class clienteRepository {
   List<clienteModel> clientes = new ArrayList<>();

    public clienteRepository() {
        clientes.add(new clienteModel(1, "Joao", 20, 123));
        clientes.add(new clienteModel(2, "Maria", 30, 456));
        clientes.add(new clienteModel(3, "José", 40, 789));
        clientes.add(new clienteModel(4, "Pedro", 50, 101));
        clientes.add(new clienteModel(5, "Ana", 60, 112));
    }

    public void addCliente(clienteModel cliente) {
         clientes.add(cliente);
    }

    public List<clienteModel> getClientes() {
        return clientes;
    }

    public void deleteCliente(  clienteModel cliente) {
        clientes.remove(cliente);
    }

    public void updateCliente( clienteModel cliente) {
        for (clienteModel c : clientes) {
            if (c.getId() == cliente.getId()) {
                c.setNome(cliente.getNome());
                c.setIdade(cliente.getIdade());
                c.setCodigo_cadastro(cliente.getCodigo_cadastro());
            }
        }
    }

    public clienteModel getClienteById(int id) {
        for (clienteModel c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }


}


