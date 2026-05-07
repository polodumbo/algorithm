class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        // 00 01 02 03
        // 10 11 12 13
        // 20 21 22 23
        // 30 31 32 33
        
        // 0 ➡️ x y++
        // 1 ⬇️ x++ y
        // 2 ⬅️ x y--
        // 3 ⬆️ x-- y
        
        int order = 0;
        int num = 1;
        int x = 0;
        int y = 0;
        
        // -1 < x < n
        // -1 < y < n
        // 하지만 [3]은 처음 시작할 때 answer[0][0]이 채워져서 (-1 + 1)
        int[] limit = new int[]{n, n, -1, 0};
        
        for (int i = 0; i < 2 * n - 1; i++) {            
            if (order == 0) {
                while (y < limit[order]) {
                    answer[x][y++] = num++;
                }
                x++;
                y--;
                limit[order] = y;
            } else if (order == 1) {
                while (x < limit[order]) {
                    answer[x++][y] = num++;
                }
                x--;
                y--;
                limit[order] = x;
            } else if (order == 2) {
                while (y > limit[order]) {
                    answer[x][y--] = num++;
                }
                x--;
                y++;
                limit[order] = y;
            } else if (order == 3) {
                while (x > limit[order]) {
                    answer[x--][y] = num++;
                }
                x++;
                y++;
                limit[order] = x;
            }
            
            order = (order + 1) % 4;
        }
        
        return answer;
    }
}