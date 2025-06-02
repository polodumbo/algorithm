import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0, min = 0;

        for (int i = M; i <= N; i++) {
            int dCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dCount++;
                }
            }

            if (dCount == 2) {
                if (min == 0) {
                    min = i;
                }
                sum += i;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
        br.close();
    }
}