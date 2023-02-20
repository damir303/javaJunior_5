package lesson19;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
//        cat.say();
//        cat.moetsya();
        Dog dog = new Dog();
//        dog.say();
//        dog.aport();

        Belka qwe = new Belka();
//создать переменную qwe с типом Belka которая равно новый обьект Belka
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(qwe);

        for (Animal a : animals) {
            a.say();
            a.run();
        }


    }
}
