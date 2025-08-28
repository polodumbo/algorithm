import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            List<Integer> scoreList = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                scoreList.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(scoreList);

            int largestGap = 0;
            for (int j = 1; j < scoreList.size(); j++) {
                largestGap = Math.max(largestGap, scoreList.get(j) - scoreList.get(j - 1));
            }

            sb.append("Class ").append(i + 1).append('\n');
            sb.append("Max ").append(scoreList.get(scoreList.size() - 1))
                .append(", Min ").append(scoreList.get(0))
                .append(", Largest gap ").append(largestGap).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}