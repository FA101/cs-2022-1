package excecao;

import java.util.Scanner;

public class ExemploExcecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        String numero = sc.nextLine();
        int x;
        try {
            x = Integer.parseInt(numero);
            System.out.println("O número digitado é valido!");
        }catch (NumberFormatException nfe){
            System.out.println("Gigite um número valido!");
        }
    }
}
