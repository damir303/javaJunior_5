package lesson19;

public class Cat extends Animal{
    @Override
    public void say() {
        System.out.println("����� ������");
    }

    public void moetsya(){
        System.out.println("����� ����� �����");
    }

    @Override
    public void run() {
        System.out.println("����� ������� �� ���� ���� ����� �� �����");
    }
}
