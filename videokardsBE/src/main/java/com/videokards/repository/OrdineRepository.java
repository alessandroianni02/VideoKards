package com.videokards.repository;

import com.videokards.models.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine, Long> {

    List<Ordine> findByUid(Long uid);

    List<Ordine> findByUidOrderByDataDesc(Long uid);
}
