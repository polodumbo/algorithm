class Solution {
    public int solution(int[] numbers, int k) {
        int num = 0;
        int length = numbers.length;
        
        while(k > 1) {
            k--;
            num += 2;
            
            if (num >= length) {
                num -= length;
            }
        }
        
        return numbers[num];
    }
}