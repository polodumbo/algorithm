import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 != 0) {
                sum += n;
                if (n < min) {
                    min = n;
                }
            }
        }

        if (sum == 0) {
            sb.append("-1");
        } else {
            sb.append(sum).append('\n').append(min);
        }

        System.out.println(sb);
        br.close();
    }
}