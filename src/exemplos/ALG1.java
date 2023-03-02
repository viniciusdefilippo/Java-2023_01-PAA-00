package exemplos;

public class ALG1 {
    public static void main(String[] args) {
        int n = 10;
        int temp = 0;
        int cont = 0;
        for (int i = 1; i <= 2; i++)
            for (int j = i; j <= n; j++)
                for (int k = i; k <= j; k++) {
                    temp = temp + i + j + k;
                    cont += 3;
                }
        System.out.println(cont);
    }
}
