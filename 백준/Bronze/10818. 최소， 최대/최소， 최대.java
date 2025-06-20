import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

        sb.append(min).append(" ").append(max);
        System.out.println(sb);
        br.close();
    }
}