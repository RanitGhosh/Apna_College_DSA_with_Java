public class nQueens {


    public static void nQueens(char board[][], int row) {
        // Base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // column loop
        for(int j=0;j<board.length;j++){
            board[row][j] = 'Q'; // Place queen
            nQueens(board,row+1); // Recursive call to place queen in next row
            board[row][j] = 'x'; // Backtrack
        }   
    }

    public static void printBoard(char board[][]) {
        System.out.println("________Chess Board__________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }   

    public static void main(String[] args) {
        int n=2;
        char board[][] = new char[n][n];
        // Initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'x'; 
            }
        }
        nQueens(board,0); // Start from the first row
    }
    
}
