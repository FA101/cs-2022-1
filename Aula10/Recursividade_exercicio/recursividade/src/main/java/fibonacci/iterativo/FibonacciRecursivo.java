package fibonacci.iterativo;

public class FibonacciRecursivo {
    public static void main(String[] args) {
        FibonacciRecursivo fibr = new FibonacciRecursivo();
        System.out.println(fibr.fibonacci(10));
        // teste do programa. Imprime os 30 primeiros termos
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + fibr.fibo(i) + "\t");
        }
    }

    /**
     * Método que calcula o valor de fibonacci para um determinado valor x.
     *
     * Sequência de fibonacci
     *  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
     *
     * @param x - Valor que será calculado.
     * @return - O valor de fibonacci para o valor x.
     */
    public int fibonacci(int x) {
    /* Se x for igual a 0 (zero) ou 1, então o valor de fibonacci é
       o proprio valor x. */
        if (x == 0 || x == 1 )
            return x;

    /* Se o valor de x for maior que 1, então precisa calcular o valor
       do fibonacci. */
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    static int fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
}
