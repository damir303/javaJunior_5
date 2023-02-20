package lesson21;

public class Otziv {
    private int rate;
    private String coment;

    public Otziv() {
    }

    public Otziv(int rate, String coment) {
        this.rate = rate;
        this.coment = coment;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Otziv otziv = (Otziv) o;

        if (rate != otziv.rate) return false;
        return coment != null ? coment.equals(otziv.coment) : otziv.coment == null;
    }

    @Override
    public int hashCode() {
        int result = rate;
        result = 31 * result + (coment != null ? coment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Otziv{" +
                "rate=" + rate +
                ", coment='" + coment + '\'' +
                '}';
    }
}
