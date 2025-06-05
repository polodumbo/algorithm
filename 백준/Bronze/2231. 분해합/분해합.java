import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i < N; i++) {
            int num = i;
            int temp = i;

            while (temp > 0) {
                num += temp % 10;
                temp /= 10;
            }

            if (num == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
        br.close();
    }
}