/*
Exercicio 01
 */
package agenda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
	
	private List<Contato> listaContatos = new ArrayList<Contato>();
	
	public void adicionaContato(Contato contato) {
		listaContatos.add(contato);
	}
	
	public Contato buscaContato(String nomeContato) {
		Contato novoContato = new Contato();
		for (Contato contato : listaContatos) {
			if(contato.getNome().equals(nomeContato)) {
				novoContato = contato;
			}
		}
		return novoContato;
	}

	//Implementação passando o nome como parâmetro
	public void removeContato(String nomeContato) {
		Iterator<Contato> iterator = listaContatos.iterator();
		int quantidadeContatos = listaContatos.size();
		while (iterator.hasNext()){
			Contato contatoRemover = iterator.next();
			if (contatoRemover.getNome().equals(nomeContato)){
				iterator.remove();
			}
		}

		int novaQuantidadeContatos = listaContatos.size();

		if(novaQuantidadeContatos < quantidadeContatos){
			System.out.println("O Contato com o nome: " + nomeContato + " foi removido com sucesso!");
		}else{
			System.out.println("Nenhum contato encontrado com o nome informado");
		}
	}

	//implementação passando o objeto como parâmetro
	public void removeContato(Contato contato){
		listaContatos.remove(contato);
	}


	public List<Contato> getListaContatos() {
		return listaContatos;
	}

	public void setListaContatos(List<Contato> listaContatos) {
		this.listaContatos = listaContatos;
	}

	public void listaNomesAntigo(){
		Iterator<Contato> iterator = listaContatos.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
	}

	public void listaNomesNovo(){
		for (Contato c: listaContatos){
			System.out.println(c.toString());
		}
	}

	public void listaNomesMaisNovo(){
		listaContatos.forEach(contato->System.out.println(contato.toString()));
	}

	public void listaNomesMaisNovoAinda(){
		listaContatos.forEach(System.out::println);
	}

}


