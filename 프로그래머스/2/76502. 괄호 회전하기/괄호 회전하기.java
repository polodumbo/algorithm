import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();
        
        String extended = s + s;
        
        for (int i = 0; i < n; i++) {
            if (isValid(extended, i, n)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    // startIndex부터 길이 n 만큼 올바른 문자열인지
    private boolean isValid(String str, int startIndex, int length) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = startIndex; i < startIndex + length; i++) {
            char c = str.charAt(i);
            
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // 스택이 비어있으면 올바르지 않음
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                // 짝이 맞는지
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        
        return stack.isEmpty();
    }
}