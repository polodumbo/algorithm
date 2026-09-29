import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (!stack.isEmpty() && stack.peekLast() == '(' && c == ')') {
                stack.removeLast();
            } else {
                stack.offerLast(c);
            }
        }

        return stack.isEmpty() ? true : false;
    }
}