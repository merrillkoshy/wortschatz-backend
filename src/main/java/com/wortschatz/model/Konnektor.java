package com.wortschatz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Konnektor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String german;

    @Enumerated(EnumType.STRING)
    private KonnektorType type;
    private String rule;

    // No-args constructor required by JPA
    public Konnektor() {
    }

    // All-args constructor for seeding
    public Konnektor(String german, KonnektorType type, String rule) {
        this.german = german;
        this.type = type;
        this.rule = rule;
    }

    // getters / setters
}
