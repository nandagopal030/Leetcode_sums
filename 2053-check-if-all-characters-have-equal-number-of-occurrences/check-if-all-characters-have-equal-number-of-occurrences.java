class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        Map<Character, Integer> hm = new HashMap<>();

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }


        HashSet<Integer> hs = new HashSet<>();

        for(char ch : hm.keySet()){
            hs.add(hm.get(ch));
        }
        return hs.size() == 1;
    }
}