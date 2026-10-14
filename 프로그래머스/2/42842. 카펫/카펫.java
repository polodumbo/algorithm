class Solution {
    public int[] solution(int brown, int yellow) {
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                int yellowWidth = yellow / i;
                int yellowHeight = i;
                int tempBrown = (yellowWidth + yellowHeight + 2) * 2;

                if (tempBrown == brown) {
                    return new int[] {yellowWidth + 2, yellowHeight + 2};
                }
            }
        }
        
        return new int[2];
    }
}