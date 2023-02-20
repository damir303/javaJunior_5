package lesson12.bilet;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Побег из Шоушенка", 2011, "Астрель", "Стивен Кинг", 370);
        Book b2 = new Book("Книжный вор", 2010, "Астрель", "Стивен Кинг", 345);
        Book b3 = new Book("Властелин колец", 2000, "Астрель", "Стивен Кинг", 34563);
        Journal j1 = new Journal("РБК", 1993, "Бизнес-Пресс", 12, 324);
        Journal j2 = new Journal("Цветок", 1857, "Вестник", 23, 364345621);

        PrintPublis[] biblioteka = new PrintPublis[5];

        biblioteka[0] = j2;
        biblioteka[1] = b2;
        biblioteka[2] = b3;
        biblioteka[3] = j1;
        biblioteka[4] = b1;

        for (PrintPublis publ : biblioteka) {
            System.out.println(publ.toString());
        }

        System.out.println();
        System.out.println(PrintPublis.printFatPublish(biblioteka));
        System.out.println();
        System.out.println(PrintPublis.printFatBook(biblioteka));
    }

}
