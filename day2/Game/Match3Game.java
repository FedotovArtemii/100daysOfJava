package day2.Game;

public class Match3Game {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard(3);
        Player player1 = new Player(2);
        player1.takeTurn(gameBoard, 0, 0);
        System.out.println();
        gameBoard.printBoard();
    }
}
