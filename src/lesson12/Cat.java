package lesson12;

public class Cat extends  Animal implements Zoo {
    @Override
    public void voice() {
        System.out.println("����� ������");
    }

    @Override
    public void run() {
        System.out.println("����� �� ����");

    }

    @Override
    public void jump() {
        System.out.println("������� �� ����");

    }

    public void carapaetMebel(){
        System.out.println("�������� ������");
    }
}
