package lesson8;

public class Calculytor {
    /*
    1) Модификатор доступа
        public - Виден всему проекту
        ________(пустой) - виден внутри пакета
        private -виден только внутри текущего класса
        protected- виден внутри дочернего класса

    2) static - (ставится или нет)

     */

    public static int summa(int x, int y) {
        int r = 0;
        r = x + y;
        printResult(r,"Сумма");
        return r;
    }

    public static int raznost(int x, int y) {
        int r = 0;
        r = x - y;
        printResult(r,"Разность");
        return r;
    }

    public static int umnojenie(int x, int y) {
        int r = 0;
        r = x * y;
        printResult(r,"Умножение");
        return r;
    }

    public static double delenie(double x, double y) {
        double r = 0;
        r = x / y;
        printResult(r,"Деление");
        return r;
    }

    public static String autor() {
        String s = "Автор данного Чуда Дамир М.Ш";
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
