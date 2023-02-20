package lesson19;

public class Cat extends Animal{
    @Override
    public void say() {
        System.out.println("Кошка мяучет");
    }

    public void moetsya(){
        System.out.println("Кошка лижет лапку");
    }

    @Override
    public void run() {
        System.out.println("Кошка носится по дому аока никто не видит");
    }
}
