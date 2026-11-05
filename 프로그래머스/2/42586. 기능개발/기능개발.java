import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int days = (int) Math.ceil((double) remain / speeds[i]);
            
            queue.offer(days);
        }
        
        List<Integer> list = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            int currentDay = queue.poll();
            int count = 1;
            
            while (!queue.isEmpty() && queue.peek() <= currentDay) {
                queue.poll();
                count++;
            }
            
            list.add(count);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}