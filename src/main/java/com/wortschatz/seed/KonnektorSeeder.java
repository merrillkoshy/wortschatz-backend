package com.wortschatz.seed;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wortschatz.model.Konnektor;
import com.wortschatz.model.KonnektorType;
import com.wortschatz.repository.KonnektorRepository;

@Component
public class KonnektorSeeder implements CommandLineRunner {

    private final KonnektorRepository repository;

    public KonnektorSeeder(KonnektorRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (repository.count() == 0) { // only seed if empty
            repository.save(new Konnektor("und", KonnektorType.COORDINATING, "Connects clauses of equal rank"));
            repository.save(new Konnektor("oder", KonnektorType.COORDINATING, "Or / alternative"));
            repository.save(new Konnektor("aber", KonnektorType.COORDINATING, "Contrast / but"));
            repository.save(new Konnektor("denn", KonnektorType.COORDINATING, "For / because"));
            repository.save(new Konnektor("sondern", KonnektorType.COORDINATING, "But rather"));

            repository.save(new Konnektor("weil", KonnektorType.SUBORDINATING, "Because, verb goes to the end"));
            repository.save(new Konnektor("dass", KonnektorType.SUBORDINATING, "That clause, verb goes to the end"));
            repository.save(new Konnektor("obwohl", KonnektorType.SUBORDINATING, "Although"));
            repository.save(new Konnektor("wenn", KonnektorType.SUBORDINATING, "If / when"));
            repository.save(new Konnektor("bevor", KonnektorType.SUBORDINATING, "Before"));
            repository.save(new Konnektor("nachdem", KonnektorType.SUBORDINATING, "After"));
            repository.save(new Konnektor("während", KonnektorType.SUBORDINATING, "While / during"));

            repository.save(new Konnektor("deshalb", KonnektorType.ADVERBIAL, "Therefore, sentence starts with it"));
            repository.save(new Konnektor("trotzdem", KonnektorType.ADVERBIAL, "Nevertheless"));
            repository.save(new Konnektor("jedoch", KonnektorType.ADVERBIAL, "However"));
            repository.save(new Konnektor("dann", KonnektorType.ADVERBIAL, "Then"));
            repository.save(new Konnektor("ansonsten", KonnektorType.ADVERBIAL, "Otherwise"));

            System.out.println("Seeded Konnektoren successfully!");
        }
    }
}