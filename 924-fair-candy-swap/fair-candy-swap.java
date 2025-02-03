class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int totalSuma =0, totalSumb = 0;

    for(int num : aliceSizes) totalSuma += num;
    for(int num : bobSizes) totalSumb += num;


    int diff = (totalSuma - totalSumb)/ 2;

    HashSet<Integer> bobSet = new HashSet<>();

    for(int num : bobSizes){
        bobSet.add(num);
    }

    for(int x : aliceSizes){
        int y =x -diff;
        if(bobSet.contains(y)){
            return new int[]{x, y};
        }
    }

    return new int[] {};


    }
}