class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int width = board[0] / 2;
        int height = board[1] / 2;
        
        for(String str: keyinput) {
            if(str.equals("up") &&  answer[1] < height) {
                answer[1]++;
            } else if (str.equals("down") && answer[1] > -height) {
                answer[1]--;
            }else if (str.equals("left") && answer[0] > -width) {
                answer[0]--;
            }else if (str.equals("right") && answer[0] < width) {
                answer[0]++;
            }
        }

        return answer;
    }
}