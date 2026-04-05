class Solution {
    public int solution(int[] num_list) {        
        int multi = 1;
        int sum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            int n = num_list[i];
            multi *= n;
            sum += n;
        }
        
        return multi < Math.pow(sum, 2) ? 1 : 0;
    }
}