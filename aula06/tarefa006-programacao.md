# Tarefa 006 - 22/06/2022 - Atividades de Programação

1. Implementar um programa que:
  * leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
  * Leve em consideração o ano com 365 dias e o mês com 30.
  * Exemplo: 3 anos, 2 meses e 15 dias = 1170 dias.

Resposta:

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

2. Implementar um programa que:
  * imprima a média aritmética dos números 8,9 e 7.
  * A média dos números 4, 5 e 6.
  * A soma das duas médias.
  * A média das médias.

Resposta:

#include <stdio.h>

int main() {
    int media1 = ((8+7+9)/3);
    int media2 = ((4+5+6)/3);
    int soma = (media1 + media2);
    int m_media = ((media1 + media2)/2);
    printf("%d \n", media1);
    printf("%d \n", media2);
    printf("%d \n", soma);
	printf("%d \n", m_media);
    return 0;
}

3. Implementar um programa que:
  * Leia o valor de um saldo e imprima-o com reajuste de 15%.

Resposta:

#include <stdio.h>

int main() {
    double valor = 0.0;
    scanf("%lf", &valor);
    printf("%lf \n", valor*1.15);   //Considerar reajuste de +15% do valor de entrada
    return 0;
}

4. Implementar um algoritmo que lê:
  * a porcentagem do IPI a ser acrescido no valor das peças;
  * o código da peça 1,
  * valor unitário da peça 1,
  * quantidade de peças 1
  * o código da peça 2,
  * valor unitário da peça 2,
  * quantidade de peças 2

  O programa deve calcular o valor total a ser pago e apresentar o resultado.

  Fórmula : _(valor1*quant1 + valor2*quant2)_*_(IPI/100 + 1)_

Resposta:

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

5. Implementar um programa que:
  * leia o valor do salário mínimo e o valor do salário de um usuário,
  * calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM=R$1.045,00).

Resposta:

#include <stdio.h>

int main() {
    double salario_minimo = 0.0, salario_usuario=0.0;
    scanf("%lf %lf", &salario_minimo, &salario_usuario);
    printf("%lf \n", salario_usuario/salario_minimo);
    return 0;
}

6. Implementar um programa que:
  * leia um número inteiro
  * e imprima o seu antecessor e seu sucessor.

Resposta:

#include <stdio.h>

int main() {
    int i;
    scanf("%d", &i);
    printf("%d %d \n", i-1, i+1);
    return 0;
}

**INSTRUÇÕES**
1. Todos estes programas devem ser implementados na linguagem de programação da preferênca do aluno (um arquivo de código-fonte para cada programa);
2. Utilizar uma IDE de sua preferência. Neste IDE deve estar instalado o _plugin_ do [sonarlint](https://www.sonarlint.org/);
3. Após a implementação de todos os exercícios, criar no seu repositório cs-2021-1, na sua _branch_ **aluno**, a pasta **tarefa006**;
4. Fazer _commit_ dos arquivos fonte nesta pasta;
5. Verificar quais são as sugestões de alteração/melhoria apontadas pelo _sonarlint_ para cada um dos programas implementados;
6. Efetuar as correções apontadas em um novo arquivo de código-fonte e coommitar novamente;
7. Esta tarefa é individual e deverá ser entregue até as 23h59min do dia 29/06/2022.
