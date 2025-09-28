class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] result = new int[26];
        for(char c : magazine.toCharArray()){
            result[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            if(result[c - 'a'] == 0){
                return false;
            }
            result[c - 'a']--;
        }
        return true;
    }
}