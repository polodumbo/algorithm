import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            switch (c) {
                case 1:
                case 2:
                    int n = Integer.parseInt(st.nextToken());
                    if (c == 1) {
                        deque.offerFirst(n);
                    } else {
                        deque.offerLast(n);
                    }
                    break;
                case 3:
                case 4:
                case 7:
                case 8:
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                        break;
                    }

                    if (c == 3) {
                        sb.append(deque.pollFirst());
                    } else if (c == 4) {
                        sb.append(deque.pollLast());
                    } else if (c == 7) {
                        sb.append(deque.peekFirst());
                    } else {
                        sb.append(deque.peekLast());
                    }
                    sb.append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        br.close();
    }
}