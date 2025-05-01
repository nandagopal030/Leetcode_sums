class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);

        int i =0;
        int sum = 0;

        while(i < s.length()){
            int currentVal = hmap.get(s.charAt(i));
            int nextVal = 0;

            if(i + 1 <s.length()){
               nextVal = hmap.get(s.charAt(i + 1));
            }
            if(i + 1 < s.length() && currentVal < nextVal){
                sum += (nextVal - currentVal);
                i+= 2;
            }else{
                sum += currentVal;
                i+=1;
            }
        }
        return sum;
    }
}