package app.control;

public class Board {
    private int[][] board= new int[3][3];

    public Board(){
        cleanBoard();
    }

    public void cleanBoard(){
        for(int row=0 ; row<3 ; row++)
            for(int column=0 ; column<3 ; column++)
                board[row][column]=0;
    }

    public void showBoard(){
        System.out.println();
        for(int row=0 ; row<3 ; row++){

            for(int column=0 ; column<3 ; column++){

                if(board[row][column]==-1){
                    System.out.print(" X ");
                }
                if(board[row][column]==1){
                    System.out.print(" O ");
                }
                if(board[row][column]==0){
                    System.out.print("   ");
                }

                if(column==0 || column==1)
                    System.out.print("|");
            }
            System.out.println();
        }

    }

    public int getPosition(int[] attempt){
        return board[attempt[0]][attempt[1]];
    }

    public void setPosition(int[] attempt, int player){
        if(player == 1)
            board[attempt[0]][attempt[1]] = -1;
        else
            board[attempt[0]][attempt[1]] = 1;

        showBoard();
    }

    public int checkRows(){
        for(int row=0 ; row<3 ; row++){

            if( (board[row][0] + board[row][1] + board[row][2]) == -3)
                return -1;
            if( (board[row][0] + board[row][1] + board[row][2]) == 3)
                return 1;
        }

        return 0;

    }

    public int checkColumns(){
        for(int column=0 ; column<3 ; column++){

            if( (board[0][column] + board[1][column] + board[2][column]) == -3)
                return -1;
            if( (board[0][column] + board[1][column] + board[2][column]) == 3)
                return 1;
        }

        return 0;

    }

    public int checkDiagonals(){
        if( (board[0][0] + board[1][1] + board[2][2]) == -3)
            return -1;
        if( (board[0][0] + board[1][1] + board[2][2]) == 3)
            return 1;
        if( (board[0][2] + board[1][1] + board[2][0]) == -3)
            return -1;
        if( (board[0][2] + board[1][1] + board[2][0]) == 3)
            return 1;

        return 0;
    }

    public boolean fullBoard(){
        for(int row=0 ; row<3 ; row++)
            for(int column=0 ; column<3 ; column++)
                if( board[row][column]==0 )
                    return false;
        return true;
    }
}