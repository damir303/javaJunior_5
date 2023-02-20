package lesson9;

public class Krug {
    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double perimetr() {
        //2*pi*r;
        return 2 * Math.PI * r;
    }

    public double ploshad() {
        //pi*r*r;
        return Math.PI * r * r;
    }


}
