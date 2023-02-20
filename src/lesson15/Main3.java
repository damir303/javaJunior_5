package lesson15;

import lesson14.IPlayer;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        HashSet<Coins> hash = new HashSet<>();

        Coins coins = new Coins(1,2,"serebro");
        Coins coins1 = new Coins(2,1,"serebro");
        Coins coins2 = new Coins(10,100,"serebro");
        Coins coins3 = new Coins(100,10,"serebro");

        hash.add(coins);
        hash.add(coins1);
        hash.add(coins2);
        hash.add(coins3);



        System.out.println(hash);





    }
}
