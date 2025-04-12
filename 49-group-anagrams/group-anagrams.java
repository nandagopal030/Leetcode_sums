class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> map = new HashMap<>();
      
      for(String s : strs){
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a'] += 1;
        }
        String k = Arrays.toString(count);
        map.computeIfAbsent(k, key -> new ArrayList<String>()).add(s);
      }
      return new ArrayList<>(map.values());

    }
}