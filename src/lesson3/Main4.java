package lesson3;

public class Main4 {
    public static void main(String[] args) {
        int[] a123 = {1, 2, 3};
        int[] b4567 = {4, 5, 6, 7};
        //обеденить оба массива в 1
        // ƒќмашка
        int[] c1234567 = new int[7];

        c1234567[0] = a123[0];
        c1234567[1] = a123[1];
        c1234567[2] = a123[2];
        c1234567[3] = b4567[0];
        c1234567[4] = b4567[1];
        c1234567[5] = b4567[2];
        c1234567[6] = b4567[3];

        for (int i = 0; i < c1234567.length; i++) {
            System.out.println(c1234567[i]);
        }


    }
}
