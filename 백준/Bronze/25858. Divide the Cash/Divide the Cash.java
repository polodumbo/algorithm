import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 팀원 수
        int d = Integer.parseInt(st.nextToken()); // 금액

        int[] problems = new int[n]; // 팀원별 해결 문제 수
        int problemCount = 0; // 총 문제 수
        for (int i = 0; i < n; i++) {
            problems[i] = Integer.parseInt(br.readLine());
            problemCount += problems[i];
        }
        int eachD = d / problemCount; // 문제별 금액

        StringBuilder sb = new StringBuilder();
        for (int problem : problems) {
            sb.append(problem * eachD).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}