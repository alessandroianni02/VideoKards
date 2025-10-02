package com.videokards.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prodotti")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prodotto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descrizione;

    @Column(nullable = false)
    private Double prezzo;

    @Column(nullable = false)
    private Integer quantita = 0;

    private String categoria;

    private String immagine;

    @Column(columnDefinition = "INT DEFAULT 0")
    private Integer sconto = 0;

    @Column(columnDefinition = "TINYINT(1) DEFAULT 0")
    private Boolean scontato = false;

    @Column(columnDefinition = "TINYINT(1) DEFAULT 1")
    private Boolean disponibile = true;

    // Metodo per calcolare il prezzo finale con sconto
    public Double getPrezzoFinale() {
        if (scontato && sconto > 0) {
            return prezzo - (prezzo * sconto / 100.0);
        }
        return prezzo;
    }
}