package com.example.Filmes.Repository;

import com.example.Filmes.Model.FilmesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface FilmesRepository  extends JpaRepository<FilmesModel, Integer> {
    List<FilmesModel> findByDataLancamento(Date dataLancamento);



    @Query(value = "select * from ANA_FILMES where upper(trim(PAIS_ORIGEM)) = upper(?1)",nativeQuery = true)
    List<FilmesModel> findByPaisOrigem(String pais);
}
