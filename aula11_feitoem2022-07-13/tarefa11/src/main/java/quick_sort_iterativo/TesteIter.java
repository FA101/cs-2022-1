package quick_sort_iterativo;

import java.util.Random;

public class TesteIter {
    private static final int T = 100;
    private static final int T1 = 1000;
    private static final int T2 = 10000;

    public class Pair{
        private final int x;
        private final int y;
        
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX() { return x; }
        public int getY() { return y; }
    }

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
        QuickSortIterativo sort = new QuickSortIterativo(); 
        sort.ordenarVetorDeInteiros(vetor);
        long fim = System.currentTimeMillis();
        long tempo = (fim - inicio);  

        long inicio1 = System.currentTimeMillis();                
        QuickSortIterativo sort1 = new QuickSortIterativo();           
        sort1.ordenarVetorDeInteiros(vetor1);
        long fim1 = System.currentTimeMillis();
        long tempo1 = (fim1 - inicio1);  

        long inicio2 = System.currentTimeMillis();        
        QuickSortIterativo sort2 = new QuickSortIterativo();
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