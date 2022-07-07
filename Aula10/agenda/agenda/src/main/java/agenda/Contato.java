/*
Exercicio 01
 */
package agenda;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contato {
	private String nome;
	private String email;
	
	public Contato() {}
	
	public Contato(String n, String e) {
		this.nome = n;
		this.email = e;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome: " + getNome());
		sb.append("\nEmail: " + getEmail());
		return sb.toString();
	}

}
