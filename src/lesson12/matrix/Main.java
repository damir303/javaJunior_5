package lesson12.matrix;

public class Main {
    public static void main(String[] args) {
        double[][] d1 = {
                {1, 2, 3},
                {4, 5, 6},
        };
        double[][] d2 = {
                {9, 8, 7, 6},
                {5, 4, 3, 2},
                {1, 2, 3, 4}
        };
        Matrix m1 = new Matrix(d1);
        m1.printToConsole();
        System.out.println();
        Matrix m2 = new Matrix(d2);
        m2.printToConsole();

        System.out.println();
        m1.mul(m2).printToConsole();

        System.out.println("Конец");

    }
}
