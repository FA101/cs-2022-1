package com.example.aula09.Exercicio2;

public class Livro extends Produto{

    private String autor;

	public Livro(String nomeLoja, int preco, String descricao) {
		super(nomeLoja, preco, descricao);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String getDescricao() {		
		return super.getDescricao() + " " + autor;
	}

	@Override
	public String getNomeLoja() {		
		return super.getNomeLoja();
	}

	@Override
	public int getPreco() {		
		return super.getPreco();
	}

	@Override
	public void setDescricao(String descricao) {		
		super.setDescricao(descricao);
	}

	@Override
	public void setNomeLoja(String nomeLoja) {		
		super.setNomeLoja(nomeLoja);
	}

	@Override
	public void setPreco(int preco) {		
		super.setPreco(preco);
	}
    
    
}
