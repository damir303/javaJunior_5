package lesson4;

public class Main {
    public static void main(String[] args) {
        // квадратную таблицу умножения
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j)+" ");
            }
            System.out.println();
        }
    }
}
