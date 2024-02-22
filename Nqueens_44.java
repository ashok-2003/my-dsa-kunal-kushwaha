public class Nqueens_44 {
    /*
    so here is the question of the n queens here so here we will be given out the chess board of any matrix and we
    have to place the n queens in it such that no queens bisect each other thier so

    this is the backtraking question as here we have to check one by one and have to see what will happpens whcih one
    exucutes prefectly
     */
    public static void main(String[] args) {
        int n = 10;
        boolean[][] board = new boolean[n][n];
//        queens(board,0);

        // this count for as we can see the number of method
        System.out.println(queens(board,0));

    }
    static int queens(boolean[][] board , int row ){
        // so here we are defining the row here as coloumn to har barr kudh se hi count karega so now
        if(row == board.length){
            dispay(board); // so if row so end pe pahuch hai all queens set so dispaly the answer
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if(issafe(board,row,col)){
                board[row][col]=true;
                count+=queens(board,row+1);  // so it will now search for the next row
                board[row][col]= false; // baktraking ends here
            }
        }
        return count;
    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        // so now here we will check whether it is safe to place the queen or not
        // so queens moves in the left right and digonal directions so now we will do for it


        //cheking the vertical  so each time the row cahnge
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }
        // now cheking the digonal left so in digonal left
        // col will increase and row is decrese as it goes up and we have to take the min of row and col for the bound
        // condition
        int leftmax = Math.min(row , col);
        for (int i = 0; i <= leftmax; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        // now cheking for the right digonal so here row will decerease and col also
        int rightmax = Math.min(row , board.length-col-1); // as here we cannot take the col
        for (int i = 0; i <= rightmax; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        // so now these all cases are where queen cannot be placed and we can place the queen in all other cases
        return true;
    }
    static void dispay(boolean[][] board){
        for(boolean[] row : board){
            for(boolean elemnt : row){
                if(elemnt){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

    }
}
