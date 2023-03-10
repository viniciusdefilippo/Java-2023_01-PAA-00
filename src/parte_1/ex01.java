package parte_1;

public class ex01 {

    private static int[] vetor;

    public static void main(String[] args) {
        int vetor[] = {50, 48, 4, 89, 44, 12, 57, 63, 1, 74};
        int n = vetor.length;
        System.out.println(findMax(vetor,n));
    }

    public static int findMax(int A[], int n) {
        int max = A[0];
        int i = 1;
        while (i <= n - 1) {
            if (A[i] > max)
                max = A[i];
            i = i + 1;
        }
        return max;
    }

}
