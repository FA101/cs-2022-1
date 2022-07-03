package com.example.aula09.Exercicio2;

public class Produto {
    private String nomeLoja;
    private int preco;
    private String descricao;
    
	public Produto(String nomeLoja, int preco, String descricao) {
		this.nomeLoja = nomeLoja;
		this.preco = preco;
		this.descricao = descricao;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public int getPreco() {
		return preco;
	}

	public String getDescricao() {
		return descricao;
	}

    
}
