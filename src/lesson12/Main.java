package lesson12;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.voice();
        Dog d = new Dog();
        d.voice();


        Animal a1 = new Animal(20, "Слон");
        Dog d1 = new Dog(10, "Собака");

        Cat c = new Cat();

        int[] i = new int[10];
        i[0] = 90;

        Dog[] dd = new Dog[10];
        dd[0] = d;
        dd[1] = d1;
        d.metit();

        Animal[] aa = new Animal[3];
        aa[0] = d;
        aa[1] = c;
        aa[2] = a;


        System.out.println(Zoo.QWE);

        System.out.println();
        for (
                Animal animal : aa) {
            animal.voice();
        }

        System.out.println();
        Zoo[] zz = new Zoo[2];

        zz[0] = c;
        zz[1] = d;
        for (Zoo zoo : zz) {
            zoo.voice();
            zoo.run();
            zoo.jump();
            System.out.println();
        }


    }
}
