class Solution {
    public boolean check(int[] nums) {
        int org = nums[0];
        int count = 0;
        int n = nums.length ;

        for(int i =0; i < nums.length -1; i++){
            if(nums[i] > nums[i+1]){
                count++;
            }
        }

        if(nums[n -1] > nums[0]){
            count++;
        }
        return count <= 1;
    }
}