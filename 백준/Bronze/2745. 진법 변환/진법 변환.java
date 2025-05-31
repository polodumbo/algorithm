import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        long d = 0;

        for (int i = 1; i <= N.length(); i++) {
            char c = N.charAt(N.length() - i);
            int n = 0;
            if (c >= 'A' && c <= 'Z') {
                n = (int) c - 55;
            } else {
                n = (int) c - 48;
            }
            d += Math.pow(B, i - 1) * n;
        }

        System.out.println(d);
        br.close();
    }
}