package day2.game;

public class GameBoard {
    final char[][] gameBoard;
    final int size;

    public GameBoard(int size) {
        this.size = size;
        gameBoard = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                gameBoard[i][j] = ' ';
            }
        }
    }
    //Used board printing from geeks for geeks as an example
    public void printBoard() {
        System.out.println();
        System.out.print(" ");
        for (int i = 0; i < size; i++) {
            System.out.print("   " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("  |");
            for (int j = 0; j < size; j++) {
                System.out.print("---|");
            }
            System.out.println();
            for (int j = 0; j < size; j++) {
                if (j == 0) {
                    System.out.print((i + 1) + " | " + gameBoard[i][j] + " ");
                } else {
                    System.out.print("| " + gameBoard[i][j] + " ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.print("  |");
        for (int i = 0; i < size; i++) {
            System.out.print("---|");
        }
        System.out.println();
    }

    public boolean checkIfEmpty(int pos1, int pos2) {
        return gameBoard[pos1][pos2] == ' ';
    }

    public void placePiece(int pos1, int pos2, char piece) {
        gameBoard[pos1][pos2] = piece;
    }

    public boolean checkIfWon(Player player) {
        //check horizontally and vertically
        int mainDiagonalResult = 0;
        int offDiagonalResult = 0;
        for (int i = 0; i < size; i++) {
            int horizontalResult = 0;
            int verticalResult = 0;
            for (int j = 0; j < size; j++) {
                if (gameBoard[j][i] == player.getPiece()) {
                    verticalResult++;
                }
                if (gameBoard[i][j] == player.getPiece()) {
                    horizontalResult++;
                }
                //check main diagonal
                if (i == j) {
                    if (gameBoard[i][j] == player.getPiece())
                        mainDiagonalResult++;
                }
                if (size - i - j - 1 == 0) {
                    if (gameBoard[i][j] == player.getPiece())
                        offDiagonalResult++;
                }
            }
            if (horizontalResult == size || verticalResult == size
                    || mainDiagonalResult == size || offDiagonalResult == size)
                return true;
        }
        return false;
    }
}