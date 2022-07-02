package com.example.aula09.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Livro("Saraiva", 10, "Aventura");
        Produto produto2 = new Mouse("Americanas", 20, "Ergonomico");
        Produto produto3 = new Livro("Leitura", 100, "Autoajuda");
        Produto produto4 = new Mouse("Kabum", 200, "Sem fio");

        List<Produto> carrinho = new ArrayList<>();        
        carrinho.add(produto1);
        carrinho.add(produto2);
        carrinho.add(produto3);
        carrinho.add(produto4);

        


        
        
    }
}
