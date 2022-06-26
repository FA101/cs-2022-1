#include <stdio.h>

int main() {
    int a=0, m=0, d=0, idade=0;
    scanf("%d %d %d", &a, &m, &d);
    if((a>=0) && (m>=0) && (d>=0)){  //Desconsiderar valores negativos para idade
        idade=a*365 + m*30 + d;   //Considerar premissa de ano com 365 dias e mes com 30 dias
		printf("%d anos, %d meses e %d dias = %d dias", a, m, d, idade);
    }
    return 0;
}