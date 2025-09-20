import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int max = 0;
            int maxIdx = -1;
            int count = 0;
            boolean isPresent = false;

            for (int j = 0; j < n; j++) {
                int vote = Integer.parseInt(br.readLine());
                count += vote;

                if (max < vote) {
                    max = vote;
                    maxIdx = j;
                    isPresent = false;
                } else if (max == vote) {
                    isPresent = true;
                }
            }
            maxIdx++;

            if (isPresent) {
                sb.append("no winner");
            } else if (max > count / 2) {
                sb.append("majority winner ").append(maxIdx);
            } else {
                sb.append("minority winner ").append(maxIdx);
            }
            sb.append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}