class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> count = new HashMap<>();
       for( int n : nums){
        count.put(n, count.getOrDefault(n, 0)+ 1);
       }

       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
        (a , b) -> count.get(b) - count.get(a)
       );
       maxHeap.addAll(count.keySet());

       int[] res = new int[k];

       for(int i =0; i < k; i++){
        res[i] = maxHeap.poll();
       }

       return res;
      
    }
}
