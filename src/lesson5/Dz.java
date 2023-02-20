package lesson5;

public class Dz {
    public static void main(String[] args) {
        int[][] arr = new int[11][11];

        int a = arr.length / 2;  //3
        int b = a;               //3

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (a == j || b == j) {
                    System.out.print("X  ");
                } else {
                    if ((i + j) % 2 == 1 && !((a < j || b > j))) {
                        System.out.print("X  ");
                    } else {
                        System.out.print("*  ");
                    }
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



//проверка логина и пароля
