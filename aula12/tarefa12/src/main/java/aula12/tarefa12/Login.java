//Exercicio 3 da aula12

package aula12.tarefa12;

public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario, String senha){             
        if(usuario.equals(getUsuario()) && senha.equals(getSenha())){
            return true;
        } else{        
            return false;
        }            
    }
}
