#include <stdio.h>

int main() {
    double ipi = 0.0, valor_total=0.0;
    scanf("%lf", &ipi);
    int codigo_peca_1 = 0, codigo_peca_2 = 0;
    int valor_peca_1 = 0, valor_peca_2 = 0;
    int quantidade_peca_1 = 0, quantidade_peca_2 = 0;
    scanf("%d %d %d", &codigo_peca_1, &valor_peca_1, &quantidade_peca_1);
    scanf("%d %d %d", &codigo_peca_2, &valor_peca_2, &quantidade_peca_2);
    valor_total = ((double) (valor_peca_1 * quantidade_peca_1) + (double) (valor_peca_2 * quantidade_peca_2)) * (ipi/100 + 1);
    printf("%lf \n", valor_total);
    return 0;
}