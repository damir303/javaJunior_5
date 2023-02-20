package lesson4;

public class DZ {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int a = arr.length / 2;
        int b = arr.length / 2;
        for (int i = 0; true; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j < b || j > a) {
                    System.out.print("* ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            if (i < arr.length / 2) {
                a++;
                b--;
            } else {
                a--;
                b++;
            }

            System.out.println();
        }
    }
}
