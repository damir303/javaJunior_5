package lesson10;

public class Treugolnik {
    private int a;
    private int b;
    private int c;

    public Treugolnik() {
    }

    public Treugolnik(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Treugolnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
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

    public int perimetr() {
        return a + b + c;
    }

    @Override
    public boolean equals(Object o) {  //o - t2
        if (this == o) return true; //this - t1
        if (o == null || getClass() != o.getClass()) return false;

        Treugolnik that = (Treugolnik) o; //that - t2

        if (a != that.a) return false;
        if (b != that.b) return false;
        return c == that.c;
    }

    @Override
    public int hashCode() {
        int result = a;  //4
        result = 31 * result + b;  //3
        result = 31 * result + c;  //5
        return result;  //7632586 !=  7783253
    }

    @Override
    public String toString() {
        return "Treugolnik{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
