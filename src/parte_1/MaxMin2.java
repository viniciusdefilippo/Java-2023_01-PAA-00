package parte_1;

public class MaxMin2 {
    public static int [] maxMin2 (int v[], int n) {
        int max = v[0], min = v[0];
        for (int i = 1; i < n; i++) {
            if (v[i] > max) max = v[i];
            else if (v[i] < min) min = v[i];
        }
        int maxMin[] = new int[2];
        maxMin[0] = max; maxMin[1] = min;
        return maxMin;
    }
    public static void main (String[] args) {
        int v[] = new int[10];
        v[0] = 5;  v[1] = 12;
        v[2] = 4;  v[3] = 1;
        v[4] = 15; v[5] = 22;
        v[6] = 3; v[7] = 11;
        v[8] = 9; v[9] = 17;
        int maxMin[] =  MaxMin2.maxMin2 (v, 10);
        System.out.println ("Max:" + maxMin[0]);
        System.out.println ("Min:" + maxMin[1]);
    }
}
