package lesson19;

public class Dog extends Animal{
    @Override
    public void say() {
        System.out.println("������ �������");
    }

    public void aport(){
        System.out.println("������ ����� �����");
    }

    @Override
    public void run() {
        System.out.println("������ ����� ���� �� ����� �����");
    }
}
