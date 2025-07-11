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

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서
            int M = Integer.parseInt(st.nextToken()); // 타겟

            Queue<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                // {순서, 중요도}
                queue.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] arr = queue.poll();
                boolean hasBigger = false;

                for (int[] qs : queue) {
                    if (qs[1] > arr[1]) { // 중요도 더 높은 게 있다면
                        hasBigger = true;
                        break;
                    }
                }

                if (hasBigger) {
                    queue.offer(arr);
                } else {
                    count++;
                    if (arr[0] == M) {
                        break;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}