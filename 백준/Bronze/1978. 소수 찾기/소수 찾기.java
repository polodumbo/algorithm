import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            int dCount = 0;

            for (int j = 1; j <= n; j++) {
                if (n % j == 0) {
                    dCount++;
                }
            }

            if (dCount == 2) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}