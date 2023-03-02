package exemplos;

public class NMaior_v1 {
    public static int N_maior(int A[], int B[], int n) {

        int mov = 0;
        int v[] = new int[A.length + B.length];

        for (int i = 0; i < A.length; i++) {
            v[i] = A[i];
            v[i + A.length] = B[i];
            mov += 2;
        }
        INSERTION_SORT(v);
        System.out.println("Movimentações na primeira parte: "+ mov);
        return v[n - 1];
    }

    public static void INSERTION_SORT(int v[]) {
        int i, j, eleito;
        int cont1 = 0, cont2 = 0;
        for (i = 1; i < v.length; i++) {
            eleito = v[i];
            j = i - 1;
            //cont1 ++; // para comparações
            cont1 += 2; // para movimentações
            while (j >= 0 && v[j] < eleito) {
                cont2++; // para movimentações
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = eleito;
        }
        System.out.printf("Fora do while: %d\n", cont1);
        System.out.printf("Dentro do while: %d\n", cont2);
    }

    public static void main(String[] args) {

        int A[] = {10,9,8,7,6};
        int B[] = {5,4,3,2,1};
//        int A[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int B[] = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11};

        for (int i = 1; i <= (A.length + B.length); i++) {
            System.out.println(i + ":" + N_maior(A, B, i));
        }
    }
}
