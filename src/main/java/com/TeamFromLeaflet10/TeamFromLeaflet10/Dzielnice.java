package com.TeamFromLeaflet10.TeamFromLeaflet10;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dzielnice {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long ID;
    private String name;
    private float powierzchnia;
    private int Liczba_Ludnosci;

    protected Dzielnice() {}

    public Dzielnice(String name, float powierzchnia, int liczba_Ludnosci) {
        this.name = name;
        this.powierzchnia = powierzchnia;
        Liczba_Ludnosci = liczba_Ludnosci;
    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public float getPowierzchnia() {
        return powierzchnia;
    }

    public int getLiczba_Ludnosci() {
        return Liczba_Ludnosci;
    }
}