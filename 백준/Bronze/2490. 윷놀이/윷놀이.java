import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 배(0)의 개수 (0: 모, 1: 도, 2: 개, 3: 걸, 4: 윷)
    private static final char[] YUT_RESULTS = {'E', 'A', 'B', 'C', 'D'};
    private static final int ROUNDS = 3;
    private static final int STICKS = 4;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ROUNDS; i++) {
            String line = br.readLine();

            if (line == null) {
                break;
            }

            StringTokenizer st = new StringTokenizer(line);
            int zeroCount = 0;

            for (int j = 0; j < STICKS && st.hasMoreTokens(); j++) {
                if (st.nextToken().charAt(0) == '0') {
                    zeroCount++;
                }
            }

            sb.append(YUT_RESULTS[zeroCount]).append('\n');
        }

        System.out.print(sb);
    }
}