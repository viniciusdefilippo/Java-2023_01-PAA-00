package parte_1;

public class MaxMin3 {

    public static void main(String[] args) {
        int v[] = new int[20];
        v[0] = 100; v[1] = 90;
        v[2] = 80;  v[3] = 70;
        v[4] = 60;  v[5] = 50;
        v[6] = 40;  v[7] = 30;
        v[8] = 20;  v[9] = 10;
//        v[10] = 1;

//        v[0] = 0;  v[1] = 10;
//        v[2] = 20; v[3] = 30;
//        v[4] = 40; v[5] = 50;
//        v[6] = 60; v[7] = 70;
//        v[8] = 80; v[9] = 90;
//        v[10] = 100;
        int maxMin[] = maxMin3(v, 10);
        System.out.println("Max:" + maxMin[0]);
        System.out.println("Min:" + maxMin[1]);
    }

    public static int[] maxMin3(int v[], int n) {
        int max, min, FimDoAnel, cont = 0;
        if ((n % 2) > 0) {
            v[n] = v[n - 1];
            FimDoAnel = n;
        } else FimDoAnel = n - 1;
        cont++;
        if (v[0] > v[1]) {
            max = v[0];
            min = v[1];
        } else {
            max = v[1];
            min = v[0];
        }
        int i = 2;
        while (i < FimDoAnel) {
            cont++;
            if (v[i] > v[i + 1]) {
                cont++;
                if (v[i] > max) max = v[i];
                cont++;
                if (v[i + 1] < min) min = v[i + 1];
            } else {
                cont++;
                if (v[i] < min) min = v[i];
                cont++;
                if (v[i + 1] > max) max = v[i + 1];
            }
            i = i + 2;
        }
        int maxMin[] = new int[2];
        maxMin[0] = max;
        maxMin[1] = min;
        System.out.println("Cont:" + cont);
        return maxMin;
    }
}








