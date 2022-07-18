//Exercicio 3 da aula12

package aula12.tarefa12;

import java.util.Scanner;

public class TesteLogin {
    public static void main(String[] args) {
        String u, s;
        Boolean x;
        Scanner input = new Scanner(System.in); 
        Login usuario1 = new Login("Joao", "123");

        System.out.println("\ninforme o usuario: \n");
        u = input.nextLine();

        System.out.println("\ninforme a senha: \n");
        s = input.nextLine();

        try{            
            x = usuario1.fazerLogin(u, s);
            if(Boolean.FALSE.equals(x)){
                throw new LoginInvalidoException();
            }else{
                System.out.println("\nUsuario e senhas corretos.\n");
            }
        } catch(LoginInvalidoException au){
            System.out.println("Voce informou o usuario ou senha incorretos.");
        } finally{
            input.close();
        }
    }
}
