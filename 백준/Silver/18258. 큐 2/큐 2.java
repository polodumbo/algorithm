import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        int last = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push")) {
                int n = last = Integer.parseInt(st.nextToken());
                queue.offer(n);
            } else if (s.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (s.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
            } else {
                if (queue.isEmpty()) {
                    sb.append(-1);
                } else if (s.equals("pop")) {
                    sb.append(queue.poll());
                } else if (s.equals("front")) {
                    sb.append(queue.peek());
                } else if (s.equals("back")) {
                    sb.append(last);
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}