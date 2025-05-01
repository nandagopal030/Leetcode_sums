class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();

        for(int i =0; i<charArray.length; i++){
            char curr = charArray[i];
            if(curr == '(') stack.push(')');
            else if(curr == '{') stack.push('}');
            else if( curr == '[') stack.push(']');
            else if(!stack.isEmpty() && stack.peek() == curr )stack.pop();
            else{
                return false;
            }
        } 
        return stack.isEmpty();
    }
}