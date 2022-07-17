//Exercicio 2 da aula12

package aula12.tarefa12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor10Tam {
    public static void main(String[] args) {
        int[] vet = new int[10]; //e preciso definir o tamanho do array quando ele e instanciado
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int x1=0;
        try{               
            System.out.println("Informe um numero: ");        
            do{
                x1 = scanner.nextInt(); 
                vet[count] = x1;
                count++;
            }while(x1!=0);     
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Voce informou mais que dez valores");            
        }catch(InputMismatchException ai){
            System.out.println("Voce informou valor nao numerico");            
        }finally{
            scanner.close();
        }
    }
}
