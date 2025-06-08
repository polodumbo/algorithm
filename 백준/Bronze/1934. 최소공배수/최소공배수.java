import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int d = 1;
            for (int j = 2; j <= Math.max(A, B); j++) {
                if (A % j == 0 && B % j == 0) {
                    d = j;
                }
            }

            sb.append(A * B / d).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}