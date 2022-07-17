//Exercicio 1 da aula12

package aula12.tarefa12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2Numeros {
    public int dividir(int a, int b) 
    {        
        return a/b;
    }

    public static void main(String[] args) {

        
        Excecao2Numeros calc = new Excecao2Numeros();
        Scanner scanner = new Scanner(System.in);
        try{               
            System.out.println("Informe o dividendo: ");
            int x1 = scanner.nextInt();         
            System.out.println("Informe o divisor: ");    
            int x2 = scanner.nextInt();         
            System.out.println( x1 + "/" + x2 + " = " + calc.dividir(x1,x2));
        }catch (ArithmeticException ae){
            System.out.println("O denominador deve ser diferente de zero.");            
        }catch (InputMismatchException ai){
            System.out.println("O caractere digitado nao e um numero.");            
        }finally{
            scanner.close();
        }
    }
    
}
