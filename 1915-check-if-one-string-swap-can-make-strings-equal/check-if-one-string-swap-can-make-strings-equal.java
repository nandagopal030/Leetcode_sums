class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       if (s1.equals(s2)) {
            return true; // Already equal
        }
      int first = -1, last = -1;
      int diff = 0;

      for(int i=0; i<s1.length();i++){
        if(s1.charAt(i) != s2.charAt(i) ){
            diff++;

            if(first == -1){
                first = i;
            } else if(last == -1){
                last = i;
            }else{
                return false;
            }
        }
      }
      return (diff == 2) && 
      (s1.charAt(first) == s2.charAt(last)) &&
      (s1.charAt(last) == s2.charAt(first));
        
    }
}