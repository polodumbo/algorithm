import java.util.*;

class Solution {
    
    static class Process {
        int index;
        int priority;

        public Process(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(i, priorities[i]));
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            Process current = queue.poll();
            boolean hasHigherPriority = false;

            for (Process p : queue) {
                if (p.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.offer(current);
            } else {
                answer++;
                
                if (current.index == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}