class Solution {
    public long solution(int price, int money, int count) {
        long fee = (long) price * count * (count + 1) / 2;
            
        return Math.max(0, fee - money);
    }
}