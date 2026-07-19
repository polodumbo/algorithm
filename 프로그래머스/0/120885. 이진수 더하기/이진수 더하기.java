class Solution {
    public String solution(String bin1, String bin2) {
        int binary1 = Integer.parseInt(bin1, 2);
        int binary2 = Integer.parseInt(bin2, 2);
        
        return Integer.toBinaryString(binary1 + binary2);
    }
}