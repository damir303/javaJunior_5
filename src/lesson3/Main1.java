package lesson3;

public class Main1 {
    public static void main(String[] args) {

        int a = 0;

        int[] qwe = new int[23];

        for (int i = 0; i < qwe.length; i++) {
            qwe[i] = i * 2;
        }

        for (int i = 0; i < qwe.length; i++) {
            System.out.println(qwe[i]);
        }


    }
}
