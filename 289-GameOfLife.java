class Solution {
    public void gameOfLife(int[][] board) {
       
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                int life = findLife(i,j,board);
                if(board[i][j] >= 1) {
                    if(life < 2 || life > 3)
                        board[i][j] = 2;
                } else {
                    if(life == 3)
                        board[i][j] = -1;
                }
            }
        }
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 2)
                    board[i][j] = 0;
                else if(board[i][j] == -1)
                    board[i][j] = 1;
            }
        }
    }
    
    
    public int findLife(int x, int y, int[][] board) {
        int count = 0;
        for(int i=x-1; i<x+2; i++) {
            for(int j=y-1; j<y+2; j++) {
                if(!(i==x && j==y) && isLive(board,i,j))
                    count++;
            }
        }
        return count;
    }
    
    public boolean isLive(int[][] board, int i, int j) {
        if(i<0 || j<0 || i>=board.length || j>=board[0].length)
            return false;
        
        if(board[i][j] >= 1)
            return true;
        
        return false;
    }
}