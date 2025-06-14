import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        while (true) {
            String s = br.readLine();
            if (s.equals(".")) break;
            stack.clear();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == ']' || c == '.') {
                    if (stack.isEmpty()) {
                        stack.push(c);
                        break;
                    } else {
                        if ((stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']')) {
                            stack.pop();
                        } else {
                            stack.push(c);
                            break;
                        }
                    }
                }
            }

            if (stack.isEmpty() || (stack.size() == 1 && stack.peek() == '.')) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}