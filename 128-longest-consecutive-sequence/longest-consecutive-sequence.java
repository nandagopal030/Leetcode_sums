class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
      

          for(int n : nums){
            set.add(n);
          }
          int longest = 0;
          
          for(int num: set){
             int count = 1;
             if(!set.contains(num-1)){
                while(set.contains(num + 1)){
                    count++;
                    num++;
                }
                longest = Math.max(longest,count);
                System.out.println(longest);
             }
          }
          return longest;

    }
}