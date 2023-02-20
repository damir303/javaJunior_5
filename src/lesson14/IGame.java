package lesson14;

public interface IGame {
    void addNewPlayer(Player player);

    boolean startGame();

    void dealPlayerCards();

    void dealMainRound();

    void printWinner();


}
