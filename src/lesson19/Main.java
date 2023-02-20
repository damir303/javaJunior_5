package lesson19;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse(100,"Vasya",4);

        System.out.println(horse.getName());

        horse.setName("Djamsut");

        System.out.println(horse.getName());



    }
}
