import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = N / 5; i >= 0; i--) {
            for (int j = 0; j <= N / 3; j++) {
                if (i * 5 + j * 3 == N) {
                    System.out.println(i + j);
                    return;
                }
            }
        }

        System.out.println(-1);
        br.close();
    }
}