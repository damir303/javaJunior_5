package lesson11;

public class Treugilnik implements IFigura {
    private int b, c;
    private static int a;

    public Treugilnik() {

    }


    public Treugilnik(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public static void setA(int qwe) {
        a = qwe;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


    @Override
    public void perimetr() {

    }

    @Override
    public void ploshad() {

    }


}
