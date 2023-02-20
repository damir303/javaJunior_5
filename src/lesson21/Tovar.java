package lesson21;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Tovar implements Comparable<Tovar> {
    private String name;
    private String opis;
    private int price;
    private List<Otziv> otzivs = new ArrayList<>();
    private List<Vopros> vopros = new ArrayList<>();

    public Tovar() {
    }

    public Tovar(String name, String opis, int price) {
        this.name = name;
        this.opis = opis;
        this.price = price;
    }

    public Tovar(String name, String opis, int price, List<Otziv> otzivs, List<Vopros> vopros) {
        this.name = name;
        this.opis = opis;
        this.price = price;
        this.otzivs = otzivs;
        this.vopros = vopros;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(Otziv otziv) {
        this.otzivs.add(otziv);
    }

    public List<Vopros> getVopros() {
        return vopros;
    }

    public void setVopros(Vopros vopros) {
        this.vopros.add(vopros);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (price != tovar.price) return false;
        if (name != null ? !name.equals(tovar.name) : tovar.name != null) return false;
        if (opis != null ? !opis.equals(tovar.opis) : tovar.opis != null) return false;
        if (otzivs != null ? !otzivs.equals(tovar.otzivs) : tovar.otzivs != null) return false;
        return vopros != null ? vopros.equals(tovar.vopros) : tovar.vopros == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (otzivs != null ? otzivs.hashCode() : 0);
        result = 31 * result + (vopros != null ? vopros.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", opis='" + opis + '\'' +
                ", price=" + price +
                ", otzivs=" + otzivs +
                ", vopros=" + vopros +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        if (this.getPrice() != o.getPrice()) {
            return this.getPrice() - o.getPrice();
        }
        if (!this.getName().equals(o.getName())) {
            return this.getName().compareTo(o.getName());
        }
        if (!this.getOpis().equals(o.getOpis())) {
            return this.getOpis().compareTo(o.getOpis());
        }
        return 0;
    }

    public double getAverageRate() {
        int count = otzivs.size(); //0
        if (count == 0)
            return 0;
        else {
            int rate = 0;
            for (Otziv otziv : otzivs) {
                rate += otziv.getRate();
            }
            return rate / count;
        }

    }

}
