package thirdlesson.thirdtask;

public class GameBoard {
    public static void main(String[] args) {
        char[][] board = new char[8][8];

        fillBoard(board);
        outBoard(board);
        System.out.println();
        setQueensFirstRow(board);
        outBoard(board);
        attackOnBoard(board);
    }

    public static void fillBoard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) % 2 != 0){
                    board[i][j] = '#';
                } else {
                    board[i][j] = '.';
                }
            }
        }
    }

    public static void outBoard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%4c", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void setQueensFirstRow(char[][] board){
        for (int i = 0; i < board[0].length; i++) {
            board[0][i] = 'Q';
        }
    }

    public static void attackOnBoard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            int countQueens = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'Q'){
                    countQueens++;
                }
            }
            if (countQueens > 1)
                System.out.println("Ферзи бьют друг друга!");
        }
    }
}
