/*
create TABLE produtos (
  id_produto NUMBER(10) PRIMARY KEY,
  nome_produto VARCHAR(255),
  descricao_produto VARCHAR(255),
  categoria VARCHAR(255),
  fabricante VARCHAR(255),
  fornecedor VARCHAR(255),
  preco_unitario NUMBER(10,2),
  unidades_estoque NUMBER(10)
);
 */
package com.example.ProdutosAPI.Repository;

import com.example.ProdutosAPI.Model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<ProdutosModel, Integer>{


    List<ProdutosModel> findByUnidadeEstoqueGreaterThan(int unidadeEstoque);
    List<ProdutosModel> findByNomeProdutoContainingIgnoreCase(String nomeProduto);
    List<ProdutosModel> findByDescricaoProdutoContainingIgnoreCase(String descricaoProduto);
    List<ProdutosModel> findByCategoria(String categoria);
    List<ProdutosModel> findByFornecedor(String fornecedor);
    List<ProdutosModel> findByFabricante(String fabricante);

}
