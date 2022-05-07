package day2.game;

public class Turn {
    final String piece;
    final int pos1;
    final int pos2;

    public Turn(String piece, int pos1, int pos2) {
        this.piece = piece;
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    public boolean attemptTurn(GameBoard gameBoard) {
        if (gameBoard.checkIfEmpty(pos1, pos2)) {
            gameBoard.placePiece(pos1, pos2, piece);
            return true;
        } else {
            System.out.println("Place is already taken please try again ");
            return false;
        }
    }
}
