import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        int n = -1;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (st.hasMoreTokens()) {
                n = Integer.parseInt(st.nextToken());
            }
            switch (str) {
                case "push":
                    queue.offer(n);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.poll());
                    }
                    sb.append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append('\n');
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.peek());
                    }
                    sb.append('\n');
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(n);
                    }
                    sb.append('\n');
                    break;
            }
        }

        System.out.println(sb);
        br.close();
    }
}