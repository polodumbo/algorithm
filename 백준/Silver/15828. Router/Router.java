import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new ArrayDeque<>();
        int size = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        while (n != -1) {
            if (n == 0) {
                queue.poll();
            } else if (queue.size() < size) {
                queue.offer(n);
            }

            n = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        if (queue.isEmpty()) {
            sb.append("empty");
        } else {
            for (int i : queue) {
                sb.append(i).append(' ');
            }
        }

        System.out.println(sb);
        br.close();
    }
}