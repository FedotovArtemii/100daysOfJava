package day2.game;

import java.util.Scanner;

public class Match3Game {
    public static void main(String[] args) {
        int numberOfTurns = 0;
        Scanner scanner = new Scanner(System.in);
        GameBoard gameBoard = new GameBoard(3);
        Player player1;
        Player player2;
        while (true) {
            player1 = new Player(scanner);
            player2 = new Player(scanner);
            if (player1.getPiece().equals(player2.getPiece())) {
                System.out.println("You can't use the same character, starting over");
            } else break;
        }
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
