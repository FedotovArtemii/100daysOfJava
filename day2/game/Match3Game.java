package day2.game;

import java.util.Scanner;

public class Match3Game {
    public static void main(String[] args) {
        int numberOfTurns = 0;
        Scanner scanner = new Scanner(System.in);
        GameBoard gameBoard = new GameBoard(5);
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Player currentPlayer = player1;
        boolean gameEnded = false;
        while (true) {
            gameBoard.printBoard();
            System.out.println("Please enter the coordinates, current player is: " + currentPlayer);
            currentPlayer.takeTurn(gameBoard, scanner);
            numberOfTurns++;
            if (numberOfTurns == (int)Math.pow(gameBoard.size, 2))
                break;
            gameEnded = gameBoard.checkIfWon(currentPlayer);
            if (gameEnded)
                break;
            if (currentPlayer.equals(player1)) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
        gameBoard.printBoard();
        if (gameEnded) {
            System.out.println("Game ended: " + currentPlayer + " won");
        } else {
            System.out.println("Game ended: no turns left");
        }
    }
}
