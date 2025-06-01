import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            int n = N % B;
            if (n < 10) {
                sb.append((char) (n + '0'));
            } else {
                sb.append((char) (n - 10 + 'A'));
            }
            N /= B;
        }

        System.out.println(sb.reverse());
        br.close();
    }
}