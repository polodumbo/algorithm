import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = N;
        int count = 0;

        do {
            int n = M / 10;
            int m = M % 10;

            M = m * 10 + (n + m) % 10;
            count++;
        } while (N != M);

        System.out.println(count);
        br.close();
    }
}