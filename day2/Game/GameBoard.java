package day2.Game;

public class GameBoard {
    char[][] gameBoard;
    int size;

    public GameBoard(int size) {
        this.size = size;
        gameBoard = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoard[i][j] = '.';
            }
        }
    }

    public void printBoard() {
        StringBuilder rowDivider = new StringBuilder("- ");
        rowDivider.append(" - ".repeat(Math.max(0, size)));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j ++) {
                System.out.print(gameBoard[i][j]);
                if (j + 1 == size)
                    break;
                System.out.print(" | ");
            }
            if (i + 1 == size)
                break;
            System.out.println();
            System.out.println(rowDivider);
        }
    }

    public boolean checkIfEmpty(int pos1, int pos2) {
        return gameBoard[pos1][pos2] == '.';
    }

    public void placePiece(int pos1, int pos2, char piece) {
        gameBoard[pos1][pos2] = piece;
    }
}