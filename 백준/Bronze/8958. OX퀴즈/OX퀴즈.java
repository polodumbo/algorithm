import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(getScore(br.readLine())).append('\n');
        }

        System.out.println(sb);
        br.close();
    }

    public static int getScore(String testCase) {
        int score = 0;
        int count = 1;
        for (int i = 0; i < testCase.length(); i++) {
            char c = testCase.charAt(i);
            if (c == 'O') {
                score += count++;
            } else {
                count = 1;
            }
        }
        return score;
    }
}