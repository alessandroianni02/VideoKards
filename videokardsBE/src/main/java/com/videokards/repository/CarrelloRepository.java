package com.videokards.repository;

import com.videokards.models.Carrello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarrelloRepository extends JpaRepository<Carrello, Carrello.CarrelloId> {

    List<Carrello> findByUid(Long uid);

    @Modifying
    @Query("DELETE FROM Carrello c WHERE c.uid = :uid")
    void deleteByUid(Long uid);

    @Modifying
    @Query("DELETE FROM Carrello c WHERE c.uid = :uid AND c.pid = :pid")
    void deleteByUidAndPid(Long uid, Long pid);
}
