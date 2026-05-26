import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        BigInteger numerator = factorial(balls);        
        BigInteger denominator = factorial(balls - share).multiply(factorial(share));

        return numerator.divide(denominator).intValue();
    }
    
    private BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        return result;
    }
}