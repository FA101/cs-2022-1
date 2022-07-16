package com.example.aula09.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    
    //Animal[] jaulas = new Animal[10];
    private List<Animal> jaula = new ArrayList<>();

    public List<Animal> getJaula() {
        return jaula;
    }

    public void setJaula(List<Animal> jaula) {
        this.jaula = jaula;
    }
    


}
