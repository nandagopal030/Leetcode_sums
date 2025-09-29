class Solution {
    public int subtractProductAndSum(int n) {
        int pod = 1;
        int sod = 0;
        while( 0 < n){
           int digit = n % 10;
           pod *= digit;
           sod += digit;
           n /= 10;
        }
        return pod - sod;
    }

}