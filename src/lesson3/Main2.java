package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] a = {32, 34, 12, 3, 5, 6, 73, 34};
        //вывести все числа
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int[] b = new int[10];
        //нужно заполнить массив четными числами от 50

        System.out.println();


        for (int i = 0; i < b.length; i++) {
            b[i] = i * 2 + 50;
            System.out.println(b[i]);
        }

        //



    }
}
