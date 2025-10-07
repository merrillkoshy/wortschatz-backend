package com.wortschatz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wortschatz.model.Word;

public interface WordRepository extends JpaRepository<Word, Long> {
}