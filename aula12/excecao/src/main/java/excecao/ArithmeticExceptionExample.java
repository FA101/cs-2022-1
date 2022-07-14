package excecao;

import java.util.Scanner;

public class ArithmeticExceptionExample {

    public int dividir(int a, int b) throws ArithmeticException
    {
        return a / b;
    }

    public static void main(String[] args) {
        ArithmeticExceptionExample calc = new ArithmeticExceptionExample();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o dividendo: ");
        int a = scanner.nextInt();
        System.out.println("Informe o divisor: ");
        int b = scanner.nextInt();
        try{
            System.out.println( a + "/" + b + " = " + calc.dividir(a,b));
        }catch (ArithmeticException ae){
            System.out.println("O denominador deve ser diferente de zero.");
            ae.printStackTrace();
        }
    }
}
