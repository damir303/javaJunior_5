package lesson12;

public class Dog extends Animal implements Zoo {
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void voice() {
        System.out.println("������ ����");
    }

    @Override
    public void run() {
        System.out.println("����� �� ������");
    }

    @Override
    public void jump() {
        System.out.println("������� �� ������");

    }

    public void metit() {
        System.out.println("������ ����� ���� �����");
    }
}
