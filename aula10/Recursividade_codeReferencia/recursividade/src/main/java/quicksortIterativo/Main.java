//https://www.techiedelight.com/pt/iterative-implementation-of-quicksort/
package quicksortIterativo;

import java.util.Arrays;
import java.util.Stack;

public class Main
{
    public static void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int a[], int start, int end)
    {
        // Escolhe o elemento mais à direita como pivô do array
        int pivot = a[end];

        // elementos menores que o pivô irão para a esquerda de `pIndex`
        // elementos mais do que o pivô irão para a direita de `pIndex`
        // elementos iguais podem ir de qualquer maneira
        int pIndex = start;

        // cada vez que encontramos um elemento menor ou igual ao pivô,
        // `pIndex` é incrementado, e esse elemento seria colocado
        // antes do pivô.
        for (int i = start; i < end; i++)
        {
            if (a[i] <= pivot)
            {
                swap(a, i, pIndex);
                pIndex++;
            }
        }

        // troca `pIndex` com pivô
        swap (a, pIndex, end);

        // retorna `pIndex` (índice do elemento pivô)
        return pIndex;
    }

    // Rotina iterativa Quicksort
    public static void iterativeQuicksort(int[] a)
    {
        // cria uma Stack para armazenar o índice inicial e final do subarray
        Stack<Pair> stack = new Stack<>();

        // obtém o índice inicial e final do array fornecido
        int start = 0;
        int end = a.length - 1;

        // coloca o índice inicial e final do array na Stack
        stack.push(new Pair(start, end));

        // faz um loop até que a Stack esteja vazia
        while (!stack.empty())
        {
            // remove o top pair da lista e inicia o subarray
            // e índices finais
            start = stack.peek().getX();
            end = stack.peek().getY();
            stack.pop();

            // reorganiza os elementos no pivô
            int pivot = partition(a, start, end);

            // envia índices de subarray contendo elementos que são
            // menor que o pivô atual para stack
            if (pivot - 1 > start) {
                stack.push(new Pair(start, pivot - 1));
            }

            // envia índices de subarray contendo elementos que são
            // mais do que o pivô atual para stack
            if (pivot + 1 < end) {
                stack.push(new Pair(pivot + 1, end));
            }
        }
    }

    // Implementação iterativa do Quicksort
    public static void main(String[] args)
    {
        int a[] = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };

        iterativeQuicksort(a);

        // imprime o array ordenado
        System.out.println(Arrays.toString(a));
    }
}
