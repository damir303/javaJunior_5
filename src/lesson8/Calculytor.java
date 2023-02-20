package lesson8;

public class Calculytor {
    /*
    1) ����������� �������
        public - ����� ����� �������
        ________(������) - ����� ������ ������
        private -����� ������ ������ �������� ������
        protected- ����� ������ ��������� ������

    2) static - (�������� ��� ���)

     */

    public static int summa(int x, int y) {
        int r = 0;
        r = x + y;
        printResult(r,"�����");
        return r;
    }

    public static int raznost(int x, int y) {
        int r = 0;
        r = x - y;
        printResult(r,"��������");
        return r;
    }

    public static int umnojenie(int x, int y) {
        int r = 0;
        r = x * y;
        printResult(r,"���������");
        return r;
    }

    public static double delenie(double x, double y) {
        double r = 0;
        r = x / y;
        printResult(r,"�������");
        return r;
    }

    public static String autor() {
        String s = "����� ������� ���� ����� �.�";
        return s;
    }

    public static void printAutor() {
        String s = autor();
        System.out.println(s);
    }

    private static void printResult(Object s, String qwe) {
        System.out.println(qwe + " = " + s);
    }
}
