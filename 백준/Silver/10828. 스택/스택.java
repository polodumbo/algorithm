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
            String str = st.nextToken();
            int n = 0;
            if (st.hasMoreTokens()) {
                n = Integer.parseInt(st.nextToken());
            }

            switch (str) {
                case "push":
                    stack.add(n);
                    break;
                case "pop":
                    if (stack.empty()) {
                        sb.append(-1);
                    } else {
                        sb.append(stack.pop());
                    }
                    sb.append('\n');
                    break;
                case "size":
                    sb.append(stack.size()).append('\n');
                    break;
                case "empty":
                    if (stack.empty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append('\n');
                    break;
                case "top":
                    if (stack.empty()) {
                        sb.append(-1);
                    } else {
                        sb.append(stack.peek());
                    }
                    sb.append('\n');
                    break;
            }
        }

        System.out.println(sb);
        br.close();
    }
}