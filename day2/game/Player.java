package day2.game;

import java.util.Scanner;

public class Player {
    private final String piece;
    private final String name;

    public Player(Scanner scanner) {
        System.out.println("please enter player name ");
        this.name = scanner.next();
        while (true) {
            System.out.println("Please enter a character for player " + name);
            String enteredValue = scanner.next();
            if (enteredValue.length() > 1) {
                System.out.println("Please enter only one character ");
            } else {
                this.piece = enteredValue;
                break;
            }
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

    public String getPiece() {
        return piece;
    }

    @Override
    public String toString() {
        return name;
    }
}
