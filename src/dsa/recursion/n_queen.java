package dsa.recursion;


public class n_queen {
    public static void main(String[] args){

    }

    public static int queens(boolean[][] board , int row , int col){
        if(row == board.length){
            display(board);
            System.out.println(" ");
            return 1;
        }

        int count =0;
        // checking if we can place queen

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,col){
                board[row][col] = true;
                count+=queens(board, row, col);

        }

    }

    private static void display(boolean[][] board){

    }
    private static void
}
