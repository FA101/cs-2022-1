package agenda;

public class Contato {
	private String nome;
	private String email;
	//private String busca;	

	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	/* 
	public Contato(String busca) {
		if (busca.equals(nome)){
			this.nome = nome;	
		} else if(this.busca.equals(email)){
			this.email = email;
		}
		
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}	

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome: " + getNome());
		sb.append("\nE-mail: " + getEmail());
		return sb.toString();
	}

}
