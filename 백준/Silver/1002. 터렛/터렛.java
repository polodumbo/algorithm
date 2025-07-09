import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append(-1).append('\n');
                continue;
            }

            double d = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
            if (d > r1 + r2 || Math.max(r1, r2) > Math.min(r1, r2) + d) {
                sb.append(0);
            } else if (d == r1 + r2 || d + Math.min(r1, r2) == Math.max(r1, r2)) {
                sb.append(1);
            } else {
                sb.append(2);
            }
            sb.append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}