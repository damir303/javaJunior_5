package lesson3;

public class DZ1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 1, 2, 1, 2, 3};   //3
        int[] b = {4, 5, 6, 7};//4
        //3              4
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[i - a.length];
            }
            System.out.println(c[i]);
        }

    }
}
