class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int walletMin = Math.min(wallet[0], wallet[1]);
        int walletMax = Math.max(wallet[0], wallet[1]);
        int billMinIdx = bill[0] < bill[1] ? 0 : 1;
        
        // bill의 작은 값이 wallet의 작은 값 보다 크거나 
        // bill의 큰 값이 wallet의 큰 값 보다 큰 동안
        while (bill[billMinIdx] > walletMin ||
              bill[1 - billMinIdx] > walletMax) {
            
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            
            billMinIdx = bill[0] < bill[1] ? 0 : 1;
            answer++;
        }
        
        return answer;
    }
}