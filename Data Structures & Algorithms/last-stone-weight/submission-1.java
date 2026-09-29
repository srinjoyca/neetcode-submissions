class Solution {
    public int lastStoneWeight(int[] stones) {
         
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for (int i = 0; i < stones.length; i++) {
            pq.add(0-stones[i]);
        }
        
        while ((pq.size() > 1)) {
            int a = pq.poll();
            int b = pq.poll();
            a = 0-a;
            b = 0-b;
            int c = a-b;
            pq.add(0-c);
            
        }
        return 0-pq.poll();

    }
}
