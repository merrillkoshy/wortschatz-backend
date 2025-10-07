package com.wortschatz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wortschatz.model.Konnektor;

public interface KonnektorRepository extends JpaRepository<Konnektor, Long> {
    // Optional: custom query methods can go here later
}