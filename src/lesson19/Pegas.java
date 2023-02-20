package lesson19;

public class Pegas extends Horse {
    private String krilo;

    public Pegas() {
    }

    public Pegas(int age, String name, int nogi, String krilo) {
        super(age, name, nogi);
        this.krilo = krilo;
    }

    public String getKrilo() {
        return krilo;
    }

    public void setKrilo(String krilo) {
        this.krilo = krilo;

    }
}
