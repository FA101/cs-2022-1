package fatorial.iterativo;

public class FatorialIterativo {
    public int calculaFatorial(int x){
        int fat = x;
        while (x > 1){
            fat = fat*(x-1);
            x--;
        }
        return fat;
    }

    public static void main(String[] args) {
        int x = 7;
        FatorialIterativo app = new FatorialIterativo();
        System.out.println("O valor da Fatorial de " + x + " é " + app.calculaFatorial(x));
    }
}
