package com.wortschatz.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wortschatz.model.Word;
import com.wortschatz.repository.WordRepository;

@RestController
@RequestMapping("/api/words")
public class WordController {
    private final WordRepository wordRepository;

    public WordController(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @GetMapping
    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }

    @PostMapping
    public Word addWord(@RequestBody Word word) {
        return wordRepository.save(word);
    }

}
