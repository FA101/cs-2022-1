package com.example.aula09.Exercicio2;

public class Mouse extends Produto {

    private String tipo;

	public Mouse(String nomeLoja, int preco, String descricao) {
		super(nomeLoja, preco, descricao);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String getDescricao() {		
		return "Mouse otico, saida USB, 1.600 DPI" + " " + tipo;
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
