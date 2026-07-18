class Solution {
    public int solution(int chicken) {
        int extra = 0;
        int coupon = chicken;
        
        while (coupon >= 10) {
            int order = coupon / 10;
            
            extra += order;
            coupon += order;
            coupon -= order * 10;
        }
        
        return extra;
    }
}