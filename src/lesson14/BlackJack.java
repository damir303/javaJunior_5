package lesson14;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {

        //зациклить и ждать игрока


        Deller deller = new Deller("Крупье");
        Player player = new Player("Дамир");
        Player player2 = new Player("Вася");


        Game blackJack = new Game();

        blackJack.addNewPlayer(deller);
        blackJack.addNewPlayer(player);
        blackJack.addNewPlayer(player2);

        blackJack.dealPlayerCards();

        blackJack.dealMainRound();

        blackJack.printWinner();

    }
}
