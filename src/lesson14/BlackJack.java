package lesson14;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {

        //��������� � ����� ������


        Deller deller = new Deller("������");
        Player player = new Player("�����");
        Player player2 = new Player("����");


        Game blackJack = new Game();

        blackJack.addNewPlayer(deller);
        blackJack.addNewPlayer(player);
        blackJack.addNewPlayer(player2);

        blackJack.dealPlayerCards();

        blackJack.dealMainRound();

        blackJack.printWinner();

    }
}
