import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int last = num_list[num_list.length - 1];
        int justBefore = num_list[num_list.length - 2];
        
        if (last > justBefore) {
            answer[answer.length - 1] = last - justBefore;
        } else {
            answer[answer.length - 1] = last * 2;
        }
        
        return answer;
    }
}