package lesson1;

public class ВЯ22 {
    public static void main(String[] args) {
        int a, b, c;

        a = 3;
        b = 4;
        c = 5;
        //равносторонний
        if (a == b && b == c && c == a) {
            System.out.println("Равносторонний");
        } else if (a != b && b != c && c != a) {
            System.out.println("разносторонний");
        } else if (a == b && b != c && c != a ||
                a != b && b != c && c == a ||
                a != b && b == c && c != a
        ) {
            System.out.println("Равнобедрянный");
        }


    }
}
