class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] ans = new int[n][n];
        
        int startRow = 0;
        int endRow = n-1;
        int startColumn = 0;
        int endColumn = n-1;
        
        int count = 1;
        
        while(startRow <= endRow && startColumn <= endColumn) {
            
            for(int i=startColumn; i<=endColumn; i++){
                ans[startRow][i] = count;
                count++;
            }
            startRow++;
            
            for(int i=startRow; i<=endRow; i++){
                ans[i][endColumn] = count;
                count++;
            }
            endColumn--;
            
            for(int i=endColumn; i>=startColumn; i--){
                ans[endRow][i] = count;
                count++;
            }
            endRow--;
            
            for(int i=endRow; i>=startRow; i--){
                ans[i][startColumn] = count;
                count++;
            }
            startColumn++;
        }
        
        return ans;
    }
}