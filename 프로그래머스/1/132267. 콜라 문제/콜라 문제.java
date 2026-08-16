class Solution {
    public int solution(int a, int b, int n) {
        int result = 0; // 받은 병
        int bottle = n; // 현재 병
        
        while (bottle >= a) {
            int newBottle = bottle / a * b;
            bottle = bottle % a + newBottle;
            result += newBottle;
        }
        
        return result;
    }
}