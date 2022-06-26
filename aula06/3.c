#include <stdio.h>

int main() {
    double valor = 0.0;
    scanf("%lf", &valor);
    printf("%lf \n", valor*1.15);   //Considerar reajuste de +15% do valor de entrada
    return 0;
}