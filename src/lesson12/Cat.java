package lesson12;

public class Cat extends  Animal implements Zoo {
    @Override
    public void voice() {
        System.out.println("Кошка мяучет");
    }

    @Override
    public void run() {
        System.out.println("Бежит за едой");

    }

    @Override
    public void jump() {
        System.out.println("Прыгает на стол");

    }

    public void carapaetMebel(){
        System.out.println("Царапает мебель");
    }
}
