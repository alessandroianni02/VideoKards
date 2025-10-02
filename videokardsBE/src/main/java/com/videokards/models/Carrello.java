package com.videokards.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "carrello")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(Carrello.CarrelloId.class)
public class Carrello {

    @Id
    private Long uid;

    @Id
    private Long pid;

    @Column(nullable = false)
    private Integer quantita = 1;

    // classe chiave primaria
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CarrelloId implements Serializable {
        private Long uid;
        private Long pid;
    }
}