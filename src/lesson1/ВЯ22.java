package lesson1;

public class ��22 {
    public static void main(String[] args) {
        int a, b, c;

        a = 3;
        b = 4;
        c = 5;
        //��������������
        if (a == b && b == c && c == a) {
            System.out.println("��������������");
        } else if (a != b && b != c && c != a) {
            System.out.println("��������������");
        } else if (a == b && b != c && c != a ||
                a != b && b != c && c == a ||
                a != b && b == c && c != a
        ) {
            System.out.println("��������������");
        }


    }
}
