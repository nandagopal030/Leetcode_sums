class Solution {
    public boolean isPalindrome(String s) {
     String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    //  System.out.println(cleaned);
    //  return false;
    int start = 0;
    int end = cleaned.length() - 1; 
    while(start < end){
        if(cleaned.charAt(start) == cleaned.charAt(end)){
            start++;
            end--;
        }
        else{
            return false;
        }
    }
    return true;
    }
}
