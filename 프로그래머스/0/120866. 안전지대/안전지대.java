class Solution {    
    public int solution(int[][] board) {
        boolean[][] dangerZone = new boolean[board.length + 2][board.length + 2];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            dangerZone[k][l] = true;
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        
        for (int i = 1; i < dangerZone.length - 1; i++) {
            for (int j = 1; j < dangerZone.length - 1; j++) {
                if (!dangerZone[i][j]) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}