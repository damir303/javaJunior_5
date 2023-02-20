package lesson11;

public class Figura implements PrintAll {

    public void perimetr(){
        System.out.println("Периметр Фигуры");
    }
    public void ploshad(){
        System.out.println("Площадь Фигуры");
    }

    @Override
    public void qwe() {
        System.out.println("QWE");
    }

    @Override
    public int dsa() {
        return 0;
    }
}
