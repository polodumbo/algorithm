import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (i < K) {
                max += n;
            }
            arr[i] = n;
        }

        int pre = max;
        for (int i = K; i < N; i++) {
            int now = pre + arr[i] - arr[i - K];
            max = Math.max(max, now);
            pre = now;
        }

        System.out.println(max);
        br.close();
    }
}