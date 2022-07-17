package aula12.tarefa12;

public class LoginTeste {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("informe um usuario: ");
            String u = scanner.nextLine();
            
        } catch(LoginInvalidoException au){
            if(usuario.equals(getUsuario()) && senha.equals(getSenha())){
                return 1;
            } else{
                throw new LoginInvalidoException("Login ou usuario incorretos");
                return 0;
            }            
        } finally{
            scanner.close();
        } 
    }
}
