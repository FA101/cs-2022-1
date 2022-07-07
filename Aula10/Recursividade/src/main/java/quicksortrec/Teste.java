package quicksortrec;

import java.util.Random;

public class Teste {
    private static final int T = 100;
    private static final int T1 = 1000;
    private static final int T2 = 10000;
    public static void main(String[] args) {    
        
        int vetor[] = new int[T];
        int vetor1[] = new int[T1];
        int vetor2[] = new int[T2];

        for(int i=0;i<T;i++){
            vetor[i]= aleatorio();
        }

        for(int i1=0;i1<T1;i1++){
            vetor1[i1]= aleatorio();
        }

        for(int i2=0;i2<T;i2++){
            vetor2[i2]= aleatorio();
        }

        long inicio = System.currentTimeMillis();        
        long inicio1 = System.currentTimeMillis();        
        long inicio2 = System.currentTimeMillis();        

        QuickSortRecursivo sort = new QuickSortRecursivo();              
        QuickSortRecursivo sort1 = new QuickSortRecursivo();   
        QuickSortRecursivo sort2 = new QuickSortRecursivo();

        sort.ordenarVetorDeInteiros(vetor);
        sort1.ordenarVetorDeInteiros(vetor1);
        sort2.ordenarVetorDeInteiros(vetor2);

        long fim = System.currentTimeMillis();
        long fim1 = System.currentTimeMillis();
        long fim2 = System.currentTimeMillis();

        long tempo = (fim - inicio);  
        long tempo1 = (fim1 - inicio1);  
        long tempo2 = (fim2 - inicio2);  

        imprimirVetor(vetor);
        imprimirVetor(vetor1);
        imprimirVetor(vetor2);

        System.out.println("\n");
        System.out.println(tempo);
        
        System.out.println("\n");
        System.out.println(tempo1);

        System.out.println("\n");
        System.out.println(tempo2);
    }

    private static void imprimirVetor(int[] vetor) {
        System.out.println("Vetor...\n");
        for(int num : vetor) {
            System.out.print(num + ", ");
        }
    }

    public static int aleatorio(){
        Random rand = new Random(); 
        int upperbound = T;             
        int int_random = rand.nextInt(upperbound);                     
        return int_random;            
    }
    
}
