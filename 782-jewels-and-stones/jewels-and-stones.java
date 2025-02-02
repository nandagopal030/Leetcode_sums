class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hash = new HashSet<>();
        
        for(char c : jewels.toCharArray()){
            if(hash.add(c)){
            }
        }
        int count =0;
        for(char c : stones.toCharArray()){
            if(hash.contains(c)){
                count++;
            }
        }
        return count;
    }
}