import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> usedWords = new HashSet<>();
        
        usedWords.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1];
            String currentWord = words[i];
            
            // 탈락1: 앞사람의 마지막 글자로 시작 X
            // 탈락2: 이미 사용했던 단어
            boolean isWrongChar = prevWord.charAt(prevWord.length() - 1) != currentWord.charAt(0);
            boolean isDuplicated = usedWords.contains(currentWord);
            
            if (isWrongChar || isDuplicated) {
                // 탈락하는 사람 번호
                int person = (i % n) + 1;
                // 몇 번째 차례
                int turn = (i / n) + 1;
                
                return new int[] { person, turn };
            }
            
            usedWords.add(currentWord);
        }

        return new int[] { 0, 0 };
    }
}