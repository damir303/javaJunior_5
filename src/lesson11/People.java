package lesson11;

public class People extends Chelovechestvo  {
    private int rost;
    private String name;
    private String sity;

    public People() {

    }

    public People(int rost, String name, String sity) {
        this.rost = rost;
        this.name = name;
        this.sity = sity;
    }

    public int getRost() {
        return rost;
    }

    public void setRost(int rost) {
        this.rost = rost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }


}
