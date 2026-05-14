class Solution {
    public int solution(int n, int k) {
        int priceLamb = 12000;
        int priceDrink = 2000;
        
        return n * priceLamb + (k - n / 10) * priceDrink;
    }
}