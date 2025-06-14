import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 1) {
                int m = Integer.parseInt(st.nextToken());
                stack.add(m);
            } else if (n == 2) {
                if (stack.empty()) {
                    sb.append(-1);
                } else {
                    sb.append(stack.pop());
                }
                sb.append("\n");
            } else if (n == 3) {
                sb.append(stack.size()).append("\n");
            } else if (n == 4) {
                if (stack.empty()) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                sb.append("\n");
            } else if (n == 5) {
                if (stack.empty()) {
                    sb.append(-1);
                } else {
                    sb.append(stack.peek());
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}