package day2.Game;

public class Player {
    char piece;

    public Player(int identifier) {
        if (identifier == 1) {
            this.piece = 'x';
        } else {
            this.piece = 'o';
        }
    }

    public void takeTurn (GameBoard gameBoard, int pos1, int pos2) {
        if (gameBoard.checkIfEmpty(pos1, pos2)) {
            gameBoard.placePiece(pos1, pos2, piece);
        } else {
            System.out.println("position is already taken please enter other coordinates");
        }
    }
}
