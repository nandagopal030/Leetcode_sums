import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> arr = new TreeSet<>();  

      
        for (int num : nums) {
            arr.add(num);
        }

        
        int i = 0;
        for (int num : arr) {
            nums[i++] = num;
        }

        
        return arr.size();
    }
}
