class Solution {
    public int solution(int n) {
        int slice = 6;
        int gcd = getGCD(n, slice);
        
        return n / gcd;
    }
    
    public int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return getGCD(b, a % b);
    }
}