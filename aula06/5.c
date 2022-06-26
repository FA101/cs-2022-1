#include <stdio.h>

int main() {
    double salario_minimo = 0.0, salario_usuario=0.0;
    scanf("%lf %lf", &salario_minimo, &salario_usuario);
    printf("%lf \n", salario_usuario/salario_minimo);
    return 0;
}