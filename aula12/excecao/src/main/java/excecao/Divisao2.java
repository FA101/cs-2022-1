package excecao;

import java.util.Scanner;

public class Divisao2 {

    private static Scanner sc = new Scanner(System.in);

    public static int divide(int dividendo, int divisor){
        return dividendo/divisor;
    }

    public static void main (String args[]) {

        System.out.println("Informe o valor do dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Informe o valor do divisor: ");
        int divisor = sc.nextInt();
        System.out.println(divide(dividendo, divisor));
    }

}
