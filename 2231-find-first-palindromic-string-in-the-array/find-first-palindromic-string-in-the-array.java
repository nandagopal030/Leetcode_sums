class Solution {
    public String firstPalindrome(String[] words) {
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int left = 0;
            int right = word.length() - 1;
            boolean pali = true;

            while (left <= right) {
                if (word.charAt(left) != word.charAt(right)) {
                    pali = false;
                    break;
                }
                left++;
                right--;
            }
            if (pali) {
                return word;
            }
        }
        return "";
    }
}