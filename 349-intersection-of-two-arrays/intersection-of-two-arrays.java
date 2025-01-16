class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       ArrayList<Integer> result = new ArrayList<>();
       int previousElement = Integer.MIN_VALUE;

       for(int i =0; i<nums1.length; i++){
        if(previousElement != nums1[i]){
            int left  =0, right = nums2.length -1, mid;

            while(left <= right){
                mid = left + (right - left )/2;
                if(nums1[i] == nums2[mid]){
                    result.add(nums1[i]);
                    break;
                }else if(nums1[i] > nums2[mid]){
                    left = mid +1;
                }else {
                    right = mid -1;
                }
            }
            previousElement = nums1[i];
        }
       }
       int [] arr = new int[result.size()];
       for(int i =0; i<result.size(); i++){
        arr[i] = result.get(i);
       }
       return arr;
    }
}