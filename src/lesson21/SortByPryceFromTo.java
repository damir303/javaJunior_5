package lesson21;

import java.util.Comparator;

public class SortByPryceFromTo implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getPrice() != o2.getPrice()) {
            return o2.getPrice() - o1.getPrice();
        }
        if (!o1.getName().equals(o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        }
        if (!o1.getOpis().equals(o2.getOpis())) {
            return o1.getOpis().compareTo(o2.getOpis());
        }
        return 0;
    }
}
