import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken()); // 거리
            int count = 0;

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                int v = Integer.parseInt(st.nextToken()); // 최고 속도
                int f = Integer.parseInt(st.nextToken()); // 연료
                int c = Integer.parseInt(st.nextToken()); // 시간당 연료 소비량

                if (v * f / c >= D) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}