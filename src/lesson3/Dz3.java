package lesson3;

public class Dz3 {
    public static void main(String[] args) {
//        Объединить массив 1 и массив 2.
//        Например а={1,2,3}и b={7,8,9}
//        Обьедененный  массив должен быть {1,7,2,8,3,9}
        int[] a = {1, 2, 3};
        int[] b = {7, 8, 9, 45, 5, 6, 4, 89};

        int[] c = new int[a.length + b.length];

        boolean f = true;
        int ai = 0;
        int bi = 0;
        for (int i = 0; i < c.length; i++) {
            if (ai < a.length) {
                if (f) {
                    c[i] = a[ai];
                    f = false;
                    ai++;
                } else {
                    c[i] = b[bi];
                    f = true;
                    bi++;
                }
            } else {
                c[i] = b[bi];
                bi++;
            }

            System.out.print(c[i]+" ");

        }


    }
}
