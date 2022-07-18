package com.aula08.endereco;

import java.util.ArrayList;

/**
 * Descricao: classe Estado com o nome, a sigla, o país que pertence e a lista de cidades que possui.
 * Autor: Fillipe Albuquerque
 * Data: 18-07-2022
 * Link da referência: 
 */
public class Estado{
    private String sigla;
    private String nome;
    Pais pais;
    ArrayList<Cidade> cidades = new ArrayList<>();
}
