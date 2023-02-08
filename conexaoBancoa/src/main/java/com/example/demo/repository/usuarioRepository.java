package com.example.demo.repository;

import com.example.demo.model.usuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface usuarioRepository extends JpaRepository<usuarioModel, Integer> {
    @Query(value = "\n" +
            "SELECT * FROM BCK_LUCAS \n" +
            "WHERE NOME = ?1 \n" +
            "AND   SEXO = ?2 \n" +
            "AND   TIPO_SANGUINEO = ?3",
            nativeQuery = true)
    public List<usuarioModel> pesquisaPorCaracteristicas(String NOME, String SEXO, String TIPO_SANGUINEO);
    public usuarioModel findByCPF(String CPF);

      public List<usuarioModel> findByNOME(String NOME);

        @Query(value = "SELECT * FROM BCK_LUCAS WHERE upper(NOME) LIKE '%JAVA%'", nativeQuery = true)
        public List<usuarioModel> encontraPessoaJava();



}
