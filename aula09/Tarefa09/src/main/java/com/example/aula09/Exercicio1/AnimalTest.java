package com.example.aula09.Exercicio1;

public class AnimalTest {
    public static void main(String[] args) {
        //Exercicio 1.1
        Animal animal1 = new Cachorro("Rex", 7, "late", "corre");
        Animal animal2 = new Cavalo("Veloz", 10, "relincha", "corre");
        Animal animal3 = new Preguica("Lentilha", 1, "grita", "sobe em arvore");
        
        //Exercicio 1.2
        System.out.println("O som do cachorro e: " + animal1.getSom());
        System.out.println("O som do cavalo e: " + animal2.getSom());
        System.out.println("O som da preguica e: " + animal3.getSom());
        
        //Exercicio 1.3
        Veterinario veterinario = new Veterinario();
        veterinario.examinar(animal1);
        veterinario.examinar(animal2);
        veterinario.examinar(animal3);

        //Exercicio 1.4
        Animal animal4 = new Cachorro("Spok", 8, "late", "corre");
        Animal animal5 = new Cavalo("Repica", 11, "relincha", "corre");
        Animal animal6 = new Preguica("Grao", 2, "grita", "sobe em arvore");
        Animal animal7 = new Cachorro("Folha", 6, "late", "corre");
        Animal animal8 = new Cavalo("Prata", 9, "relincha", "corre");
        Animal animal9 = new Preguica("Mosca", 3, "grita", "sobe em arvore");
        Animal animal10 = new Cachorro("Pipoca", 12, "late", "corre");
        
        Zoologico zoo = new Zoologico();
        zoo.getJaula().add(animal1);
        zoo.getJaula().add(animal2);
        zoo.getJaula().add(animal3);
        zoo.getJaula().add(animal4);
        zoo.getJaula().add(animal5);
        zoo.getJaula().add(animal6);
        zoo.getJaula().add(animal7);
        zoo.getJaula().add(animal8);
        zoo.getJaula().add(animal9);
        zoo.getJaula().add(animal10);
        

        for (Animal a:zoo.getJaula()){
            System.out.println(a.getSom());
        }

    }
}
