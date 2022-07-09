package com.example.aula09.Exercicio1;

public class Preguica extends Animal {    

    public Preguica(String nome, int idade, String som, String movimento) {
        super(nome, idade, som, movimento);
    }

    public boolean subirEmArvore(){
        return true;
    }

    @Override
    public int getIdade() {        
        return super.getIdade();
    }

    @Override
    public String getNome() {        
        return super.getNome();
    }

    @Override
    public String getSom() {        
        return super.getSom();
    }
    

    @Override
    public void setIdade(int idade) {        
        super.setIdade(idade);
    }

    @Override
    public void setNome(String nome) {        
        super.setNome(nome);
    }

    @Override
    public void setSom(String som) {        
        super.setSom(som);
    }

    @Override
    public String getMovimento() {        
        return super.getMovimento();
    }

    @Override
    public void setMovimento(String movimento) {        
        super.setMovimento(movimento);
    }
    
}
