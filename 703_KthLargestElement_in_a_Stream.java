import java.util.*;

class KthLargest {
    private final PriorityQueue<Integer> pq;
    private final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        // for(Integer el: nums) {
        //     add(el);
        // }
        for(int num: nums) {
            //pq.offer(num);
            pq.add(num);
            if(pq.size() > k)
                pq.poll();
        }
    }
    
    public int add(int val) {
        //pq.offer(val);
        pq.add(val);

        if(pq.size() > k)
            pq.poll();
        
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */