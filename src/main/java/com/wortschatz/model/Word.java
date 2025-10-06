package com.wortschatz.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Word{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String german;
    private String english;

    //Getters and setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getGerman(){
        return german;
    }

    public void setGerman(String german){
        this.german = german;
    }
    public String getEnglish(){
        return english;
    }

    public void setEnglish(String english){
        this.english = english;
    }

}