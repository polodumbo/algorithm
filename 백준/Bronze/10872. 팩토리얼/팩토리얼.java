import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int n = 1;
        if (N != 0) {
            for (int i = N; i >= 1; i--) {
                n *= i;
            }
        }

        System.out.println(n);
        br.close();
    }
}