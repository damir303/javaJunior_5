package lesson4;

public class Main4 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];

//        int[][] mas = {
//                {1, 2, 3},
//                {3, 4},
//                {6, 7, 8, 9}
//        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j) % 2 == 0 && (i) % 2 == 0) {
                    System.out.print(arr[i][j] + "  ");
                } else {
                    System.out.print("X  ");
                }
            }
            System.out.println();
        }

    }
}
