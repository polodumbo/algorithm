import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Deque<Integer> stack = new ArrayDeque<>();
        // 최상단 인형 위치
        // -1이면 없음
        int[] ceilArr = new int[board.length];
        
        Arrays.fill(ceilArr, -1);
        
        // 최상단 인형 위치
        for (int i = 0; i < ceilArr.length; i++) {
            for (int j = 0; j < ceilArr.length; j++) {
                if (board[j][i] != 0) {
                    ceilArr[i] = j;
                    break;
                }
            }
        }
        
        int answer = 0;
        
        for (int move : moves) {
            int col = move - 1;
            int row = ceilArr[col];
            
            // 뽑을 인형이 없다면
            if (ceilArr[col] == -1) {
                continue;
            }
            
            // 인형 뽑기
            int doll = board[row][col];
            ceilArr[col]++;
            // 인형이 다 뽑혔다면
            if (ceilArr[col] >= board.length) {
                ceilArr[col] = -1;
            }
            
            if (!stack.isEmpty() && stack.peek() == doll) {
                stack.pop();
                answer += 2;
            } else {
                stack.push(doll);
            }
        }
        
        return answer;
    }
}