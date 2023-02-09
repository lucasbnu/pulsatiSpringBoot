package com.example.ProdutosAPI.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

/*
O preco deve ser superior a 0;
O produto deve ter no minimo 4 caracteres e no maximo 100;
A Categoria nao pode estar vazia;
nao pode cadastrar produto com unidades_estoque menor que 1;
 */
@Entity
@Data
@Table(name = "produtos")
public class ProdutosModel {
    @Id
    @Column(name = "id_produto")
    private int idProduto;

    @Column(name = "nome_produto")
    @Size(min = 4, max = 100, message = "O produto deve ter no minimo 4 caracteres e no maximo 100")
    private String nomeProduto;

    @Column(name = "descricao_produto")
    private String descricaoProduto;

    @Column(name = "categoria")
    @NotBlank(message = "A categoria nao pode estar vazia")
    private String categoria;

    @Column(name = "fabricante")
    private String fabricante;

    @Column(name = "fornecedor")
    private String fornecedor;

    @Column(name = "preco_unitario")
    @Range(min = 1, message = "O preco deve ser superior a 0")
    private double precoUnitario;

    @Column(name = "unidades_estoque")
    @Range(min = 1, message = "nao pode cadastrar produto com unidade estoque menor que 1")
    private int unidadeEstoque;
}
