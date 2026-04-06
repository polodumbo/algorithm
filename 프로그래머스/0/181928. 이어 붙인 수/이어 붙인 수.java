class Solution {
    public int solution(int[] num_list) {
        int answer = 0;        
        StringBuilder sbOdd = new StringBuilder();
        StringBuilder sbEven = new StringBuilder();
        
        for (int i = 0; i < num_list.length; i++) {
            int n = num_list[i];
            
            if (n % 2 == 0) {
                sbEven.append(n);
            } else {
                sbOdd.append(n);
            }
        }
        answer = Integer.parseInt(sbEven.toString()) + 
            Integer.parseInt(sbOdd.toString());
        
        return answer;
    }
}