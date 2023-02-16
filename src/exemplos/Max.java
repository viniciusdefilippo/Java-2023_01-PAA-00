package exemplos;

public class Max {

    public static void main(String[] args) {
        int vetor[] = {50, 48, 4, 89, 44, 12, 57, 63, 1, 74};
        int n = vetor.length;
        System.out.println(max(vetor, n));
    }

    public static int max(int v[], int n) {
        int max = v[0];
        for (int i = 1; i < n; i++)
            if (max < v[i])
                max = v[i];
        return max;
    }
}
