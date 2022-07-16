package agenda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
	
	private List<Contato> listaContatos = new ArrayList<>();
	
	public void adicionaContato(Contato contato) {
		listaContatos.add(contato);
	}
	
	public Contato buscaContato(String nomeContato, String enderecoEmail) {
		Contato novoContato = new Contato(nomeContato, enderecoEmail);
		for (Contato contato : listaContatos) {
			if(contato.getNome().equals(nomeContato)) {
				novoContato = contato;
			}else if(contato.getEmail().equals(enderecoEmail)){
				novoContato = contato;
			}
		}
		return novoContato;
	}
	
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

	//Método convencional
	public void listaNomesNovo(){
		for (Contato c: listaContatos){
			System.out.println(c.toString());
		}
	}

	//Revisão do método
	public void listaNomesMaisNovo(){
		listaContatos.forEach(contato->System.out.println(contato.toString()));
	}

	//Melhoria do método
	public void listaNomesMaisNovoAinda(){
		listaContatos.forEach(System.out::println);
	}

}


