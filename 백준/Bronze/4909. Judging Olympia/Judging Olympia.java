import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] scores = new int[6];
            for (int i = 0; i < 6; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(scores);

            if (scores[0] == 0 && scores[5] == 0) {
                break;
            }

            int total = 0;
            for (int i = 1; i < 5; i++) {
                total += scores[i];
            }

            double avg = total / 4.0;
            if (avg == Math.floor(avg)) {
                sb.append((int) avg).append('\n');
            } else {
                sb.append(avg).append('\n');
            }
        }

        System.out.println(sb);
        br.close();
    }
}