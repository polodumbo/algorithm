import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d1 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());
            int d3 = Integer.parseInt(st.nextToken());
            int m = 0;

            if (d1 == d2 && d1 == d3) {
                m = 10000 + d1 * 1000;
            } else if (d1 != d2 && d1 != d3 && d2 != d3) {
                m = Math.max(Math.max(d1, d2), d3) * 100;
            } else {
                if (d1 == d2 || d1 == d3) {
                    m = 1000 + d1 * 100;
                } else {
                    m = 1000 + d2 * 100;
                }
            }

            max = Math.max(max, m);
        }

        System.out.println(max);
        br.close();
    }
}