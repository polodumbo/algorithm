class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int idx = -1;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            // 숫자인 경우
            if (Character.isDigit(c)) {
                idx++;
                
                // 다음 문자가 '0'이고 현재 문자가 '1'인 경우
                if (c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') { 
                    scores[idx] = 10;
                    i++;
                } else {
                    scores[idx] = c - '0';
                }
            }
            // S, D, T
            else if (c == 'S') {
                scores[idx] = (int) Math.pow(scores[idx], 1);
            } else if (c == 'D') {
                scores[idx] = (int) Math.pow(scores[idx], 2);
            } else if (c == 'T') {
                scores[idx] = (int) Math.pow(scores[idx], 3);
            }
            // *, #
            else if (c == '*') {
                // 현재 점수 2배
                scores[idx] *= 2;
                
                // 바로 전에 얻은 점수가 존재한다면 그 점수도 2배
                if (idx > 0) {
                    scores[idx - 1] *= 2;
                }
            } else if (c == '#') {
                // 아차상은 해당 점수를 마이너스로 변경
                scores[idx] *= -1;
            }
        }
        
        // 점수 합산
        int answer = 0;
        
        for (int score : scores) {
            answer += score;
        }
        
        return answer;
    }
}