package lesson15;

import lesson14.Card;
import lesson14.IPlayer;
import lesson14.Player;

public class Coins  {
    private int val;
    private int diametr;
    private String sostav;

    public Coins() {
    }

    public Coins(int val, int diametr, String sostav) {
        this.val = val;
        this.diametr = diametr;
        this.sostav = sostav;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coins coins = (Coins) o;

        if (val != coins.val) return false;
        if (diametr != coins.diametr) return false;
        return sostav != null ? sostav.equals(coins.sostav) : coins.sostav == null;
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + diametr;
        result = 31 * result + (sostav != null ? sostav.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Coins{" +
                "val=" + val +
                ", diametr=" + diametr +
                ", sostav='" + sostav + '\'' +
                '}';
    }

}
