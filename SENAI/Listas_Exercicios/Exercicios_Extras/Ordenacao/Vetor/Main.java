import java.util.Arrays;

// Metodos

// MergeSort
class MergeSoft {

    // Ordenação do Array
    public void sort(int[] array, int esquerda, int direita) {
        if (esquerda < direita) {
            // Ponto medio do array
            int medio = (esquerda + direita) / 2;
            sort(array, esquerda, medio);
            sort(array, medio + 1, direita);
            merge(array, esquerda, medio, direita);
        }
    }

    private void merge(int[] array, int esquerda, int medio, int direita) {
        int num1 = medio - esquerda + 1;
        int num2 = direita - medio;

        int[] esquerd = new int[num1];
        int[] direit = new int[num2];

        for(int i = 0 ; i < num1 ; i++)
            esquerd[i] = array[esquerda + i];

        for(int j = 0 ; j <num2 ; j++)
            direit[j] = array[medio + 1 + j];

        int valor1 = 0, valor2 = 0, k = esquerda;

        while(valor1 < num1 && valor2 < num2) {
            if (esquerd[valor1] <= direit[valor2]) {
                array[k] = esquerd[valor1];
                valor1++;

            } else {
                array[k] = direit[valor2];
                valor2++;
            }
            k++;
        }
        while (valor1 < num1) {
            array[k] = esquerd[valor1];
            valor1++;
            k++;
        }

        while (valor2 < num2) {
            array[k] = direit[valor2];
            valor2++;
            k++;
        }
    }
}

// QuickSort - Dividir
class QuickSort {

    // Metodo principal de ordenação do array
    public void sort(int[] array, int baixo, int alto) {
        if (baixo < alto) {
            // Frequencia na lista
            int frequencia = partition(array, baixo, alto);

            // Ordenação antes e depois da participação
            sort(array, baixo, frequencia - 1);
            sort(array, frequencia + 1, alto);
        }
    }

    // Metodo partition para o array

    private int partition(int[] array, int baixo, int alto) {
        int ultimo = array[alto]; // Pega o ultima elemento do array
        int menor = baixo - 1; // O menor elemento do array

        for (int valor1 = baixo; valor1 < alto; valor1++) {
            if (array[valor1] <= ultimo) {
                menor++;

                // Troca de elementos na array
                int temp = array[menor];
                array[menor] = array[valor1];
                array[valor1] = temp;
            }
        }

        // Troca da variavel ultimo para a posição correta
        int temp = array[menor + 1];
        array[menor + 1] = array[alto];
        array[alto] = temp;

        return menor + 1;
    }
}

// HeapSort - Comparação

class HeapSort {
    public void sort(int array[]) {
        int num = array.length;

        // max-heap (reagornização do array)
        for (int computador = num / 2 - 1; computador >= 0; computador--)
            heapify(array, num, computador);

        // Extração de elementos
        for (int computador = num - 1; computador > 0; computador--) {
            // Move o maior para o final
            int temp = array[0];
            array[0] = array[computador];
            array[computador] = temp;

            // Chama heapify
            heapify(array, computador, 0);
        }
    }

    // Readernação do max-heap
    void heapify(int array[], int n, int i) {
        int maior = i;
        int lin = 2 * i + 1;
        int ray = 2 * i + 2;

        // Esquerda maior que a raiz
        if (lin < n && array[lin] > array[maior])
            maior = lin;

        // Direita maior que o maior da raiz atual
        if (ray < n && array[ray] > array[maior])
            maior = ray;

        // Se o maior não é a raiz, troca e continua a heapificar
        if (maior != i) {
            int troca = array[i];
            array[i] = array[maior];
            array[maior] = troca;

            heapify(array, n, maior);
        }
    }
}

// Class main
public class Main {
    public static void main(String[] args) {
        int[] numeros = {3, 4, 9, 2, 5, 8, 2, 1, 7, 4, 6, 2, 9, 8, 5, 1}; // Lista desordebada

        // QuickSort
        int[] arrayQuick = numeros.clone();
        QuickSort userQuick = new QuickSort();
        userQuick.sort(arrayQuick, 0, arrayQuick.length - 1);
        System.out.println("QuickSort: ");
        print(arrayQuick);

        // HeapSort
        int[] arrayHeap = numeros.clone();
        HeapSort userHeap = new HeapSort();
        userHeap.sort(arrayHeap);
        System.out.println("HeapSort: ");
        print(arrayHeap);

        // MergeSort
        int[] arrayMerge = numeros.clone();
        MergeSoft userMerge = new MergeSoft();
        userMerge.sort(arrayMerge, 0, arrayMerge.length - 1);
        System.out.println("MergeSort: ");
        print(arrayMerge);
    }

    // Metodo para printar em linha reta
    public static void print(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
