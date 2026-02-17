import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 성냥의 개수
        int W = Integer.parseInt(st.nextToken()); // 박스의 가로
        int H = Integer.parseInt(st.nextToken()); // 박스의 세로
        double diagonal = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));

        for (int i = 0; i < N; i++) {
            int match = Integer.parseInt(br.readLine());
            if (match <= diagonal) {
                sb.append("DA");
            } else {
                sb.append("NE");
            }
            sb.append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}