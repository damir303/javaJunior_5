package lesson4;

public class ArrDouble {
    public static void main(String[] args) {
        int[][] b = {
                {1, 2, 4},      //3
                {4, 4, 44, 4}   //4
        };

        int[][] a = new int[4][7];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
