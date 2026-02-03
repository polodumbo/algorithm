import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // (꼭짓점의 수) - (모서리의 수) + (면의 수) = 2
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken()); // 꼭짓점
            int E = Integer.parseInt(st.nextToken()); // 모서리
            int F = E - V + 2;

            sb.append(F).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}