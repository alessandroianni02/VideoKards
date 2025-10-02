package com.videokards.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ordini")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long uid;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal totale;

    @Column(nullable = false)
    private LocalDateTime data;

    @Column(nullable = false)
    private String stato = "IN_ATTESA"; // IN_ATTESA, COMPLETATO, ANNULLATO

    @PrePersist
    protected void allaCreazione() {
        data = LocalDateTime.now();
    }
}