import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Ballon> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int n = Integer.parseInt(st.nextToken());
            deque.add(new Ballon(i, n));
        }

        Ballon next = deque.poll();
        sb.append(1).append(" ");
        while (deque.size() != 0) {
            if (next.num > 0) {
                for (int i = 0; i < next.num - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                }
                next = deque.pollFirst();
            } else {
                for (int i = next.num; i < -1; i++) {
                    deque.offerFirst(deque.pollLast());
                }
                next = deque.pollLast();
            }
            sb.append(next.idx).append(" ");
        }

        System.out.println(sb);
        br.close();
    }

    public static class Ballon {
        int idx;
        int num;

        public Ballon(int idx, int num) {
            this.idx = idx;
            this.num = num;
        }
    }
}