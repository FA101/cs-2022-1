package fatorial.recursivo;

public class FatorialRecursivo {

    /**
     * Calcula o valor do fatorial para um número qualquer positivo.
     *
     * @param x - valor que será calculado o fatorial.
     * @return O valor do fatorial.
     */
    public int fatorial(int x) {
        // Se x for igual a 0 (zero) então retorna 1.
        if (x == 0)
            return 1;

    /* Para qualquer outro número, calcula o seu valor multiplicado
       pelo fatorial de seu antecessor. */
        return x * fatorial(x - 1);
    }

    public static void main(String[] args) {
        FatorialRecursivo fr = new FatorialRecursivo();
        int resp = fr.fatorial(7);
        System.out.println(resp);
    }
}
