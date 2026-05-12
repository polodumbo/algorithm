class Solution {
    public int solution(int n) {
        int slice = 7;
        int pizza = n / slice;
        
        return n % slice > 0 ? pizza + 1: pizza;
    }
}