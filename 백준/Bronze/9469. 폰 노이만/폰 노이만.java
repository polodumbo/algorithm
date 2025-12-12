import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int P = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < P; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 테스트 케이스
            double D = Double.parseDouble(st.nextToken()); // 길이
            double A = Double.parseDouble(st.nextToken()); // 기차 A
            double B = Double.parseDouble(st.nextToken()); // 기차 B
            double F = Double.parseDouble(st.nextToken()); // 파리

            sb.append(N).append(' ').append(String.format("%.6f", D / (A + B) * F)).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}