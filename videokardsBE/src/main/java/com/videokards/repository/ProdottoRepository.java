package com.videokards.repository;

import com.videokards.models.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {

    List<Prodotto> findByCategoria(String categoria);

    List<Prodotto> findByDisponibileTrue();

    List<Prodotto> findByNomeContainingIgnoreCase(String nome);
}
