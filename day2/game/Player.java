package day2.game;

import java.util.Scanner;

public class Player {
    private final char piece;

    public Player(int identifier) {
        if (identifier == 1) {
            this.piece = 'X';
        } else {
            this.piece = 'O';
        }
    }

    public void takeTurn (GameBoard gameBoard, Scanner scanner) {
        boolean turnIsTaken = false;
        while (!turnIsTaken) {
            int pos1 = scanner.nextInt() - 1;
            int pos2 = scanner.nextInt() - 1;
            if (pos1 > gameBoard.size - 1 || pos2 > gameBoard.size - 1 || pos1 < 0 || pos2 < 0) {
                System.out.println("invalid coordinates try again");
                continue;
            }
            Turn turn = new Turn(piece, pos1, pos2);
            turnIsTaken = turn.attemptTurn(gameBoard);
        }
    }

    public char getPiece() {
        return piece;
    }

    @Override
    public String toString() {
        return String.valueOf(piece);
    }
}
