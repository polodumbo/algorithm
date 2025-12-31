import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 시간
        int N = Integer.parseInt(br.readLine()); // 사탕 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = 0;

        for (int i = 0; i < N; i++) {
            total += Integer.parseInt(st.nextToken());
        }

        if (total < T) {
            System.out.println("Padaeng_i Cry");
        } else {
            System.out.println("Padaeng_i Happy");
        }
        br.close();
    }
}