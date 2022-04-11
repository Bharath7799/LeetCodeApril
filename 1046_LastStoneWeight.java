import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b-a));
        
        for(int stone: stones) 
            pq.offer(stone);
        
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            
            if(first == second)
                continue;
            
            pq.offer(first - second);
            
            // int diff = first - second;
            // if(diff > 0)
            //     pq.offer(diff);
        }
        
        return pq.size() == 0 ? 0 : pq.peek();
    }
}