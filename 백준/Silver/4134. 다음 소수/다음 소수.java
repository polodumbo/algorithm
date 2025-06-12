import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(getPrime(Long.parseLong(br.readLine()))).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    public static long getPrime(long a) {
        if (a <= 2) return 2;

        while (true) {
            int count = 0;
            for (long i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) return a;
            a++;
        }
    }
}