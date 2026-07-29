import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        
        for (int m = mats.length - 1; m >= 0; m--) {
            int mat = mats[m];
            
            for (int i = 0; i <= park.length - mat; i++) {
                for (int j = 0; j <= park[0].length - mat; j++) {
                    if (isAvailable(park, i, j, mat)) {
                        return mat;
                    }
                }
            }
        }
        
        return -1;
    }
    
    private boolean isAvailable(String[][] park, int x, int y, int size) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        
        return true;
    }
}