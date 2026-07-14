class Solution {
    public int solution(int a, int b) {
        int c = b / getGCD(a, b);
        
        while (c % 2 == 0) {
                c /= 2;
        }
        
        while (c % 5 == 0) {
                c /= 5;
        }
        
        return c == 1 ? 1 : 2;
    }
    
    public int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
	
	    return getGCD(b, a % b);
    }
}