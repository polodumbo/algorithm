import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int min = 0;
        for (int i = M; i <= N; i++) {
            if (Math.sqrt(i) % 1.0 == 0.0) {
                sum += i;
                if (min == 0) {
                    min = i;
                }
            }
        }

        if (min == 0) {
            sb.append(-1);
        } else {
            sb.append(sum).append('\n').append(min);
        }

        System.out.println(sb);
        br.close();
    }
}