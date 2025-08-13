class Solution {
    public int removeElement(int[] nums, int value) {
        int index = 0;
        for(int i =0; i< nums.length; i++){
            if(nums[i] != value){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}