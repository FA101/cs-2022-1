package quick_sort_recursivo;

import java.util.Random;

public class Teste {   
    static int T = 100;
    static int T1 = 1000;
    static int T2 = 10000;

    public static void main(String[] args) {    

        int[] vetor = new int[T];
        int[] vetor1 = new int[T1];
        int[] vetor2 = new int[T2];

        for(int i=0;i<T;i++){
            vetor[i]= aleatorio();
        }

        for(int i1=0;i1<T1;i1++){
            vetor1[i1]= aleatorio1();
        }

        for(int i2=0;i2<T2;i2++){
            vetor2[i2]= aleatorio2();
        }

        long inicio = System.currentTimeMillis();        
        QuickSortRecursivo sort = new QuickSortRecursivo(); 
        sort.ordenarVetorDeInteiros(vetor);
        long fim = System.currentTimeMillis();
        long tempo = (fim - inicio);  

        long inicio1 = System.currentTimeMillis();                
        QuickSortRecursivo sort1 = new QuickSortRecursivo();           
        sort1.ordenarVetorDeInteiros(vetor1);
        long fim1 = System.currentTimeMillis();
        long tempo1 = (fim1 - inicio1);  

        long inicio2 = System.currentTimeMillis();        
        QuickSortRecursivo sort2 = new QuickSortRecursivo();
        sort2.ordenarVetorDeInteiros(vetor2);
        long fim2 = System.currentTimeMillis();        
        long tempo2 = (fim2 - inicio2);  

        /**
        imprimirVetor(vetor);
        imprimirVetor(vetor1);
        imprimirVetor(vetor2);
        */
        
        System.out.println("\n");
        System.out.println(tempo);
        
        System.out.println("\n");
        System.out.println(tempo1);

        System.out.println("\n");
        System.out.println(tempo2);
    }

    /**
    private static void imprimirVetor(int[] vetor) {
        System.out.println("Vetor...\n");
        for(int num : vetor) {
            System.out.print(num + ", ");
        }
    }
    */

    public static int aleatorio(){
        Random rand = new Random(); 
        int upperbound = T;             
        return rand.nextInt(upperbound);            
    }
    
    public static int aleatorio1(){
        Random rand1 = new Random(); 
        int upperbound1 = T1;             
        return rand1.nextInt(upperbound1);            
    }

    public static int aleatorio2(){
        Random rand2 = new Random(); 
        int upperbound2 = T2;             
        return rand2.nextInt(upperbound2);            
    }
}
