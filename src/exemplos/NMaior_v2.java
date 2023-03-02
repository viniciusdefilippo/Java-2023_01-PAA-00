package exemplos;

public class NMaior_v2 {

    public static int N_maior(int A[], int B[], int n) {

        int pa = 0;
        int pb = 0;
        int i = 0;
        int maior = A[0];
        int cont = 0;

        while (i != n) {
            if (pa < A.length && pb < B.length) {
                if (A[pa] >= B[pb]) {
                    cont++;
                    maior = A[pa];
                    pa++;
                } else {
                    maior = B[pb];
                    pb++;
                }
            } else if (pa >= A.length) {
                maior = B[pb];
                pb++;
            } else {
                maior = A[pa];
                pa++;
            }
            i++;
        }
        //System.out.println("n=" + n + "-cont=" + cont);
        return maior;
    }

    public static void main(String[] args) {

        int A[] = {20, 17, 16, 14, 11, 10, 8, 6, 4, 1};
        int B[] = {19, 18, 15, 13, 12, 9, 7, 5, 3, 2};

        for (int i = 1; i <= (A.length + B.length); i++) {
            System.out.println(i + ":" + N_maior(A, B, i));
        }
    }
}
