package com.example.ProdutosAPI.Controller;

import com.example.ProdutosAPI.Model.ProdutosModel;
import com.example.ProdutosAPI.Repository.ProdutosRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    @Autowired
    private ProdutosRepository repository;

    @GetMapping("/buscar/categoria/{categoria}")
    public List<ProdutosModel> getProdutosByCategoria(@PathVariable String categoria) {
        return repository.findByCategoria(categoria);
    }

    @GetMapping("/buscar/fornecedor/{fornecedor}")
    public List<ProdutosModel> getProdutosByFornecedor(@PathVariable String fornecedor) {
        return repository.findByFornecedor(fornecedor);
    }

    @GetMapping("/buscar/fabricante/{fabricante}")
    public List<ProdutosModel> getProdutosByFabricante(@PathVariable String fabricante) {
        return repository.findByFabricante(fabricante);
    }

    @GetMapping("/buscar/estoque")
    public List<ProdutosModel> getProdutosByEstoque() {
        return repository.findByUnidadeEstoqueGreaterThan(0);
    }

    @GetMapping("/buscar/nome/{nome}")
    public List<ProdutosModel> getProdutosByNome(@PathVariable String nome) {
        return repository.findByNomeProdutoContainingIgnoreCase(nome);
    }

    @GetMapping("/buscar/descricao/{descricao}")
    public List<ProdutosModel> getProdutosByDescricao(@PathVariable String descricao) {
        return repository.findByDescricaoProdutoContainingIgnoreCase(descricao);
    }


    @GetMapping("/buscar")
    public List<ProdutosModel> getProdutos() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public ProdutosModel getProdutoById(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/salvar")
    public ProdutosModel salvarProduto(@RequestBody @Validated ProdutosModel produto) {
        return repository.save(produto);
    }

    @PutMapping("/atualizar")
    public ProdutosModel atualizarProduto(ProdutosModel produto) {
        return repository.save(produto);
    }

    @DeleteMapping("/apagar/{id}")
    public void deletarProduto(int id) {
        repository.deleteById(id);
    }

}
