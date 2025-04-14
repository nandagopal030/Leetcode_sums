class Solution {
    public int mostFrequentEven(int[] nums) {

        Arrays.sort(nums);
         Map<Integer,Integer> count = new HashMap<>();
         for( int n : nums){
            if(n % 2 == 0){
              count.put(n, count.getOrDefault(n, 0)+ 1);
            }
          }
          int maxFreq = 0;
          int result = -1;

          for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();

            if(freq > maxFreq || (freq == maxFreq && num < result)){
                maxFreq = freq;
                result = num;
            }
          }

        return result;
    }
}