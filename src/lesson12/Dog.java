package lesson12;

public class Dog extends Animal implements Zoo {
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void voice() {
        System.out.println("Собака лает");
    }

    @Override
    public void run() {
        System.out.println("Бежит за палкой");
    }

    @Override
    public void jump() {
        System.out.println("Прыгает на колени");

    }

    public void metit() {
        System.out.println("Собака ведет себя плохо");
    }
}
