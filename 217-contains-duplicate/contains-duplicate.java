class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
       

        for(int i=0; i<nums.length; i++){
            int target = nums[i];
             int left = i+1;
             int right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }

        }
         return false;
    }
}