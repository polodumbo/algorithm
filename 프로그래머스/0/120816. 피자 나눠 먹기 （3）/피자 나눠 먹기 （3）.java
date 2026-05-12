class Solution {
    public int solution(int slice, int n) {
        int pizza = n / slice;
        pizza = n % slice == 0 ? pizza : pizza + 1;
        
        return pizza;
    }
}