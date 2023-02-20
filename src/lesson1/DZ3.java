package lesson1;

public class DZ3 {
    public static void main(String[] args) {
        int money = 1000;
        int bulka = 230;
        int jvch = 26;
        double kon = 2.5;

        int chisloBulok = money / bulka;
        int ostatok1 = money - chisloBulok * bulka; //80
        int chisloJvch = ostatok1 / jvch; //78
        int ostatok2 = ostatok1 - chisloJvch * jvch; //2
        int chisloKon = (int) (ostatok2 / kon);
        int ostatok3 = (int) (ostatok2 - chisloKon * kon); //0

    }
}
