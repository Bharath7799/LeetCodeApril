import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        // Comment out any one of the Approaches.
        //1. Linear Approach - convert to 1D and solve
//         List<Integer> list = new ArrayList<>();
//         for(int i=0; i<grid.length; i++) {
//             for(int j=0; j<grid[i].length; j++) {
//                 list.add(grid[i][j]);
//             }
//         }
//         int[] ansList = new int[list.size()];
//         for(int i=0; i<list.size(); i++) {
//             ansList[(i+k) % list.size()] = list.get(i);
//         }
        
//         List<List<Integer>> ans = new ArrayList<List<Integer>>();
//         int len=0;
        
//         for(int i=0; i<grid.length; i++) {
//             ans.add(new ArrayList<Integer>());
//             for(int j=0; j<grid[i].length; j++) {
//                 ans.get(i).add(ansList[len++]);
//             }
//         }
        
//         return ans;
        
        //2. 2D Approach
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        k = k % total;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i < m; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for(int j=0; j<n; j++) {
                int index = findIndex(i,j,n,total,k);
                list.add(grid[index/n][index%n]);
            }
            ans.add(list);
        }
        return ans;
    }
    
    public int findIndex(int i, int j, int n, int total, int k) {
        return ((i*n) + j + (total - k)) % total;
    }
}