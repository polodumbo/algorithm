import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> ticketQueue = new LinkedList<>();
        Stack<Integer> waitStack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            ticketQueue.offer(n);
        }

        int snack = 1;
        while (!ticketQueue.isEmpty()) {
            if (ticketQueue.peek() == snack) {
                ticketQueue.poll();
                snack++;
            } else if (!waitStack.isEmpty() && waitStack.peek() == snack) {
                waitStack.pop();
                snack++;
            } else {
                waitStack.push(ticketQueue.poll());
            }
        }

        while (!waitStack.isEmpty()) {
            if (waitStack.peek() == snack) {
                waitStack.pop();
                snack++;
            } else {
                sb.append("Sad");
                break;
            }
        }

        if (sb.toString().isEmpty()) {
            sb.append("Nice");
        }

        System.out.println(sb);
        br.close();
    }
}