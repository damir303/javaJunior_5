package lesson19;

public class Dog extends Animal{
    @Override
    public void say() {
        System.out.println("Собака Гавкает");
    }

    public void aport(){
        System.out.println("Собака несет мячик");
    }

    @Override
    public void run() {
        System.out.println("собака лежит поак не кинут мячик");
    }
}
