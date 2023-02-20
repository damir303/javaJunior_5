package lesson3;

public class Main3 {
    public static void main(String[] args) {
        int[] a = {32, 34, 12, 1234};

        //посчитать сколько четных и скролько нечетных

        int chet = 0;
        int neChet = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                chet++;
            } else {
                neChet++;
            }
        }
        System.out.println("Четные " + chet);
        System.out.println("HeЧетные " + neChet);

        //Напечатать то что в массиве, через ячейку, и в обратном порядке
        //int[] a = {32, 34, 12, 3, 5, 6, 73, 34,34,67,678,54,56,3456};
        boolean b = true;
        for (int i = a.length - 1; i != 0; i = i - 1) {
            if (b) {
                System.out.println(a[i]);
                b = false;
            } else {
                b = true;
            }
        }
        System.out.println("Конец");

    }
}
