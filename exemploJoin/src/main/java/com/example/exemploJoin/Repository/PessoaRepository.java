package com.example.exemploJoin.Repository;

import com.example.exemploJoin.Model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> { }
