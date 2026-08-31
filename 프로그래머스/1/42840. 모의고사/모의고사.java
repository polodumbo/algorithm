import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자들이 찍는 방식
        int[][] people = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        // 채점
        int[] scores = new int[people.length];
        
        for (int i = 0; i < answers.length; i++) {
            int n = answers[i];
            
            for (int j = 0; j < people.length; j++) {
                if (people[j][i % people[j].length] == n) {
                    scores[j]++;
                }
            }
        }
        
        // 가장 큰 점수와 사람 수
        int maxScore = 0;
        
        for (int score : scores) {
            maxScore = Math.max(score, maxScore);
        }
        
        // list > array
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}