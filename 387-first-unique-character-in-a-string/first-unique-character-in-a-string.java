class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> unique = new HashMap<>();

        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            unique.put(ch,unique.getOrDefault(ch, 0) + 1);
        }
        
        for(int i =0; i<s.length(); i++){
           if(unique.get(s.charAt(i)) == 1){
            return i;
           }
        }
        return -1;
    }
}