class Solution {
    public boolean isAnagram(String s, String t) {
        
     if(s.length() != t.length()){
        return false;
     }
     char[] aArray = s.toLowerCase().toCharArray();
     char[] bArray = t.toLowerCase().toCharArray();
     Arrays.sort(aArray);
     Arrays.sort(bArray);
     if(Arrays.equals(aArray, bArray)) return true;
     
     return false;
    }
}