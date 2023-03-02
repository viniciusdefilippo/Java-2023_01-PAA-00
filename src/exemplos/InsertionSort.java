package exemplos;

public class InsertionSort {

    public static void INSERTION_SORT(int v[]) {
        int i, j, eleito;
        int cont1 = 0, cont2 = 0;
        for (i = 1; i < v.length; i++) {
            eleito = v[i];
            j = i - 1;
            //cont1 ++; // para comparações
            cont1 += 2; // para movimentações
            while (j >= 0 && v[j] > eleito) {
                cont2++; // para movimenta��es
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = eleito;
        }
        System.out.printf("Fora do while: %d\n", cont1);
        System.out.printf("Dentro do while: %d\n", cont2);
    }

    public static void main(String[] args) {
//         int v[] = {22, 17, 15, 12, 11, 9, 5, 4, 3, 1}; // pior caso
       int v[] = {1, 3, 4, 5, 9, 11, 12, 15, 17, 22}; // melhor caso
        INSERTION_SORT(v);
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%d ", v[i]);
        }
    }
}
